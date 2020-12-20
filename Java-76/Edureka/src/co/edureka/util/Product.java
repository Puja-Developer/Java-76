package co.edureka.util;

public class Product {
	private Integer prodId;
	private String prodName;
	private Float unit_price;

	public Product() {}

	public Product(Integer prodId, String prodName, Float unit_price) {		
		this.prodId = prodId;
		this.prodName = prodName;
		this.unit_price = unit_price;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Float getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(Float unit_price) {
		this.unit_price = unit_price;
	}

	@Override
	public String toString() {
		return "Product [" + prodId + " | " + prodName + " | " + unit_price + "]";
	}
	
}
