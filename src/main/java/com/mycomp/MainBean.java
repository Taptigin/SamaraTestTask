package com.mycomp;

import com.mycomp.models.Order;
import com.mycomp.models.OrderDetails;
import com.mycomp.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.util.List;

/**
 * Created by Александр on 01.09.2016.
 */
@ManagedBean(name = "mainBean")
@SessionScoped
public class MainBean {

    private ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
    private OrderService service = (OrderService) context.getBean("storageService");



    public List<Order> getOrders(){
        return service.getOrders();
    }

    public List<OrderDetails> getDetails(){
        Long orderId = Long.valueOf(1);
        return service.getOrderDetails(orderId);
    }


}
