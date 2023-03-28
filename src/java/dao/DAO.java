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
        String query = "select * from product";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String query = "select * from account";
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
                        rs.getString(10)));
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
                        rs.getString(5),
                        rs.getString(6)));
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
                        rs.getString(5),
                        rs.getString(6)));
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
                        rs.getString(5),
                        rs.getString(6)));
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
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
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
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> searchByName(String txtSearch) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product\n"
                + "where [name] like ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6)));
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
                        rs.getString(5),
                        rs.getString(6));
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
                        rs.getString(10));
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
                        rs.getString(5),
                        rs.getString(6));
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
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getTop5Last() {
        List<Product> list = new ArrayList<>();
        String query = "select top 5 * from product\n"
                + "WHERE price <= 99\n"
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
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getTop2Last() {
        List<Product> list = new ArrayList<>();
        String query = "select top 2 * from product\n"
                + "WHERE price <= 50\n"
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
                        rs.getString(5),
                        rs.getString(6)));
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
                        rs.getString(5),
                        rs.getString(6)));
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
                        rs.getString(10));
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
                        rs.getString(10));
            }
        } catch (Exception e) {

        }
        return null;
    }

    //create 
    public void singup(String user, String pass, String fullname, int phone, String city, String district, String ward) {
        String query = "insert into Account\n"
                + "values(?,?,0,0,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, fullname);
            ps.setInt(4, phone);
            ps.setString(5, city);
            ps.setString(6, district);
            ps.setString(7, ward);
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

    public void insertProduct(String name, String image, String price,
            String title, String description, String category, int sid) {
        String query = "INSERT [dbo].[product] \n"
                + "([name], [image], [price], [title], [description], [cateID], [sell_ID])\n"
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, description);
            ps.setString(6, category);
            ps.setInt(7, sid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editProduct(String name, String image, String price,
            String title, String description, String category, String pid) {
        String query = "update product\n"
                + "set [name] = ?,\n"
                + "[image] = ?,\n"
                + "price = ?,\n"
                + "title = ?,\n"
                + "[description] = ?,\n"
                + "cateID = ?\n"
                + "where id = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, description);
            ps.setString(6, category);
            ps.setString(7, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertAccount(String user, String pass, int isSell, int isAdmin, String fullname, int phone, String city, String district, String ward) {
        String query = "INSERT [dbo].[Account]([user],[pass],[isSell],[isAdmin], [fullname], [phone], [City], [District], [Ward])\n"
                + "VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setInt(3, isSell);
            ps.setInt(4, isAdmin);
            ps.setString(5, fullname);
            ps.setInt(6, phone);
            ps.setString(7, city);
            ps.setString(8, district);
            ps.setString(9, ward);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editAccount(String user, String pass, int isSell, int isAdmin, String fullname, int phone, String city, String district, String ward, int uID) {
        String query = "update Account\n"
                + "set [user] = ?,\n"
                + "[pass] = ?,\n"
                + "[isSell] = ?,\n"
                + "[isAdmin] = ?,\n"
                + "[fullname] = ?,\n"
                + "[phone] = ?,\n"
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
            ps.setString(7, city);
            ps.setString(8, district);
            ps.setString(9, ward);
            ps.setInt(10, uID);
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

    public void insertCategory(int cid, String cname) {
        String query = "insert Category(cid,cname)\n"
                + "values(?,?);";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, cid);
            ps.setString(2, cname);
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
                    String query2 = "insert BillDetail (Bill_id,pid,pname,quantity,subtotal)\n"
                            + "values(?,?,?,?,?)";
                    conn2 = new DBContext().getConnection(); //mo ket noi voi sql
                    ps2 = conn2.prepareStatement(query2);
                    ps2.setInt(1, bid);
                    ps2.setInt(2, i.getCid().getId());
                    ps2.setString(3, i.getCid().getName());
                    ps2.setInt(4, i.getQuantity());
                    ps2.setDouble(5, i.getCid().getPrice() * i.getQuantity());
                    ps2.executeUpdate();
                }
            }
            // update so luong sp
//            String query3 = "update product set quantity = quantity-? where id = ?";
//            Connection conn3 = new DBContext().getConnection(); //mo ket noi voi sql
//            PreparedStatement ps3 = conn3.prepareStatement(query3);
//            for(Cart i : listcart){
//                //1 -> i getquantity product
//                //2 -> i getid product cart
//                // ps3.executeUpdate();
//            }

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
                        rs.getInt(6)));
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
        String query = "insert Comment(Comment_pid,Comment_aid,Comment_user,Comment_descrsiption,Comment_star)\n"
                + "values(?,?,?,?,?);";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, cm_pid);
            ps.setInt(2, cm_aid);
            ps.setString(3, user);
            ps.setString(4, cm_des);
            ps.setInt(5, cm_star);
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
                        rs.getInt(6)));
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

    public List<Product> paggingProduct(int index) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product\n"
                + "order by id\n"
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
                        rs.getString(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
        }

        return list;

    }

    public static void main(String[] args) {
        DAO dao = new DAO();
//        int count = dao.getCountProduct();
        List<Product> list = dao.paggingProduct(1);
        for (Product o : list) {
            System.out.println(o);
        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list);
//        }
//        System.out.println(count);
    }

}
