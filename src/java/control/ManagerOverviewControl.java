/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
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
@WebServlet(name = "ManagerOverviewControl", urlPatterns = {"/manageroverview"})
public class ManagerOverviewControl extends HttpServlet {

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
        DAO dao = new DAO();
        int totalProduct = dao.getCountProduct();
        int totalSale = dao.getCountSaleProduct();
        int sumQuantity = dao.getSumQuantityProduct();
        int sumPrice = dao.getSumPriceProduct();
        int totalCategory = dao.getCountCategory();
        int totalSize = dao.getCountSize();
        int totalBill = dao.getCountBill();
        int totalBillToday = dao.getCountBillToday();
        int totalBillProcessingToday = dao.getCountBillProcessingToday();
        int totalBillDeliveryToday = dao.getCountBillDeliveryToday();
        int totalBillSuccessfulDeliveryToday = dao.getCountBillSuccessfulDeliveryToday();
        int totalAccountEmployee = dao.getCountEmployee();
        int totalAccountCustomers = dao.getCountCustomers();
        int totalMoneyPresent = dao.getTotalMoneyPresent();
        int totalMoneyIncomePresent = dao.getTotalMoneyIncomePresent();
        int totalMoneyIncomeProcessingToday = dao.getTotalMoneyIncomeProcessingToday();
        int totalMoneyIncomeDeliveryToday = dao.getTotalMoneyIncomeDeliveryToday();
        int totalMoneyIncomeSuccessfulDeliveryToday = dao.getTotalMoneyIncomeSuccessfulDeliveryToday();
        
        
        request.setAttribute("totalProduct", totalProduct);
        request.setAttribute("totalSale", totalSale);
        request.setAttribute("sumQuantity", sumQuantity);
        request.setAttribute("sumPrice", sumPrice);
        request.setAttribute("totalCategory", totalCategory);
        request.setAttribute("totalSize", totalSize);
        request.setAttribute("totalBill", totalBill);
        request.setAttribute("totalBillToday", totalBillToday);
        request.setAttribute("totalBillProcessingToday", totalBillProcessingToday);
        request.setAttribute("totalBillDeliveryToday", totalBillDeliveryToday);
        request.setAttribute("totalBillSuccessfulDeliveryToday", totalBillSuccessfulDeliveryToday);
        request.setAttribute("totalAccountEmployee", totalAccountEmployee);
        request.setAttribute("totalAccountCustomers", totalAccountCustomers);
        request.setAttribute("totalMoneyPresent", totalMoneyPresent);
        request.setAttribute("totalMoneyIncomePresent", totalMoneyIncomePresent);
        request.setAttribute("totalMoneyIncomeProcessingToday", totalMoneyIncomeProcessingToday);
        request.setAttribute("totalMoneyIncomeDeliveryToday", totalMoneyIncomeDeliveryToday);
        request.setAttribute("totalMoneyIncomeSuccessfulDeliveryToday", totalMoneyIncomeSuccessfulDeliveryToday);
        request.getRequestDispatcher("shop-overview.jsp").forward(request, response);
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
