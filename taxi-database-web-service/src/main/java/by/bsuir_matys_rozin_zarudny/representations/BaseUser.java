package by.bsuir.representations;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@MappedSuperclass
@Table(name="BASE_USER")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class BaseUser {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	@NotNull
    @Column(name = "login")
	private String login;
	
	private String password;
	
	@NotNull
    @Column(name = "email")
	private String email;
	
	@NotNull
    @Column(name = "first_name")
	private String firstName;
	
	@NotNull
    @Column(name = "second_name")
	private String secondName;

	public BaseUser() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	/*
	 * TO-DO
	 * Add encryption here
	 */
	@NotNull
    @Column(name = "password")
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getsecondName() {
		return secondName;
	}

	public void setsecondName(String secondName) {
		this.secondName = secondName;
	}

}
