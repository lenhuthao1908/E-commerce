/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

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

    public BillDetail() {
    }

    public BillDetail(int BillDetail_id, int Bill_id, int pid, String pname, int quantity, int subtotal) {
        this.BillDetail_id = BillDetail_id;
        this.Bill_id = Bill_id;
        this.pid = pid;
        this.pname = pname;
        this.quantity = quantity;
        this.subtotal = subtotal;
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

    @Override
    public String toString() {
        return   "{OrderBill=" + Bill_id + "(NameProduct=" + pname + ", Quantity=" + quantity + ", Subtotal=" + subtotal + ")}\n  ";
    }
    
    
    
}
