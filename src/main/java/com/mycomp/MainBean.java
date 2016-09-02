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
import java.util.Date;
import java.util.List;
import java.net.URL;
import java.net.MalformedURLException;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.mycomp.ws.TimeWebService;


/**
 * The Manager bean of the web application
 *
 * Created by Александр on 01.09.2016.
 */
@ManagedBean(name = "mainBean")
@SessionScoped
public class MainBean {
    Long orderId;
    private ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
    private OrderService service = (OrderService) context.getBean("storageService");
    String times;

    /**
     * a method of obtaining time from the web service
     */
    Date getCurTime() throws MalformedURLException{
        URL url = new URL("http://localhost:1986/wss/time?wsdl");
        QName qname = new QName("http://ws.mycomp.com/", "TimeWebServiceImplService");

        Service service = Service.create(url, qname);
        TimeWebService time = service.getPort(TimeWebService.class);
        this.times = time.getTime().toString();
        return time.getTime();
    }

    public String getTime() throws MalformedURLException{
        com.mycomp.endpoint.TimeWebServicePublisher.startTime();
        times = getCurTime().toString();
        return times;
    }



    public void setId(String s){
        orderId = Long.parseLong(s);
    }

    public List<Order> getOrders(){
        return service.getOrders();
    }

    public List<OrderDetails> getDetails(){

        return service.getOrderDetails(orderId);
    }


}
