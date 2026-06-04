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
public class Cart {
    private Product Cid;
    private int aid;
    private int quantity;
    private String size;

    public Cart() {
    }

    public Cart(Product Cid, int aid, int quantity, String size) {
        this.Cid = Cid;
        this.aid = aid;
        this.quantity = quantity;
        this.size = size;
    }

    public Product getCid() {
        return Cid;
    }

    public void setCid(Product Cid) {
        this.Cid = Cid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cart{" + "Cid=" + Cid + ", aid=" + aid + ", quantity=" + quantity + ", size=" + size + '}';
    }

   
    
}
