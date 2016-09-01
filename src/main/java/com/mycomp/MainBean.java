package com.mycomp;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 * Created by Александр on 01.09.2016.
 */
@ManagedBean(name = "mainBean")
@SessionScoped
public class MainBean {
    private String inputText;
    String qqq = "qwerty";
    public String getInputText() {
        return inputText;
    }

    public String getQqq() {
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
