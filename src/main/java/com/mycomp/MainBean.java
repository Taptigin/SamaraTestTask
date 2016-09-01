package com.mycomp;

import com.mycomp.models.Order;
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
@RequestScoped
//@SessionScoped
public class MainBean {

    private ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
    private OrderService service = (OrderService) context.getBean("storageService");

    private String inputText;
    String qqq = service.getOrders().get(0).getCustomerName();

    public List<Order> getOrders(){
        return service.getOrders();
    }

    public String getInputText() {
        System.out.println(service.getOrders().get(0).getCustomerName());
        return inputText;
    }

    public String getQqq() {
        System.out.println(service.getOrders().get(0).getCustomerName());
        return qqq;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public void showMessage() {
        FacesMessage message = new FacesMessage("Заголовок", "Частичное обновление страницы");
        message.setSeverity(FacesMessage.SEVERITY_INFO); //как выглядит окошко с сообщением
        FacesContext.getCurrentInstance().addMessage(null, message);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Всплывашка", "GrowlMessage"));

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Значение", inputText));
    }
}
