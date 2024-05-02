package com.example.myFramework.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemID;


    @Column(name = "item_name")
    private String item_name;

    @Column(name = "item_description")
    private String item_description;

    public void setName(String item_name ){
        this.item_name = item_name;
    }

    public void setDescription(String item_description ){
        this.item_description = item_description;
    }
}
