package br.com.caelum.servlet.domain;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Contact {
	
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");


	private String name;
	private String address;
	private String email;
	private LocalDate dateOfBirth;

	

	public Contact(String name, String address, String email, LocalDate dateOfBirth) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Contato [name=" + name + ", address=" + address + ", email=" + email + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}

}
