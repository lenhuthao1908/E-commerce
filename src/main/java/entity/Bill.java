/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author nhuth
 */
public class Bill {
    private int Bill_id;
    private int acc_id;
    private String fullname;
    private int Total;
    private int Phone1;
    private int Phone2;
    private String City;
    private String District;
    private String Ward;
    private String Desbill;
    private Date date;
    private int status;

    public Bill() {
    }

    public Bill(int Bill_id, int acc_id, String fullname, int Total, int Phone1, int Phone2, String City, String District, String Ward, String Desbill, Date date, int status) {
        this.Bill_id = Bill_id;
        this.acc_id = acc_id;
        this.fullname = fullname;
        this.Total = Total;
        this.Phone1 = Phone1;
        this.Phone2 = Phone2;
        this.City = City;
        this.District = District;
        this.Ward = Ward;
        this.Desbill = Desbill;
        this.date = date;
        this.status = status;
    }

    public int getBill_id() {
        return Bill_id;
    }

    public void setBill_id(int Bill_id) {
        this.Bill_id = Bill_id;
    }

    public int getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public int getPhone1() {
        return Phone1;
    }

    public void setPhone1(int Phone1) {
        this.Phone1 = Phone1;
    }

    public int getPhone2() {
        return Phone2;
    }

    public void setPhone2(int Phone2) {
        this.Phone2 = Phone2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String District) {
        this.District = District;
    }

    public String getWard() {
        return Ward;
    }

    public void setWard(String Ward) {
        this.Ward = Ward;
    }

    public String getDesbill() {
        return Desbill;
    }

    public void setDesbill(String Desbill) {
        this.Desbill = Desbill;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    
    @Override
    public String toString() {
        return "Bill{" + "Bill_id=" + Bill_id + ", fullname=" + fullname + ", Total=" + Total + ", Phone1=" + Phone1 + ", Phone2=" + Phone2 + ", City=" + City + ", District=" + District + ", Ward=" + Ward + ", Desbill=" + Desbill + ", date=" + date + ", status=" + status + '}';
    }

    
}
