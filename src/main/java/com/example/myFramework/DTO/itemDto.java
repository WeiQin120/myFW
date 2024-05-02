package com.example.myFramework.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class itemDto {
    public int  getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    @Override
    public String toString() {
        return "itemDTO{" +
                "itemID='" + itemID + '\'' +
                ", item_name='" + item_name + '\'' +
                ", item_description='" + item_description + '\'' +
                '}';
    }

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemID;


    @Column(name = "item_name")
    private String item_name;

    @Column(name = "item_description")
    private String item_description;

    
}
