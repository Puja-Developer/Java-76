package co.edureka.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product", schema = "java76")
public class Product {
	@Id
	@Column(name = "prodid", length = 10, unique = true, nullable = false)
	private Integer prodId;
	
	@Column(name="prod_name")
	private String prodName;
	
	@Column(name="price", length=10, precision = 2)
	private Float price;

	public Product() {}

	public Product(Integer prodId, String prodName, Float price) {		
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
}
