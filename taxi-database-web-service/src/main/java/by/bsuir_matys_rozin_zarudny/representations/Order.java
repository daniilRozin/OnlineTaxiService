package by.bsuir_matys_rozin_zarudny.representations;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="TAXI_ORDER")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "price")
	private Double price;
	
	@NotNull
	@Column (name = "date")
	private Date date;
	
	@NotNull
	@ManyToOne(targetEntity=Client.class, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="client_id")
	private Client client;

	@NotNull
	@ManyToOne(targetEntity=Car.class, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn (name = "car_id")
	private Car car;
	
	
	@NotNull
	@ManyToOne(targetEntity=Adress.class, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn (name = "from_adress")
	private Adress fromAdress;
	
	@NotNull
	@ManyToOne(targetEntity=Adress.class, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn (name = "to_adress")
	private Adress toAdress;
	
	@NotNull
	@ManyToOne(targetEntity=OrderState.class, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="order_state_id")
	private OrderState orderStateId;

	
	
	public Order() {
		super();
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public Adress getFromAdress() {
		return fromAdress;
	}


	public void setFromAdress(Adress fromAdress) {
		this.fromAdress = fromAdress;
	}


	public Adress getToAdress() {
		return toAdress;
	}


	public void setToAdress(Adress toAdress) {
		this.toAdress = toAdress;
	}


	public OrderState getOrderStateId() {
		return orderStateId;
	}


	public void setOrderStateId(OrderState orderStateId) {
		this.orderStateId = orderStateId;
	}


	public Long getId() {
		return id;
	}
	

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
