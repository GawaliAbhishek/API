package com.Abhishek.DataJpa.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy=false)
public class data1 {
	
	@Id
	private int addressid;
	private String address_line1;
	private String address_line2;
	private String address_line3;
	private String location;
	private String city;
	private String state;
	private int pincode;
	private int add_type_id;
	public int getAdddressId() {
		return addressid;
	}
	public void setAdddressId(int adddressId) {
		this.addressid = adddressId;
	}
	public String getAddressLine1() {
		return address_line1;
	}
	public void setAddressLine1(String addressLine1) {
		this.address_line1 = addressLine1;
	}
	public String getAddressLine2() {
		return address_line2;
	}
	public void setAddressLine2(String addressLine2) {
		this.address_line2 = addressLine2;
	}
	public String getAddressLine3() {
		return address_line3;
	}
	public void setAddressLine3(String addressLine3) {
		this.address_line3 = addressLine3;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pincode;
	}
	public void setPinCode(int pinCode) {
		this.pincode = pinCode;
	}
	public int getAddTypeId() {
		return add_type_id;
	}
	public void setAddTypeId(int addTypeId) {
		this.add_type_id = addTypeId;
	}

}
