package com.mycomp.models;

import javax.persistence.*;

/**
 * Created by Александр on 01.09.2016.
 */
@Entity
@Table(name = "orderdetails")
public class OrderDetails {
    private Long id;
    private String productSerialNumber;
    private String productName;
    private Integer anount;
    private Long orderId;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "productserialnumber")
    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    public void setProductSerialNumber(String productSerialNumber) {
        this.productSerialNumber = productSerialNumber;
    }

    @Basic
    @Column(name = "productname")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "amount")
    public Integer getAnount() {
        return anount;
    }

    public void setAnount(Integer anount) {
        this.anount = anount;
    }

    @Basic
    @Column(name = "orderid")
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderDetails that = (OrderDetails) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (productSerialNumber != null ? !productSerialNumber.equals(that.productSerialNumber) : that.productSerialNumber != null)
            return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (anount != null ? !anount.equals(that.anount) : that.anount != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (productSerialNumber != null ? productSerialNumber.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (anount != null ? anount.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        return result;
    }
}
