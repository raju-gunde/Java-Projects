package june_27demos;

public class Product implements Comparable<Product>
{
	private Integer productNumber;
    private String productName;
    private Double productPrice;
	public Product(Integer productNumber, String productName, Double productPrice) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public int compareTo(Product o) {
		
		return this.productName.compareTo(productName);
	}
	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}
	
    

}
