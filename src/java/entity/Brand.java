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
public class Brand {
    private int bid;
    private String bname;

    public Brand() {
    }

    public Brand(int bid, String bname) {
        this.bid = bid;
        this.bname = bname;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Brand{" + "bid=" + bid + ", bname=" + bname + '}';
    }
    
    
}
