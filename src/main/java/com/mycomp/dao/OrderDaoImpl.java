package com.mycomp.dao;

import com.mycomp.models.Order;
import com.mycomp.models.OrderDetails;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Александр on 01.09.2016.
 */
@Repository
public class OrderDaoImpl implements OrderDao {
    @PersistenceContext
    private EntityManager em;


    public List<Order> getOrders() {
        List<Order> listOrder;

        listOrder = em.createQuery("from Order ",Order.class).getResultList();


        em.close();
        return listOrder;
    }

    public List<OrderDetails> getOrderDetails(long orderId) {
        List<OrderDetails> listDetail;

        listDetail = em.createQuery("from OrderDetails o where o.orderId = :orderId",OrderDetails.class)
                .setParameter("orderId",orderId)
                .getResultList();

        em.close();
        return listDetail;
    }
}
