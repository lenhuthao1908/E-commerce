/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import context.DBContext;
import static control.AddCartControl.listcart;
import entity.Account;
import entity.Bill;
import entity.BillDetail;
import entity.Brand;
import entity.Cart;
import entity.Category;
import entity.Comment;
import entity.Product;
import entity.size;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static javafx.scene.input.KeyCode.N;

/**
 *
 * @author nhuth
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection conn1 = null;
    PreparedStatement ps1 = null;
    ResultSet rs1 = null;
    Connection conn2 = null;
    PreparedStatement ps2 = null;
    ResultSet rs2 = null;
    Connection conn3 = null;
    PreparedStatement ps3 = null;
    ResultSet rs3 = null;

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from product\n"
                + "order by id desc";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String query = "select * from Account\n"
                + "where isSell != 0 or isAdmin != 0;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getTop3() {
        List<Product> list = new ArrayList<>();
        String query = "select top 3 * from product";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getNext3Product(int amount) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT *\n"
                + "  FROM product\n"
                + " ORDER BY id\n"
                + "OFFSET ? ROWS\n"
                + " FETCH NEXT 3 ROWS ONLY";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, amount);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getProductByCID(String cid) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product\n"
                + "where cateID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getProductByBID(String bid) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product\n"
                + "where brandID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, bid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public size getSizeById(int sid) {
        String query = "select * from size\n"
                + "where sid = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, sid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new size(rs.getInt(1),
                        rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> getProductBySellID(int id) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product\n"
                + "where sell_ID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> searchByName(String txtSearch) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT *\n"
                + "FROM product\n"
                + "WHERE LOWER(name) LIKE ? or LOWER(title) LIKE ? or LOWER(id) LIKE ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            ps.setString(2, "%" + txtSearch + "%");
            ps.setString(3, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product getProductByID(String id) {
        String query = "select * from product\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Product getPriceByID(int id) {
        String query = "select Price from product\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account getAccountByID(String uID) {
        String query = "select * from Account\n"
                + "where uID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, uID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select * from Category";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Brand> getAllBrand() {
        List<Brand> list = new ArrayList<>();
        String query = "select * from Brand";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Brand(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<size> getALLSize() {
        List<size> list = new ArrayList<>();
        String query = "select * from size";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new size(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product getLast() {
        String query = "select top 1 * from product\n"
                + "order by id desc";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> getTop3Last() {
        List<Product> list = new ArrayList<>();
        String query = "select top 3 * from product\n"
                + "order by id desc";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getTop5Last() {
        List<Product> list = new ArrayList<>();
        String query = "select top 5 * from product\n"
                + "where price >= 200000 and price <= 400000\n"
                + "order by id desc;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getTop2Last() {
        List<Product> list = new ArrayList<>();
        String query = "select top 2 * from product\n"
                + "WHERE price <= 199999.0 \n"
                + "order by id desc";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getTop4Lowprice() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT TOP 4 * FROM PRODUCT\n"
                + "WHERE price <= 100\n"
                + "ORDER by price desc;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Account login(String user, String pass) {
        String query = "select * from account\n"
                + "where [user] = ?\n"
                + "and pass = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account checkAccountExist(String user) {
        String query = "select * from account\n"
                + "where [user] = ?\n";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11));
            }
        } catch (Exception e) {

        }
        return null;
    }

    //create 
    public void singup(String user, String pass, String fullname, int phone, String email, String city, String district, String ward) {
        String query = "insert into Account\n"
                + "values(?,?,0,0,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, fullname);
            ps.setInt(4, phone);
            ps.setString(5, email);
            ps.setString(6, city);
            ps.setString(7, district);
            ps.setString(8, ward);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteProduct(String pid) {
        String query = "delete from product\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertProduct(String name, String image, String cost, int sale, int quantity,
            String title, String description, String category, int sid) {
        String query = "INSERT [dbo].[product] \n"
                + "([name], [image], [cost], [sale], [price], [quantity], [title], [description], [cateID], [sell_ID])\n"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, cost);
            ps.setInt(4, sale);
            ps.setInt(5, (Integer.parseInt(cost) - (Integer.parseInt(cost) * sale / 100)));
            ps.setInt(6, quantity);
            ps.setString(7, title);
            ps.setString(8, description);
            ps.setString(9, category);
            ps.setInt(10, sid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editProduct(String name, String image, String cost, int sale, int quantity,
            String title, String description, String category, String pid) {
        String query = "update product\n"
                + "set [name] = ?,\n"
                + "[image] = ?,\n"
                + "cost = ?,\n"
                + "sale = ?,\n"
                + "price = ?,\n"
                + "quantity = ?,\n"
                + "title = ?,\n"
                + "[description] = ?,\n"
                + "cateID = ?\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, cost);
            ps.setInt(4, sale);
            ps.setInt(5, (Integer.parseInt(cost) - (Integer.parseInt(cost) * sale / 100)));
            ps.setInt(6, quantity);
            ps.setString(7, title);
            ps.setString(8, description);
            ps.setString(9, category);
            ps.setString(10, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertAccount(String user, String pass, int isSell, int isAdmin, String fullname, int phone, String email, String city, String district, String ward) {
        String query = "INSERT [dbo].[Account]([user],[pass],[isSell],[isAdmin], [fullname], [phone], [Email], [City], [District], [Ward])\n"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setInt(3, isSell);
            ps.setInt(4, isAdmin);
            ps.setString(5, fullname);
            ps.setInt(6, phone);
            ps.setString(7, email);
            ps.setString(8, city);
            ps.setString(9, district);
            ps.setString(10, ward);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editAccount(String user, String pass, int isSell, int isAdmin, String fullname, int phone, String email, String city, String district, String ward, int uID) {
        String query = "update Account\n"
                + "set [user] = ?,\n"
                + "[pass] = ?,\n"
                + "[isSell] = ?,\n"
                + "[isAdmin] = ?,\n"
                + "[fullname] = ?,\n"
                + "[phone] = ?,\n"
                + "[Email] = ?,\n"
                + "[City] = ?,\n"
                + "[District] = ?,\n"
                + "[Ward] = ?\n"
                + "where [uID] = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setInt(3, isSell);
            ps.setInt(4, isAdmin);
            ps.setString(5, fullname);
            ps.setInt(6, phone);
            ps.setString(7, email);
            ps.setString(8, city);
            ps.setString(9, district);
            ps.setString(10, ward);
            ps.setInt(11, uID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editMyAccount(String user, String fullname, int phone, String email, String city, String district, String ward, int uID) {
        String query = "update Account\n"
                + "set [user] = ?,\n"
                + "[fullname] = ?,\n"
                + "[phone] = ?,\n"
                + "[Email] = ?,\n"
                + "[City] = ?,\n"
                + "[District] = ?,\n"
                + "[Ward] = ?\n"
                + "where [uID] = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, fullname);
            ps.setInt(3, phone);
            ps.setString(4, email);
            ps.setString(5, city);
            ps.setString(6, district);
            ps.setString(7, ward);
            ps.setInt(8, uID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteAccount(String uID) {
        String query = "delete from Account\n"
                + "where uID = ?;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, uID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertCategory(String cname) {
        String query = "insert Category\n"
                + "values(?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, cname);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteCategory(int cID) {
        String query = "delete from Category\n"
                + "where cID = ?;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, cID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editCategory(String cname, int cid) {
        String query = "update Category\n"
                + "set cname = ?\n"
                + "where cid = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, cname);
            ps.setInt(2, cid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public Category getCategoryByID(int cID) {
        String query = "select * from Category\n"
                + "where cID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, cID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Category(rs.getInt(1),
                        rs.getString(2));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void AddOrderBill(Bill bill) {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();
        try {
            // order
            String query = "insert bill(Acc_id,Fullname,Total,Phone1,Phone2,City,District,Ward,Desbill,Date,Status)\n"
                    + "values(?,?,?,?,?,?,?,?,?,?,1)";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, bill.getAcc_id());
            ps.setString(2, bill.getFullname());
            ps.setInt(3, bill.getTotal());
            ps.setInt(4, bill.getPhone1());
            ps.setInt(5, bill.getPhone2());
            ps.setString(6, bill.getCity());
            ps.setString(7, bill.getDistrict());
            ps.setString(8, bill.getWard());
            ps.setString(9, bill.getDesbill());
            ps.setString(10, date);
            ps.executeUpdate();

            // get Bill_id
            String query1 = "select top 1 Bill_id from Bill order by Bill_id desc";
            conn1 = new DBContext().getConnection(); //mo ket noi voi sql
            ps1 = conn1.prepareStatement(query1);
            rs1 = ps1.executeQuery();

            // add orderBill
            if (rs1.next()) {
                int bid = rs1.getInt("Bill_id");
                for (Cart i : listcart) {
                    String query2 = "insert BillDetail (Bill_id,pid,pname,quantity,subtotal,Date)\n"
                            + "values(?,?,?,?,?,?)";
                    conn2 = new DBContext().getConnection(); //mo ket noi voi sql
                    ps2 = conn2.prepareStatement(query2);
                    ps2.setInt(1, bid);
                    ps2.setInt(2, i.getCid().getId());
                    ps2.setString(3, i.getCid().getName());
                    ps2.setInt(4, i.getQuantity());
                    ps2.setDouble(5, i.getCid().getPrice() * i.getQuantity());
                    ps2.setString(6, date);
                    ps2.executeUpdate();
                }
            }
//             update so luong sp
            String query3 = "update product set quantity = quantity-? where id = ?";
            Connection conn3 = new DBContext().getConnection(); //mo ket noi voi sql
            PreparedStatement ps3 = conn3.prepareStatement(query3);
            for (Cart i : listcart) {
                //1 -> i getquantity product
                ps3.setInt(1, i.getQuantity());
                //2 -> i getid product cart
                ps3.setInt(2, i.getCid().getId());
                ps3.executeUpdate();
            }

        } catch (Exception e) {
        }
    }

    public List<Bill> getAllOrderBill() {
        List<Bill> list = new ArrayList<>();
        String query = "select * from Bill";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Bill(rs.getInt("Bill_id"),
                        rs.getInt("Acc_id"),
                        rs.getString("Fullname"),
                        rs.getInt("Total"),
                        rs.getInt("Phone1"),
                        rs.getInt("Phone2"),
                        rs.getString("City"),
                        rs.getString("District"),
                        rs.getString("Ward"),
                        rs.getString("Desbill"),
                        rs.getDate("Date"),
                        rs.getInt("Status")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Bill getBillByID(int billid) {
        String query = "select * from Bill\n"
                + "where Bill_id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, billid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Bill(rs.getInt("Bill_id"),
                        rs.getInt("Acc_id"),
                        rs.getString("Fullname"),
                        rs.getInt("Total"),
                        rs.getInt("Phone1"),
                        rs.getInt("Phone2"),
                        rs.getString("City"),
                        rs.getString("District"),
                        rs.getString("Ward"),
                        rs.getString("Desbill"),
                        rs.getDate("Date"),
                        rs.getInt("Status"));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<BillDetail> getBillDetailById(int bid) {
        List<BillDetail> list = new ArrayList<>();
        String query = "select * from BillDetail\n"
                + "where Bill_id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, bid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new BillDetail(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getDate(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<BillDetail> getAllBillDetailInDay() {
        List<BillDetail> list = new ArrayList<>();
        String query = "select Date, sum(subtotal) as subtotal, sum(quantity) as quantity from BillDetail\n"
                + "group by Date\n"
                + "order by Date desc";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new BillDetail(rs.getDate("Date"),
                        rs.getInt("subtotal"),
                        rs.getInt("quantity")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<BillDetail> getAllBillDetailInMonth() {
        List<BillDetail> list = new ArrayList<>();
        String query = "select YEAR(BillDetail.Date) as Year, MONTH(BillDetail.Date) as Month, sum(subtotal) as Subtotal, sum(quantity) as Quantity\n"
                + "from BillDetail\n"
                + "group by YEAR(BillDetail.Date), MONTH(BillDetail.Date)\n"
                + "order by Month desc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int year = rs.getInt("Year");
                int month = rs.getInt("Month");
                int subtotal = rs.getInt("Subtotal");
                int quantity = rs.getInt("Quantity");
                list.add(new BillDetail(new Date(year - 1900, month - 1, 1), subtotal, quantity));
                // tạo đối tượng Date mới với năm = year - 1900 (vì đối tượng Date tính từ năm 1900),
                // tháng = month - 1 (vì tháng bắt đầu từ 0),
                // ngày = 1 (vì chúng ta không cần đến ngày),
                // và tạo đối tượng BillDetail mới với đối tượng Date này và các giá trị khác,
                // sau đó thêm đối tượng BillDetail vào danh sách
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<BillDetail> getAllRevenueAndQuantityInYear() {
        List<BillDetail> list = new ArrayList<>();
        String query = "SELECT YEAR(BillDetail.Date) AS Year, SUM(subtotal) AS Subtotal, SUM(quantity) AS Quantity\n"
                + "FROM BillDetail\n"
                + "GROUP BY YEAR(BillDetail.Date)\n"
                + "ORDER BY Year DESC";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int year = rs.getInt("Year");
                int subtotal = rs.getInt("Subtotal");
                int quantity = rs.getInt("Quantity");
                list.add(new BillDetail(new Date(year - 1900, 0, 1), subtotal, quantity));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void updatepass(String user, String newpass) {
        String query = "update account\n"
                + "set pass = ?\n"
                + "where [user] = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, newpass);
            ps.setString(2, user);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updatestatusbill(int statusbill, int billid) {
        String query = "update Bill\n"
                + "set Status = ?\n"
                + "where Bill_id = ?;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, statusbill);
            ps.setInt(2, billid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addcomment(int cm_pid, int cm_aid, String user, String cm_des, int cm_star) {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();
        try {
            String query = "insert Comment(Comment_pid,Comment_aid,Comment_user,Comment_descrsiption,Comment_star,Date)\n"
                    + "values(?,?,?,?,?,?)";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, cm_pid);
            ps.setInt(2, cm_aid);
            ps.setString(3, user);
            ps.setString(4, cm_des);
            ps.setInt(5, cm_star);
            ps.setString(6, date);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Comment> getCommentById(int pid) {
        List<Comment> list = new ArrayList<>();
        String query = "select * from Comment\n"
                + "where Comment_pid = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Comment(rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getDate(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void deletecomment(int cm_id) {
        String query = "delete from Comment\n"
                + "where Comment_id = ?;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, cm_id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public int getCountProduct() {
        String query = "select count(*) from product";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;

    }

    public int getCountProductCID(int cateID) {
        String query = "select count(*) from product\n"
                + "where cateID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, cateID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;

    }

    public List<Product> paggingProduct(int index) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product\n"
                + "order by id desc\n"
                + "offset ? rows fetch next 6 rows only";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * 6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }

        return list;

    }

    public List<Product> paggingProductCID(int cateid, int index) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product\n"
                + "where cateID = ?\n"
                + "order by id desc\n"
                + "offset ? rows fetch next 6 rows only";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, cateid);
            ps.setInt(2, (index - 1) * 6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9)));
            }
        } catch (Exception e) {
        }

        return list;

    }

    public void addItem(Cart cart) {
        String query = "insert Cart\n"
                + "values(?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, cart.getAid());
            ps.setInt(2, cart.getCid().getId());
            ps.setInt(3, cart.getQuantity());
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public void insertSize(String cname) {
        String query = "insert size\n"
                + "values(?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, cname);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteSize(int sID) {
        String query = "delete from size\n"
                + "where sid = ?;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, sID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editSize(String sname, int sid) {
        String query = "update size\n"
                + "set sname = ?\n"
                + "where sid = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, sname);
            ps.setInt(2, sid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public int getCountSaleProduct() {
        String query = "select count(*) from product\n"
                + "where sale != 0";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getSumQuantityProduct() {
        String query = "SELECT SUM(product.quantity) from product";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getSumPriceProduct() {
        String query = "SELECT SUM(product.price) from product";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getCountCategory() {
        String query = "select count(*) from Category";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getCountSize() {
        String query = "select count(*) from size";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getCountBill() {
        String query = "select count(*) from Bill";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getCountBillToday() {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();

        try {
            String query = "select count(*) from Bill\n"
                    + "where Date = ?";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, date);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getCountBillProcessingToday() {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();

        try {
            String query = "select count(*) from Bill\n"
                    + "where Date = ? and Status = ?";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, date);
            ps.setInt(2, 1);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getCountBillDeliveryToday() {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();

        try {
            String query = "select count(*) from Bill\n"
                    + "where Date = ? and Status = ?";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, date);
            ps.setInt(2, 2);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getCountBillSuccessfulDeliveryToday() {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();

        try {
            String query = "select count(*) from Bill\n"
                    + "where Date = ? and Status = ?";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, date);
            ps.setInt(2, 3);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getCountEmployee() {
        try {
            String query = "select count(*) from Account\n"
                    + "where isAdmin = 1 or isSell = 1";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getCountCustomers() {
        try {
            String query = "select count(*) from Account\n"
                    + "where isAdmin = 0 and isSell = 0";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getTotalMoneyPresent() {
        try {
            String query = "select sum(product.price * product.quantity) from product";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getTotalMoneyIncomePresent() {
        try {
            String query = "select sum(BillDetail.subtotal) from BillDetail\n"
                    + "join Bill on BillDetail.Bill_id = Bill.Bill_id and Bill.Status = 3";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getTotalMoneyIncomeProcessingToday() {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();
        try {
            String query = "select sum(BillDetail.subtotal) from BillDetail\n"
                    + "join Bill on BillDetail.Bill_id = Bill.Bill_id and Bill.Status = 1 and Bill.Date = ?";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, date);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getTotalMoneyIncomeDeliveryToday() {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();
        try {
            String query = "select sum(BillDetail.subtotal) from BillDetail\n"
                    + "join Bill on BillDetail.Bill_id = Bill.Bill_id and Bill.Status = 2 and Bill.Date = ?";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, date);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public int getTotalMoneyIncomeSuccessfulDeliveryToday() {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();
        try {
            String query = "select sum(BillDetail.subtotal) from BillDetail\n"
                    + "join Bill on BillDetail.Bill_id = Bill.Bill_id and Bill.Status = 3 and Bill.Date = ?";
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, date);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public static void main(String[] args) {
//        DAO dao = new DAO();
//        List<size> list = dao.getSizeById(3);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list);
//        }
//        int count = dao.getCountProduct();
//        List<Product> list = dao.paggingProduct(1);
//        for (Product o : list) {
//            System.out.println(o);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list);
//        }
//        System.out.println(count);

//        Product p = new Product();
//        p.setId(2);
//        Cart c = new Cart();
//        c.setAid(2);
//        c.setCid(p);
//        c.setQuantity(2);
//
//        dao.addItem(c);
    }

}
