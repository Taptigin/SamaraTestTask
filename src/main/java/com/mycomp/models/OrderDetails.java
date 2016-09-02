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
    private Integer amount;
    private Long orderId;

    /**
     *
     * @return id from table "orderDetails"
     */
    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    /**
     * setting id values for the records from the table orderDetails
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return productSerialNumber from table "orderDetails"
     */
    @Basic
    @Column(name = "productserialnumber")
    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    /**
     * setting productSerialNumber values for the records from the table orderDetails
     * @param productSerialNumber
     */
    public void setProductSerialNumber(String productSerialNumber) {
        this.productSerialNumber = productSerialNumber;
    }

    /**
     *
     * @return productName from table "orderDetails"
     */
    @Basic
    @Column(name = "productname")
    public String getProductName() {
        return productName;
    }

    /**
     * setting productName values for the records from the table orderDetails
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     *
     * @return amount from table "orderDetails"
     */
    @Basic
    @Column(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    /**
     * setting amount values for the records from the table orderDetails
     * @param amount
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     *
     * @return orderId from table "orderDetails"
     */
    @Basic
    @Column(name = "orderid")
    public Long getOrderId() {
        return orderId;
    }

    /**
     * setting orderId values for the records from the table orderDetails
     * @param orderId
     */
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
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (productSerialNumber != null ? productSerialNumber.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        return result;
    }
}
