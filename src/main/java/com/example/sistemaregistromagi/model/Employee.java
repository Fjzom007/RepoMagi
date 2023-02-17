package com.example.sistemaregistromagi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private String ID;
    private String Name;

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
       this.Name = name;
    }

    public String getName() {
        return Name;
    }
}
