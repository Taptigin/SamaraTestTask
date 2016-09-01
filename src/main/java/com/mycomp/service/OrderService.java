package com.mycomp.service;

import com.mycomp.models.Order;
import com.mycomp.models.OrderDetails;

import java.util.List;

/**
 * Created by Александр on 01.09.2016.
 */
public interface OrderService {
    public List<Order> getOrders();

    public List<OrderDetails> getOrderDetails(long orderId);
}
