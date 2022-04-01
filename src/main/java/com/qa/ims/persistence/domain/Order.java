package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {
	
	private Long id;
	private Long customerId;
	private String firstName;
	private String surname;
	private String productName;
	
	
	public Order(Long id, Long customerId) {
		this.setId(id);
		this.setCustomerId(customerId);
	}
	
	public Order(Long id, String firstName, String surname, String productName) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setSurname(surname);
		this.setProductName(productName);
		

	}
	
	
	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	

	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	

	@Override
	public String toString() {
		return "Order [id=" + id + ", firstName=" + firstName + ", surname=" + surname + ", productName=" + productName
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId, firstName, id, productName, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(customerId, other.customerId) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(id, other.id) && Objects.equals(productName, other.productName)
				&& Objects.equals(surname, other.surname);
	}
	
		
	
	
}
