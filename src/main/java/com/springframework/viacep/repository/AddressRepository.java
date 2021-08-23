/**
 * 
 */
package com.springframework.viacep.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springframework.viacep.model.Address;

/**
 * @author Gabriel
 *
 */
public interface AddressRepository extends CrudRepository<Address, Long>{
	Address findByZip(String zip);
}
