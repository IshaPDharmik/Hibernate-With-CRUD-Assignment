package com.ProductEntity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product_Class")
public class Product_classEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;        
    private long price;
@Column(name="Product_Name")    
    private String name;
    private String category;
    private int quantity;

    // No-arg constructor
    public Product_classEntity() {
    }

    // Arg constructor
    public Product_classEntity(int productId, long price, String name, String category, int quantity) {
        this.productId = productId;
        this.price = price;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    // Getter and Setter methods
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString method 
    @Override
    public String toString() {
        return "ProductEntity [productId=" + productId + ", price=" + price + ", name=" + name + ", category=" + category + ", quantity=" + quantity + "]";
    }
}
