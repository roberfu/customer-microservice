package cl.springmachine.customer.api.rest.models;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

	@Id
	private Integer id;

	private String firstName;

	private String lastName;

	private String documentType;

	private String documentId;

	private String phone;

	private String email;

	private Integer addressId;

	private Integer invoiceDataId;

	private String customerType;

	private String legalName;

	private String classification;
}
