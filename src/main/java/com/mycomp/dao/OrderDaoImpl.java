package com.mycomp.dao;

import com.mycomp.dto.OrderDto;
import com.mycomp.models.Order;
import com.mycomp.models.OrderDetails;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 01.09.2016.
 */
@Repository
public class OrderDaoImpl implements OrderDao {
    @PersistenceContext
    private EntityManager em;

    /**
     * @see OrderDao
     * @return
     */
    public List<OrderDto> getOrders() {
        List<Order> listOrder;

        listOrder = em.createQuery("from Order ",Order.class).getResultList();


        em.close();

        List<OrderDto> listDto = new ArrayList<>();

        for (int i = 0; i < listOrder.size(); i++) {
            OrderDto orderDto = new OrderDto();
            orderDto.setSelected(false);
            orderDto.setId(listOrder.get(i).getId());
            orderDto.setCreatedDate(listOrder.get(i).getCreatedDate());
            orderDto.setCustomerAddress(listOrder.get(i).getCustomerAddress());
            orderDto.setCustomerName(listOrder.get(i).getCustomerName());
            orderDto.setTotalAmount(listOrder.get(i).getTotalAmount());
            listDto.add(orderDto);
        }

        return listDto;
    }

    /**
     * @see OrderDao
     * @param orderId order number
     * @return
     */
    public List<OrderDetails> getOrderDetails(long orderId) {
        List<OrderDetails> listDetail;

        listDetail = em.createQuery("from OrderDetails o where o.orderId = :orderId",OrderDetails.class)
                .setParameter("orderId",orderId)
                .getResultList();

        em.close();
        return listDetail;
    }
}
