package com.FruitEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Fruit_Class")
public class Fruit_classEntity {

    // fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; 
    private String fruit_name;

    @Column(name="Fruit_color")
    private String color; 
    private int price;

    // no-arg constructor
    public Fruit_classEntity() {
    }

    // Arg constructor
    public Fruit_classEntity(int id, String fruit_name, String color, int price) { 
        super();
        this.id = id;
        this.fruit_name = fruit_name;
        this.color = color;
        this.price = price;
    }

    // Getter and Setter methods
    public int getId() { 
        return id;
    }

    public void setId(int id) { 
        this.id = id;
    }

    public String getFruit_name() {
        return fruit_name;
    }

    public void setFruit_name(String fruit_name) {
        this.fruit_name = fruit_name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price; 
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return "Fruit_classEntity [id=" + id + ", fruit_name=" + fruit_name + ", color=" + color + ", price=" + price + "]";
    }
}
	