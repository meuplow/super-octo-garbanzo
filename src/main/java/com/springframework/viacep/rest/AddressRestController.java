/**
 * 
 */
package com.springframework.viacep.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.viacep.model.Address;
import com.springframework.viacep.repository.AddressRepository;

/**
 * @author Gabriel
 *
 */

@RestController
@RequestMapping("/api/addresses/zip")
public class AddressRestController {
	
	@Autowired
	AddressRepository repository;
	
	@RequestMapping(value = "/{zip}", method = RequestMethod.GET, produces = "application/json")
	public Address getAddress(@PathVariable String zip) {
		return repository.findByZip(zip);
	}
	
}
