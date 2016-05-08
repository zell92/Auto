package it.uniroma3.controller;

import it.uniroma3.model.Car;
import it.uniroma3.model.CarFacade;
import it.uniroma3.model.Carmaker;
import it.uniroma3.model.CarmakerFacade;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CarController {
	
	//@ManagedProperty(value="")
	private Long id;
	private String model;
	private Float price;
	private String description;
	private String code;
	private Long carmakerId;
	private Carmaker carmaker;
	private List<Car> cars;
	private Car car;
	

	
	@EJB
	private CarFacade carFacade;
@EJB
private CarmakerFacade carmakerFacade;
	
	
	public String createCar() {
		this.carmaker = this.carmakerFacade.getCarmaker(carmakerId);
		this.car = this.carFacade.createCar(this.model, this.price, this.description, this.code, this.carmaker);
		return listCars();
	}
	
	
	public String findCar() {
		this.car=this.carFacade.getCar(this.id);
		return "macchina";
	}
	

	
	public String listCars() {
		this.cars=this.carFacade.getAllCars();
		if(cars==null)
			return "errore";
		return "listaTutteMacchine";
	}
	
	public String deleteCar(){
		this.carFacade.deleteCar(this.id);
		return listCars();
	}
	public String deleteCar(Long id){
		carFacade.deleteCar(id);;
		return listCars();
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





	public Long getCarmakerId() {
		return carmakerId;
	}


	public void setCarmakerId(Long carmakerId) {
		this.carmakerId = carmakerId;
	}


	public Carmaker getCarmaker() {
		return carmaker;
	}


	public void setCarmaker(Carmaker carmaker) {
		this.carmaker = carmaker;
	}


	public List<Car> getCars() {
		return cars;
	}


	public void setCars(List<Car> cars) {
		this.cars = cars;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


}