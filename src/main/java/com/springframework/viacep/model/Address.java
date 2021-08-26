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
	
	@Column(name = "complement")
	private String complement;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "federative_unit")
	private String federativeUnit;
	
	@Column(name = "ibge")
	private String ibge;
	
	@Column(name = "gia")
	private String gia;
	
	@Column(name = "ddd")
	private String ddd;
	
	@Column(name = "siafi")
	private String siafi;
	
	public Address() {}

	/**
	 * @param zip
	 * @param publicPlace
	 * @param complement
	 * @param district
	 * @param city
	 * @param federativeUnit
	 * @param ibge
	 * @param gia
	 * @param ddd
	 * @param siafi
	 */
	public Address(String zip, String publicPlace, String complement, String district, String city,
			String federativeUnit, String ibge, String gia, String ddd, String siafi) {
		super();
		this.zip = zip;
		this.publicPlace = publicPlace;
		this.complement = complement;
		this.district = district;
		this.city = city;
		this.federativeUnit = federativeUnit;
		this.ibge = ibge;
		this.gia = gia;
		this.ddd = ddd;
		this.siafi = siafi;
	}
	
	public String getZip() {
		return zip;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	public String getComplement() {
		return complement;
	}
	
	public String getDistrict() {
		return district;
	}


	public String getCity() {
		return city;
	}

	public String getFederativeUnit() {
		return federativeUnit;
	}

	public String getIbge() {
		return ibge;
	}

	public String getGia() {
		return gia;
	}

	public String getDdd() {
		return ddd;
	}

	public String getSiafi() {
		return siafi;
	}

	@Override
	public String toString() {
		return "Address [zip=" + zip + ", publicPlace=" + publicPlace + ", complement=" + complement + ", district="
				+ district + ", city=" + city + ", federativeUnit=" + federativeUnit + ", ibge=" + ibge + ", gia=" + gia
				+ ", ddd=" + ddd + ", siafi=" + siafi + "]";
	}

	
}
