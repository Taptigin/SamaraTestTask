package com.mycomp.models;

import javax.persistence.*;
import java.sql.Date;

/**
 * the entity class which the table orders from the database
 *
 * Created by Александр on 01.09.2016.
 */
@Entity
@Table(name = "ordertable")
public class Order {
    private Long id;
    private String customerName;
    private String customerAddress;
    private Integer totalAmount;
    private Date createdDate;

    /**
     *
     * @return id from table "orderTable"
     */
    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return customerName from table "orderTable"
     */
    @Basic
    @Column(name = "customername")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     *
     * @return customerAddress from table "orderTable"
     */
    @Basic
    @Column(name = "customeraddress")
    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     *
     * @return totalAmount from table "orderTable"
     */
    @Basic
    @Column(name = "totalamount")
    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     *
     * @return createdDate from table "orderTable"
     */
    @Basic
    @Column(name = "createddate")
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (customerName != null ? !customerName.equals(order.customerName) : order.customerName != null) return false;
        if (customerAddress != null ? !customerAddress.equals(order.customerAddress) : order.customerAddress != null)
            return false;
        if (totalAmount != null ? !totalAmount.equals(order.totalAmount) : order.totalAmount != null) return false;
        if (createdDate != null ? !createdDate.equals(order.createdDate) : order.createdDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (customerAddress != null ? customerAddress.hashCode() : 0);
        result = 31 * result + (totalAmount != null ? totalAmount.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", totalAmount=" + totalAmount +
                ", createdDate=" + createdDate +
                '}';
    }
}
