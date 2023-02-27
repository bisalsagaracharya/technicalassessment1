package collectionassignment;

import java.util.Objects;

public class Product implements Comparable<Product> {
	Integer PID;
	String ProductName;
	Double Price;
	
	//Default constructor
	public Product() {
		super();
	}


	//parametrized constructor
	public Product(int productID, String productName, Double price) {
		super();
		PID = productID;
		ProductName = productName;
		Price = price;
	}


	public int getProductID() {
		return PID;
	}


	public void setProductID(int productID) {
		PID = productID;
	}


	public String getProductName() {
		return ProductName;
	}


	public void setProductName(String productName) {
		ProductName = productName;
	}


	public Double getPrice() {
		return Price;
	}


	public void setPrice(Double price) {
		Price = price;
	}


	@Override
	public String toString() {
		return "Product [ProductID=" + PID + ", ProductName=" + ProductName + ", Price=" + Price + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(PID);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(PID, other.PID);
	}


	@Override
	public int compareTo(Product p2) {
		// TODO Auto-generated method stub
		return PID.compareTo(p2.PID);
	}
	
	
	
	
}