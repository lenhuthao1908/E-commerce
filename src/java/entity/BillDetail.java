/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nhuth
 */
public class BillDetail {

    private int BillDetail_id;
    private int Bill_id;
    private int pid;
    private String pname;
    private int quantity;
    private int subtotal;
    private Date date;

    public BillDetail() {
    }

    public BillDetail(int BillDetail_id, int Bill_id, int pid, String pname, int quantity, int subtotal, Date date) {
        this.BillDetail_id = BillDetail_id;
        this.Bill_id = Bill_id;
        this.pid = pid;
        this.pname = pname;
        this.quantity = quantity;
        this.subtotal = subtotal;
        this.date = date;
    }

    public BillDetail(Date date) {
        this.date = date;
    }
    
    public BillDetail(Date date, int subtotal, int quantity) {
        this.date = date;
        this.subtotal = subtotal;
        this.quantity = quantity;
    }

    public int getBillDetail_id() {
        return BillDetail_id;
    }

    public void setBillDetail_id(int BillDetail_id) {
        this.BillDetail_id = BillDetail_id;
    }

    public int getBill_id() {
        return Bill_id;
    }

    public void setBill_id(int Bill_id) {
        this.Bill_id = Bill_id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        return calendar.get(Calendar.MONTH) + 1;
    }

    public int getYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        return calendar.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return "BillDetail{" + "BillDetail_id=" + BillDetail_id + ", Bill_id=" + Bill_id + ", pid=" + pid + ", pname=" + pname + ", quantity=" + quantity + ", subtotal=" + subtotal + ", date=" + date + '}';
    }

}
