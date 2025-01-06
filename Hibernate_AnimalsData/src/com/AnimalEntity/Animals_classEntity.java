	package com.AnimalEntity;

	import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="Animals_Class")
	public class Animals_classEntity {
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int animalId;  
	    private String species; // (e.g., Dog, Cat)
	    private int age; 
        @Column(name="Animal_Color")
	    private String color;   
	    private float weight;   

	    // No-arg constructor
	    public Animals_classEntity() {
	    }

	    // Arg constructor
	    public Animals_classEntity(int animalId, String species, int age, String color, float weight) {
	        this.animalId = animalId;
	        this.species = species;
	        this.age = age;
	        this.color = color;
	        this.weight = weight;
	    }

	    // Getter and Setter methods
	    public int getAnimalId() {
	        return animalId;
	    }

	    public void setAnimalId(int animalId) {
	        this.animalId = animalId;
	    }

	    public String getSpecies() {
	        return species;
	    }

	    public void setSpecies(String species) {
	        this.species = species;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
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

	    // toString method 
	    @Override
	    public String toString() {
	        return "AnimalEntity [animalId=" + animalId + ", species=" + species + ", age=" + age + ", color=" + color + ", weight=" + weight + "]";
	    }
	}



