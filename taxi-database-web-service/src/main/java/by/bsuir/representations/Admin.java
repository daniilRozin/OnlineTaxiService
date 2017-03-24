package by.bsuir.representations;

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

	@ManyToOne(targetEntity=AdminRights.class,fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name = "admin_rights_id")
	@NotNull
	private Long adminRightsId;

	public Admin() {
		super();
	}

	public Long getAdminRightsId() {
		return adminRightsId;
	}

	public void setAdminRightsId(Long adminRightsId) {
		this.adminRightsId = adminRightsId;
	}
	
	

}
