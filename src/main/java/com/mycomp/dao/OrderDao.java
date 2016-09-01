package com.mycomp.dao;

import com.mycomp.models.Order;
import com.mycomp.models.OrderDetails;

import java.util.List;

/**
 * Created by Александр on 01.09.2016.
 */
public interface OrderDao {

    public List<Order> getOrders();

    public List<OrderDetails> getOrderDetails(long orderId);
}
