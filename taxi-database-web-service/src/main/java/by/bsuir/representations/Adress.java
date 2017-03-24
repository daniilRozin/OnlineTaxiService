package by.bsuir.representations;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "ADRESS")
public class Adress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "city")
	private String city;
	
	@Column (name = "street")
	private String street;
	
	@Column (name = "house")
	private String house;
	
	@Column (name = "number")
	private Integer number;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "from_adress")
	private Set<Order> fromOrders;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "to_adress")
	private Set<Order> toOrders;
	
	public Adress() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	
}
