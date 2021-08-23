/**
 * 
 */
package com.springframework.viacep.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Gabriel
 *
 */

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long zip;
	private String publicPlace;

	protected Address() {}

	
	/**
	 * @param zip
	 * @param logradouro
	 */
	public Address(Long zip, String publicPlace) {
		super();
		this.zip = zip;
		this.publicPlace = publicPlace;
	}

	public Long getZip() {
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
