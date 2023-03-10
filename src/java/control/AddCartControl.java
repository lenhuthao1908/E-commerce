/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Cart;
import entity.Product;
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
            DAO dao = new DAO();
            Product z = null;
            String code = null;
            switch (action) {
                case "AddCart":
                    code = request.getParameter("code");
                    z = dao.getProductByID(code);
                    Product p = new Product(Integer.parseInt(code), z.getName(), z.getImage(), z.getPrice(), z.getTitle(), z.getDescription(), z.getAmount());
                    addtocart(p);
                    session.setAttribute("list", p);
                    System.out.println("size:" + listcart.size());
                    response.sendRedirect("index");
                    break;
                case "DellCart":
                    int id = Integer.parseInt(request.getParameter("id"));
                    listcart.remove(id);
                    response.sendRedirect("index");
                    break;
                case "AddToCart":
                    code = request.getParameter("code");
                    z = dao.getProductByID(code);
                    Product cp = new Product(Integer.parseInt(code), z.getName(), z.getImage(), z.getPrice(), z.getTitle(), z.getDescription(), z.getAmount());
                    addtocartoncart(cp);
                    response.sendRedirect("shop-shopping-cart.jsp");
                    break;
                case "AddToCartOndetail":
                    code = request.getParameter("code");
                    z = dao.getProductByID(code);
                    Product detailcart = new Product(Integer.parseInt(code), z.getName(), z.getImage(), z.getPrice(), z.getTitle(), z.getDescription(), z.getAmount());
                    detailaddcart(detailcart);
                    response.sendRedirect("shop-shopping-cart.jsp");
                    break;
                case "AddToCartOnHome":
                    code = request.getParameter("code");
                    z = dao.getProductByID(code);
                    Product homecart = new Product(Integer.parseInt(code), z.getName(), z.getImage(), z.getPrice(), z.getTitle(), z.getDescription(), z.getAmount());
                    hometocart(homecart);
                    response.sendRedirect("home");
                    break;
            }
        }
    }

    public String addtocart(Product p) {
        for (Cart item : listcart) {
            if (item.getCid().getId() == p.getId()) {
                item.setQuantity(item.getQuantity() + 1);
                return "index";
            }
        }
        Cart c = new Cart();
        c.setCid(p);
        c.setQuantity(1);
        listcart.add(c);
        return "index";
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

    public String detailaddcart(Product p) {
        for (Cart item : listcart) {
            if (item.getCid().getId() == p.getId()) {
                item.setQuantity(item.getQuantity() + 1);
                return "shop-shopping-cart.jsp";
            }
        }
        Cart c = new Cart();
        c.setCid(p);
        c.setQuantity(1);
        listcart.add(c);
        return "shop-shopping-cart.jsp";
    }

    public String hometocart(Product p) {
        for (Cart item : listcart) {
            if (item.getCid().getId() == p.getId()) {
                item.setQuantity(item.getQuantity() + 1);
                return "home";
            }
        }
        Cart c = new Cart();
        c.setCid(p);
        c.setQuantity(1);
        listcart.add(c);
        return "home";
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
