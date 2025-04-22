package com.example.ecommes.Service;


import com.example.ecommes.model.OrderRequest;
import com.example.ecommes.model.Product;
import com.example.ecommes.model.ProductOrder;
import org.springframework.data.domain.Page;

import java.util.List;

public interface OrderService {

    public void saveOrder(Integer userId, OrderRequest orderRequest) throws Exception;

    public List<ProductOrder> getOrderByUser(Integer userId);

    public List<ProductOrder> getAllOrders();

    public ProductOrder getOrderByOrderId(String orderId);

    public Page<ProductOrder> getAllOrdersPagination(Integer pageNo, Integer pageSize);

    public ProductOrder updateOrderStatus(Integer userId);

    List<ProductOrder> getOrdersByUser(Integer id);

    ProductOrder getOrdersByOrderId(String trim);
}
