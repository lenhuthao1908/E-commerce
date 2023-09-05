/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Account;
import entity.Cart;
import entity.Product;
import entity.size;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "AddCartControl", urlPatterns = {"/addcart"})
public class AddCartControl extends HttpServlet {

    public static List<Cart> listcart = new ArrayList<>();

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
            /* TODO output your page here. You may use following sample code. */
            String action = request.getParameter("action");
            HttpSession session = request.getSession();
            session.setAttribute("listcart", listcart);
            Account acc = (Account) session.getAttribute("acc");
            DAO dao = new DAO();
            Product z = null;
            size s = null;
            String code = null;
            switch (action) {
                case "DellCart":
                    int id = Integer.parseInt(request.getParameter("id"));
                    listcart.remove(id);
                    response.sendRedirect("index");
                    break;
                case "AddToCart":
                    code = request.getParameter("code");
                    z = dao.getProductByID(code);
                    Product cp = new Product(Integer.parseInt(code), z.getName(), z.getImage(),z.getCost(), z.getSale(), z.getPrice(),z.getQuantity(), z.getTitle(), z.getDescription());
                    addtocartoncart(cp);
                    response.sendRedirect("shop-shopping-cart.jsp");
                    break;
                case "AddToCartOndetail":
                    code = request.getParameter("code");
                    int size = Integer.parseInt(request.getParameter("size"));
                    int quantity = Integer.parseInt(request.getParameter("quantity"));
                    String link = "./detail?pid=" + code;
                    z = dao.getProductByID(code);
                    s = dao.getSizeById(size);
                    Product detailcart = new Product(Integer.parseInt(code), z.getName(), z.getImage(),z.getCost(), z.getSale(), z.getPrice(),z.getQuantity(), z.getTitle(), z.getDescription());
                    detailaddcart(detailcart, s.getSname(), quantity);

                    response.sendRedirect(link);
                    break;

            }
        }
    }

    

    public String addtocartoncart(Product cp) {
        for (Cart item : listcart) {
            if (item.getCid().getId() == cp.getId()) {
                item.setQuantity(item.getQuantity() + 1);
                return "shop-shopping-cart.jsp";
            }
        }
        return "shop-shopping-cart.jsp";
    }

    public String detailaddcart(Product p, String sname, int quantity) {
        String s = "";
        for (Cart item : listcart) {
            s = item.getSize();
            if (item.getCid().getId() == p.getId() && s.equals(sname) == true) {
                item.setQuantity(item.getQuantity() + quantity);
                return "shop-shopping-cart.jsp";
            }
        }
        Cart c = new Cart();
        c.setCid(p);
        c.setQuantity(quantity);
        c.setSize(sname);
        listcart.add(c);
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
