package iuh.fit.se.springmvc.demo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	private String firstName;
	private String lastName;
	@NotNull(message="is required")
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less than or equal to 10")
	private Integer freePasses;
	private String postalCode;
	@NotNull(message="is required")
	@Size (min=4, message="is required")
	private String courseCode;
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String firstName, String lastName, Integer freePasses, String postalCode, String courseCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.freePasses = freePasses;
		this.postalCode = postalCode;
		this.courseCode = courseCode;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
