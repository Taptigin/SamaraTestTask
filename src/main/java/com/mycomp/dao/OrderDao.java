package com.mycomp.dao;

import com.mycomp.models.Order;
import com.mycomp.models.OrderDetails;

import java.util.List;

/**
 * an interface for receiving orders and details of orders from the database.
 *
 * Created by Александр on 01.09.2016.
 */
public interface OrderDao {
    /**
     * receiving orders
     * @return collection contains the orders type Order
     */
    public List<Order> getOrders();
    /**
     * receiving order details
     * @return collection contains the detail of orders type OrderDerails
     */
    public List<OrderDetails> getOrderDetails(long orderId);
}
