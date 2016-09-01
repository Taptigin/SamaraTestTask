package com.mycomp.service;

import com.mycomp.dao.OrderDao;
import com.mycomp.models.Order;
import com.mycomp.models.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Александр on 01.09.2016.
 */
@Service("storageService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao dao;

    public List<Order> getOrders() {

        return dao.getOrders();
    }

    public List<OrderDetails> getOrderDetails(long orderId) {
        return dao.getOrderDetails(orderId);
    }
}
