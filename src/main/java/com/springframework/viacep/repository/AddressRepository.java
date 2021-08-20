/**
 * 
 */
package com.springframework.viacep.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springframework.viacep.entity.Address;

/**
 * @author Gabriel
 *
 */
public interface AddressRepository extends CrudRepository<Address, Long>{
	Address findByZip(long cpf);
}
