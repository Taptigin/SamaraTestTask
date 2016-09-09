package com.mycomp.service;

import com.mycomp.dao.OrderDao;
import com.mycomp.dto.OrderDto;
import com.mycomp.models.Order;
import com.mycomp.models.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * implementation of the service OrderService
 *
 * Created by Александр on 01.09.2016.
 */
@Service("storageService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao dao;

    /**
     * @see OrderService
     * @return
     */
    public List<OrderDto> getOrders() {

        return dao.getOrders();
    }
    /**
     * @see OrderService
     * @return
     */
    public List<OrderDetails> getOrderDetails(long orderId) {
        return dao.getOrderDetails(orderId);
    }
}
