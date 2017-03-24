package by.bsuir.representations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "DRIVER")
public class Driver extends BaseUser {

	@Column (name = "rating_sum")
	private Double ratingSum;
	
	@Column (name = "rating_amount")
	private Integer ratingAmount;
	
	@NotNull
	@Column (name = "telephone")
	private String telephone;
	
	@ManyToOne
	@NotNull
	@JoinColumn(name="car_id")
	private Long carId;
	
	public Driver() {
		super();
	}

	public Double getRatingSum() {
		return ratingSum;
	}

	public void setRatingSum(Double ratingSum) {
		this.ratingSum = ratingSum;
	}

	public Integer getRatingAmount() {
		return ratingAmount;
	}

	public void setRatingAmount(Integer ratingAmount) {
		this.ratingAmount = ratingAmount;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}
	
	
	
}
