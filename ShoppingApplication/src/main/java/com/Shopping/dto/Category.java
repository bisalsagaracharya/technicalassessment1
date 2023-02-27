package com.Shopping.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Category {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String categoryType;
    private Integer categoryQuantity;
   @OneToMany( fetch = FetchType.EAGER, cascade = CascadeType.ALL)  // mapped to line 18 category variable in product
 @JoinColumn(name ="categoryId",referencedColumnName = "categoryId")
    private List<Product> product;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public Integer getCategoryQuantity() {
        return categoryQuantity;
    }

    public void setCategoryQuantity(Integer categoryQuantity) {
        this.categoryQuantity = categoryQuantity;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryType='" + categoryType + '\'' +
                ", categoryQuantity='" + categoryQuantity + '\'' +
                '}';
    }
}
