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
public class Product {

    private int id;
    private String name;
    private String image;
    private double cost;
    private int sale;
    private double price;
    private int quantity;
    private String title;
    private String description;

    public Product() {
    }

    public Product(String name, String image, double cost, int sale, double price, int quantity, String title, String description) {
        this.name = name;
        this.image = image;
        this.cost = cost;
        this.sale = sale;
        this.price = price;
        this.quantity = quantity;
        this.title = title;
        this.description = description;
    }

    public Product(int id, String name, String image, double cost, int sale, double price, int quantity, String title, String description) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.cost = cost;
        this.sale = sale;
        this.price = price;
        this.quantity = quantity;
        this.title = title;
        this.description = description;
    }

    public Product(int totalQuantity, int totalPrice, int totalProduct, int totalSale) {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", image=" + image + ", cost=" + cost + ", sale=" + sale + ", price=" + price + ", quantity=" + quantity + ", title=" + title + ", description=" + description + '}';
    }

    
}
