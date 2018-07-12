/**
 * 
 */
package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
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
	@GeneratedValue
	private long id;
	@NotNull
	@NotBlank
	private String fName;
	@NotNull
	@NotBlank
	private String lName;
	@NotNull
	@NotBlank

	private String userID;
	@NotNull
	@NotBlank
	@ValidEmail
	private String eMail;
	@NotNull
	@NotBlank
	@Size(min = 8)
	private String password;
	@NotNull
	@NotBlank
	private String cPassword;
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
