package it.uniroma3.model;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@NamedQuery(name = "findAllCarmakers", query = "SELECT cm FROM Carmaker cm")
public class Carmaker {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(nullable=false)
	private String name;
	
	
	@OneToMany(mappedBy = "carmaker", cascade = {CascadeType.REMOVE})
	private List<Car> cars;

	public Carmaker() {}

	public Carmaker(String name,List<Car> cars) {
		this.name = name;
		this.cars = cars;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	
}
