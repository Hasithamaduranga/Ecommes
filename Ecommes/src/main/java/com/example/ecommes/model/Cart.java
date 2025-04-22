package com.example.ecommes.model;


import jakarta.persistence.*;

public class Cart {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;

     @ManyToOne
     private UserDtls user;

     @ManyToOne
     private Product product;

     private Integer quantity;

     @Transient
     private Double totalPrice;

     @Transient
     private Double totalOrderPrice;

    public Double getTotalOrderPrice() {
         return  totalOrderPrice;
    }

     public void setProduct(Product product) {
     }

    public void setUser(UserDtls userDtls) {
    }

    public void setQuantity(int i) {
    }

    public void setTotalPrice(double v) {

    }

    public int getQuantity() {
    }

    public Object getProduct() {
    }
}
