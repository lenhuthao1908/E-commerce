/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static control.AddCartControl.listcart;
import dao.DAO;
import entity.Cart;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nhuth
 */
@WebServlet(name = "DelCartControl", urlPatterns = {"/delcart"})
public class DelCartControl extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            String action = request.getParameter("action");
            DAO dao = new DAO();
            String code = null;
            Product del = null;
            switch (action) {
                case "DelCart":
                    code = request.getParameter("code");
                    del = dao.getProductByID(code);
                    Product p = new Product(Integer.parseInt(code), del.getName(), del.getImage(), del.getPrice(), del.getTitle(), del.getDescription(), del.getAmount());

                    removecart(p);
                    response.sendRedirect("shop-shopping-cart.jsp");
                    break;
                case "DelCartP":
                    code = request.getParameter("code");
                    del = dao.getProductByID(code);
                    Product pp = new Product(Integer.parseInt(code), del.getName(), del.getImage(), del.getPrice(), del.getTitle(), del.getDescription(), del.getAmount());

                    removecartP(pp);
                    response.sendRedirect("shop-shopping-cart.jsp");
                    break;
            }
        }
    }

    public String removecart(Product p) {
        for (Cart item : listcart) {
            if (item.getCid().getId() == p.getId() && item.getQuantity() > 1) {
                item.setQuantity(item.getQuantity() - 1);
                return "shop-shopping-cart.jsp";
            } else if (item.getCid().getId() == p.getId() && item.getQuantity() == 1) {
                listcart.remove(item);
                return "shop-shopping-cart.jsp";
            }

        }
        return "shop-shopping-cart.jsp";
    }

    public String removecartP(Product pp) {
        for (Cart item : listcart) {
            if (item.getCid().getId() == pp.getId()) {
                listcart.remove(item);
                return "shop-shopping-cart.jsp";
            }
        }
        return "shop-shopping-cart.jsp";
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
