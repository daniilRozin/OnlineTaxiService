package by.bsuir_matys_rozin_zarudny.representations;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ADMIN")
public class Admin extends BaseUser {

	@ManyToOne(targetEntity = AdminRights.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "admin_rights_id")
	@NotNull
	private AdminRights adminRights;

	public Admin() {
		super();
	}

	public AdminRights getAdminRights() {
		return adminRights;
	}

	public void setAdminRights(AdminRights adminRights) {
		this.adminRights = adminRights;
	}

}
