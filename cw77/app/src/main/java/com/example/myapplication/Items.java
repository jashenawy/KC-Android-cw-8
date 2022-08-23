package com.example.myapplication;

import java.io.Serializable;

public class Items implements Serializable {
    private String itemNme;
    private int itemImage;
    private double itemPrice;

    public String getItemNme() {
        return itemNme;
    }

    public void setItemNme(String itemNme) {
        this.itemNme = itemNme;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Items(String itemNme, int itemImage, double itemPrice) {
        this.itemNme = itemNme;
        this.itemImage = itemImage;
        this.itemPrice = itemPrice;
    }
}
