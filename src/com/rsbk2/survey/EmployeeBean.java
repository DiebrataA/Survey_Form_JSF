package com.rsbk2.survey;

import java.util.Arrays;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.validator.ValidatorException;
import sun.security.validator.ValidatorException;

@ManagedBean
@SessionScoped
public class EmployeeBean {

	// Member Variables
	private String firstName;
	private String lastName;
	private String city;
	private String country; 
	private String postcode; 
	private String comment;
	
	private String facility;
	private Date datesurvey;
	private String address;
	private String emailAddress;
	private String mobileNumber;
	

	private String recommendation;

	

	
	 public String[] interest;

	  public String[] getinterest() {
	    return interest;
	  }
	  public void setinterest(String[] interest) {
	    this.interest= interest;
	  }

	  public String getinterestInString() {
	    return Arrays.toString(interest);
	  }
	 
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName= lastName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setCity(String city) {
		this.city= city;
	}
	
	public String getCity() {
		return city;
	}
	
	
	public void setCountry(String country) {
		this.country= country;
	}
	
	public String getCountry() {
		return country;
	}
	

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public String getPostcode() {
		return postcode;
	}
	

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public Date getDatesurvey() {
		return datesurvey;
	}

	public void setDatesurvey(Date datesurvey) {
		this.datesurvey = datesurvey;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation= recommendation;
	}

	// Validate Email
	public void validateEmail(FacesContext context, UIComponent toValidate, Object value) throws ValidatorException {
		String emailStr = (String) value;
		if (-1 == emailStr.indexOf("@")) {
			FacesMessage message = new FacesMessage("Email Address is Valid");
			throw new ValidatorException(message);
		}
	}
}