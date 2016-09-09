package com.mycomp;

import com.mycomp.dto.OrderDto;
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
import java.util.ArrayList;
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
    List<OrderDto> list = new ArrayList<>();

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

    /**
     * method of getting time for a web page
     */
    public String getTime() throws MalformedURLException{
        com.mycomp.endpoint.TimeWebServicePublisher.startTime();
        times = getCurTime().toString();
        return times;
    }



    public void setId(String s){
        orderId = Long.parseLong(s);
    }

    /**
     * the method of receiving orders from the database
     * @return List order
     */
    public List<OrderDto> getOrders(){
        list = service.getOrders();
        return list;
    }

    /**
     * method details of the orders
     * @return List order details
     */
    public List<OrderDetails> getDetails(){

        return service.getOrderDetails(orderId);
    }

    private List<OrderDto> selectedDataList;

    // Actions -----------------------------------------------------------------------------------

    public String getSelectedItems() {

        // Get selected items.
        selectedDataList = new ArrayList<OrderDto>();

        for (OrderDto dataItem : list) {
            if (dataItem.isSelected()) {
                selectedDataList.add(dataItem);
                dataItem.setSelected(false); // Reset.

            }
        }

        // Do your thing with the MyData items in List selectedDataList.

        return "selected"; // Navigation case.
    }

    // Getters -----------------------------------------------------------------------------------

    public List<OrderDto> getSelectedDataList() {
        return selectedDataList;
    }


}
