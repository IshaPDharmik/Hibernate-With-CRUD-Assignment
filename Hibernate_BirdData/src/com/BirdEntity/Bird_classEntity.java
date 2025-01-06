package com.BirdEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Birds_Class")
public class Bird_classEntity {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
// Fields
	    private int Id;
	    private String species;
	    @Column(name="Bird_Color")
	    private String color;
	    private float weight;

	    	    
// No-arg constructor
	    public Bird_classEntity() {
	    }

	   
// Arg constructor
	    public Bird_classEntity(int Id, String species, String color, float weight) {
	        super();
	        this.Id = Id;
	        this.species = species;
	        this.color = color;
	        this.weight = weight;
	    }

	    	    
// Getter and Setter methods
	    public int getId() {
	        return Id;
	    }

	    public void setId(int Id) {
	        this.Id = Id;
	    }

	    public String getSpecies() {
	        return species;
	    }

	    public void setSpecies(String species) {
	        this.species = species;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public float getWeight() {
	        return weight;
	    }

	    public void setWeight(float weight) {
	        this.weight = weight;
	    }

	    
	    
// toString 
	    @Override
	    public String toString() {
	        return "Bird_classEntity [Id=" + Id + ", species=" + species + ", color=" + color + ", weight=" + weight + "]";
	    }


		public void setId() {
			
			
		}
	}


