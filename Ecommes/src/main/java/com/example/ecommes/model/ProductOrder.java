package com.example.ecommes.model;


import jakarta.persistence.*;

import javax.swing.*;
import java.time.LocalDate;

public class ProductOrder {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer id;
      private String orderId;
      private LocalDate orderDate;

      @ManyToOne
      private Product product;

      private Double price;

      private Integer quantity;

      @ManyToOne
      private UserDtls user;

      private String state;

      private String paymentType;

      @OneToMany(cascade = CascadeType.ALL)
      private OrderAddress orderAddress;


    public Object getPrice() {
        return price;
    }

    public Object getQuantity() {
        return  quantity;
    }

    public JInternalFrame getProduct() {
        return  getProduct();
    }

    public UserDtls getOrderAddress() {
        return  getOrderAddress();
    }

    public CharSequence getPaymentType() {
        return  getPaymentType();
    }
}
