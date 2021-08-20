/**
 * 
 */
package com.springframework.viacep.entity;

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
	private Long cep;
	private String logradouro;

	protected Address() {}

	
	/**
	 * @param cep
	 * @param logradouro
	 */
	public Address(Long cep, String logradouro) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
	}

	public Long getId() {
		return id;
	}

	public Long getCep() {
		return cep;
	}

	public String getLogradouro() {
		return logradouro;
	}


	@Override
	public String toString() {
		return "Endereço[id=" + id + ", cep=" + cep + ", logradouro=" + logradouro + "]";
	}
	
}
