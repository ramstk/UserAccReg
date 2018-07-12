/**
 * 
 */
package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Required;

/**
 * @author RAM
 *
 */
@Entity
public class UserRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@NotNull
	@NotBlank
	@Column(name = "fName")
	private String fName;
	@NotNull
	@NotBlank
	@Column(name = "lName")
	private String lName;
	@NotNull
	@NotBlank
	@Column(name = "userID", nullable = false, unique = true)
	private String userID;
	@NotNull
	@NotBlank
	@ValidEmail
	@Column(name = "eMail")
	@NotEmpty(message = "Please provide an e-mail")
	private String eMail;
	@NotNull
	@NotBlank
	@Size(min = 8)
	@Column(name = "password")
	private String password;
	@NotNull
	@NotBlank
	@Column(name = "cPassword")
	private String cPassword;
	@Column(name = "completed")
	private boolean completed;

	public UserRegistration() {
		super();
	}

	public UserRegistration(long id, String fName, String lName, String userID, String eMail, String password,
			String cPassword, boolean completed) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.userID = userID;
		this.eMail = eMail;
		this.password = password;
		this.cPassword = cPassword;
		this.completed = completed;
	}

	public UserRegistration(String fName, String lName, String userID, String eMail, String password, String cPassword,
			boolean completed) {
		super();

		this.fName = fName;
		this.lName = lName;
		this.userID = userID;
		this.eMail = eMail;
		this.password = password;
		this.cPassword = cPassword;
		this.completed = completed;
	}

	public long getId() {
		return id;
	}

	@Required
	@NotNull
	@NotBlank
	public void setId(long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	@Required
	@NotNull
	@NotBlank
	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

}
