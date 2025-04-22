package com.example.ecommes.Service;


import com.example.ecommes.model.Cart;

import java.util.List;

public interface CartService {

    public Cart saveCart(Integer productId,  Integer userId);

    public List<Cart>  getAllCartByUser(Integer  userId);

    public Integer getCountCart(Integer userId);

    public void updateQuantity(String sy, Integer cid);

    List<Cart> getCartsByUser(Integer id);
}
