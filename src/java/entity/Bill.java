/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author nhuth
 */
public class Bill {
    private int bId;
    private int uId;
    private int pId;
    private String uname;
    private String bname;
    private int bphone;
    private String baddress;
    private String bcity;
    private Timestamp time;
    
    private double total;
    private String pname;
    private int quantity;

    public Bill() {
    }

    public Bill(int bId, int uId, int pId, String uname, String bname, int bphone, String baddress, String bcity, Timestamp time, double total, String pname, int quantity) {
        this.bId = bId;
        this.uId = uId;
        this.pId = pId;
        this.uname = uname;
        this.bname = bname;
        this.bphone = bphone;
        this.baddress = baddress;
        this.bcity = bcity;
        this.time = time;
        this.total = total;
        this.pname = pname;
        this.quantity = quantity;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getBphone() {
        return bphone;
    }

    public void setBphone(int bphone) {
        this.bphone = bphone;
    }

    public String getBaddress() {
        return baddress;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress;
    }

    public String getBcity() {
        return bcity;
    }

    public void setBcity(String bcity) {
        this.bcity = bcity;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Bill{" + "bId=" + bId + ", uId=" + uId + ", pId=" + pId + ", uname=" + uname + ", bname=" + bname + ", bphone=" + bphone + ", baddress=" + baddress + ", bcity=" + bcity + ", time=" + time + ", total=" + total + ", pname=" + pname + ", quantity=" + quantity + '}';
    }

    
    
   
}
