package com.mycomp.dto;

import java.sql.Date;

/**
 * Created by Александр on 09.09.2016.
 */
public class OrderDto {
    private boolean selected;
    private Long id;
    private String customerName;
    private String customerAddress;
    private Integer totalAmount;
    private Date createdDate;

    // Getters -----------------------------------------------------------------------------------

    public boolean isSelected() {
        return selected;
    }

    // Setters -----------------------------------------------------------------------------------

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "selected=" + selected +
                ", id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", totalAmount=" + totalAmount +
                ", createdDate=" + createdDate +
                '}';
    }
}
