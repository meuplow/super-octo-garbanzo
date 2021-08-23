/**
 * 
 */
package com.springframework.viacep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Gabriel
 *
 */

@Entity
@Table(name = "addresses")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "zip")
	private String zip;
	
	@Column(name = "public_place")
	private String publicPlace;
	

	public Address() {}

	
	/**
	 * @param zip
	 * @param publicPlace
	 */
	public Address(String zip, String publicPlace) {
		super();
		this.zip = zip;
		this.publicPlace = publicPlace;
	}

	public String getZip() {
		return zip;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	@Override
	public String toString() {
		return "Address [zip=" + zip + ", publicPlace=" + publicPlace + "]";
	}

	
}
