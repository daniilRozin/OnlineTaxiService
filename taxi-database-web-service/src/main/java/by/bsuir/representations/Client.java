package by.bsuir.representations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="CLIENT")
public class Client extends BaseUser {

	@NotNull
	@Column(name = "telephone")
	private String telephone;
	
	@NotNull
	@Column(name = "card")
	private String card;
	
	public Client() {
		super();
	}
	
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	
}
