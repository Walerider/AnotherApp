package com.example.anotherapp.JSON;
import java.util.*;
public class Product {
    private int Id;
    private String Name;
    private double Price;
    private int Amount;
    private List<String> Size;
    Product(int id,String name, double price, int amount, List<String> size){
        this.Id = id;
        this.Name = name;
        this.Price = price;
        this.Amount = amount;
        this.Size = size;
    }

}
