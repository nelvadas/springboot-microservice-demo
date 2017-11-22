package com.redhat.training.msa.poc.model;

import org.springframework.data.annotation.Id;


public class Tiers {

 @Id
 private String ref;
 private String firstName;
 private String lastName;
 private String customEnv;
 
 
public String getRef() {
	return ref;
}
public void setRef(String ref) {
	this.ref = ref;
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
public String getCustomEnv() {
	return customEnv;
}
public void setCustomEnv(String customEnv) {
	this.customEnv = customEnv;
}

@Override
public String toString() {
	return "Tiers [ref=" + ref + ", firstName=" + firstName + ", lastName=" + lastName + ", customEnv=" + customEnv
			+ "]";
}


}
