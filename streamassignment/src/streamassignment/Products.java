package streamassignment;

import java.util.Date;

public class Products {
    Integer productId;
    String productName;
    Integer productPrice;
    Date expiryDate;
    Date manufacturingDate;

    public Products() {
        super();
    }

    public Products(Integer productId, String productName, Integer productPrice, Date expiryDate, Date manufacturingDate) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.expiryDate = expiryDate;
        this.manufacturingDate = manufacturingDate;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", expiryDate=" + expiryDate +
                ", manufacturingDate=" + manufacturingDate +
                '}';
    }
}