package by.bsuir.representations;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="ORDER")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="client_id")
	private Long clientId;

	@NotNull
	@ManyToOne
	@JoinColumn (name = "car_id")
	private Long carId;
	
	
	@NotNull
	@ManyToOne
	@JoinColumn (name = "from_adress")
	private Long fromAdress;
	
	@NotNull
	@ManyToOne
	@JoinColumn (name = "to_adress")
	private Long toAdress;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="order_state_id")
	private Long orderStateId;

	@Column(name = "price")
	private Double price;
	
	@NotNull
	@Column (name = "date")
	private Date date;
	
	public Order() {
		super();
	}

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Long getFromAdress() {
		return fromAdress;
	}

	public void setFromAdress(Long fromAdress) {
		this.fromAdress = fromAdress;
	}

	public Long getToAdress() {
		return toAdress;
	}

	public void setToAdress(Long toAdress) {
		this.toAdress = toAdress;
	}

	public Long getOrderStateId() {
		return orderStateId;
	}

	public void setOrderStateId(Long orderStateId) {
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
