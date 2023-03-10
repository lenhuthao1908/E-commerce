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
    private int quantity;

    public Cart() {
    }

    public Cart(Product Cid, int quantity) {
        this.Cid = Cid;
        this.quantity = quantity;
    }

    public Product getCid() {
        return Cid;
    }

    public void setCid(Product Cid) {
        this.Cid = Cid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart{" + "Cid=" + Cid + ", quantity=" + quantity + '}';
    }
    
    
}
