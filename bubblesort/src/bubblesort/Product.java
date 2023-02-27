package bubblesort;

public class Product implements Comparable<Product> {
    private String name;
    private String price;
    
    
    @Override
	public int compareTo(Product o) {
		 
	return  this.price.compareTo(o.price);
	}
    
    

    public Product(String name, String i) {
        this.name = name;
        this.price = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

	
}
