package it.uniroma3.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String model;

	private Float price;
	
	@Column(length = 2000)
	private String description;

	@Column(nullable = false, unique=true)
	private String code;
		
	@ManyToOne
	private Carmaker carmaker;
	
	public Car() {}



	public Car(String model, Float price, String description, String code, Carmaker carmaker) {
		this.model = model;
		this.price = price;
		this.description = description;
		this.code = code;
		this.carmaker = carmaker;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public Float getPrice() {
		return price;
	}



	public void setPrice(Float price) {
		this.price = price;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public Carmaker getCarmaker() {
		return carmaker;
	}



	public void setCarmaker(Carmaker carmaker) {
		this.carmaker = carmaker;
	}


}