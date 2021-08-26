/**
 * 
 */
package com.springframework.viacep.rest;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.springframework.viacep.model.Address;

/**
 * @author Gabriel
 *
 */
public class JacksonCustomAddressSerializer extends StdSerializer<Address> {

	public JacksonCustomAddressSerializer() {
		this(null);
	}

	protected JacksonCustomAddressSerializer(Class<Address> t) {
		super(t);
	}
	
	@Override
	public void serialize(Address address, JsonGenerator jgen, SerializerProvider provider) throws IOException {
		// TODO Auto-generated method stub
		jgen.writeStartObject();
		jgen.writeStringField("cep", address.getZip());
		jgen.writeStringField("logradouro", address.getPublicPlace());
		jgen.writeStringField("complemento", address.getComplement());
		jgen.writeStringField("bairro", address.getDistrict());
		jgen.writeStringField("localidade", address.getCity());
		jgen.writeStringField("uf", address.getFederativeUnit());
		jgen.writeStringField("ibge", address.getIbge());
		jgen.writeStringField("gia", address.getGia());
		jgen.writeStringField("ddd", address.getDdd());
		jgen.writeStringField("siafi", address.getSiafi());
		jgen.writeEndObject();
	}

	
}
