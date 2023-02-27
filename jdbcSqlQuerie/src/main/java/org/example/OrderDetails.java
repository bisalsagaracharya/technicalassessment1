package org.example;

public class OrderDetails {

    private String orderNumber;
    private String productCode;
    private String quantityOrdered;
    private String priceEach;
    private String orderLineNumber;

    public OrderDetails(String orderNumber, String productCode, String quantityOrdered, String priceEach, String orderLineNumber) {
        this.orderNumber = orderNumber;
        this.productCode = productCode;
        this.quantityOrdered = quantityOrdered;
        this.priceEach = priceEach;
        this.orderLineNumber = orderLineNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(String quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public String getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(String priceEach) {
        this.priceEach = priceEach;
    }

    public String getOrderLineNumber() {
        return orderLineNumber;
    }

    public void setOrderLineNumber(String orderLineNumber) {
        this.orderLineNumber = orderLineNumber;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderNumber='" + orderNumber + '\'' +
                ", productCode='" + productCode + '\'' +
                ", quantityOrdered='" + quantityOrdered + '\'' +
                ", priceEach='" + priceEach + '\'' +
                ", orderLineNumber='" + orderLineNumber + '\'' +
                '}';
    }
}
