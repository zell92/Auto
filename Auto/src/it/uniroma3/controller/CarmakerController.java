package it.uniroma3.controller;

import it.uniroma3.model.Car;
import it.uniroma3.model.Carmaker;
import it.uniroma3.model.CarmakerFacade;


import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CarmakerController {
	
	@ManagedProperty(value="")
	private Long id;
	private String name;
	private List<Car> cars;
	private List<Carmaker> carmakers;
	private Carmaker carmaker;
	private Long carmakerId;
	
	@EJB
	private CarmakerFacade carmakerFacade;

	public String createCarmaker() {
		this.carmaker = carmakerFacade.createCarmaker(name);
		return "index"; 
	}
	

	
	public String showCars(){
		Carmaker cm = this.carmakerFacade.getCarmaker(carmakerId);
		this.cars=this.carmakerFacade.getCars(cm);	


			return "listaMacchine";
	}
	
	public String newCar(){
		this.carmakers=this.carmakerFacade.getAllCarmakers();	
		return "newCar";
	}
	public String listCarmakers(){
		this.carmakers=this.carmakerFacade.getAllCarmakers();	


			return "listaCaseAutomobilistiche";
	}
	
	public String deleteCarmaker(){
		this.carmakerFacade.deleteCarmaker(this.id);
		return listCarmakers();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Car> getCars() {
		return cars;
	}



	public void setCars(List<Car> cars) {
		this.cars = cars;
	}



	public Carmaker getCarmaker() {
		return carmaker;
	}



	public void setCarmaker(Carmaker carmaker) {
		this.carmaker = carmaker;
	}



	public List<Carmaker> getCarmakers() {
		return carmakers;
	}



	public void setCarmakers(List<Carmaker> carmakers) {
		this.carmakers = carmakers;
	}



	public Long getCarmakerId() {
		return carmakerId;
	}



	public void setCarmakerId(Long carmakerId) {
		this.carmakerId = carmakerId;
	}






}
