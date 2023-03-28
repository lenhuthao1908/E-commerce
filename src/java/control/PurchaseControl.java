/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static control.AddCartControl.listcart;
import dao.DAO;
import entity.Account;
import entity.Bill;
import entity.BillDetail;
import entity.Cart;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static javafx.scene.input.KeyCode.N;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author nhuth
 */
@WebServlet(name = "PurchaseControl", urlPatterns = {"/purchase"})
public class PurchaseControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        // save cart --> bill & bill detail
        try {
            int phone2 = Integer.parseInt(request.getParameter("phone2"));
            String city = request.getParameter("city");
            String district = request.getParameter("district");
            String ward = request.getParameter("ward");
            String desbill = request.getParameter("desbill");
            HttpSession session = request.getSession();
            Account acc = (Account) session.getAttribute("acc");

//            int acc = Integer.parseInt(request.getParameter("acc"));
            double total = 0;
            DAO dao = new DAO();
            for (int i = 0; i < AddCartControl.listcart.size(); i++) {
                Cart cart = AddCartControl.listcart.get(i);
                total = total + (cart.getQuantity() * cart.getCid().getPrice());
            }

            if (AddCartControl.listcart.size() > 0) {

                Bill bill = new Bill();
                bill.setAcc_id(acc.getId());
                bill.setFullname(acc.getFullname());
                bill.setTotal((int) total);
                bill.setPhone1(acc.getPhone());
                bill.setPhone2(phone2);
                bill.setCity(city);
                bill.setDistrict(district);
                bill.setWard(ward);
                bill.setDesbill(desbill);
                dao.AddOrderBill(bill);
            }
            listcart.removeAll(listcart);
            response.sendRedirect("home");
        } catch (Exception e) {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
