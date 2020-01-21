package com.tsc.model;

public class Register {
	       private String firstName;
	    private String lastName;
	    private int  age;
	    private String gender;
	    private long  contactNumber;
	    private String category;
	    private String userId;
	    private String password;
	    private String picture;
	    private boolean status;
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
	       public int getAge() {
	              return age;
	       }
	       public void setAge(int age) {
	              this.age = age;
	       }
	       public String getGender() {
	              return gender;
	       }
	       public void setGender(String gender) {
	              this.gender = gender;
	       }
	       public long getContactNumber() {
	              return contactNumber;
	       }
	       public void setContactNumber(long contactNumber) {
	              this.contactNumber = contactNumber;
	       }
	       public String getCategory() {
	              return category;
	       }
	       public void setCategory(String category) {
	              this.category = category;
	       }
	       public String getUserId() {
	              return userId;
	       }
	       public void setUserId(String userId) {
	              this.userId = userId;
	       }
	       public String getPassword() {
	              return password;
	       }
	       public void setPassword(String password) {
	              this.password = password;
	       }
	       public String getPicture() {
	              return picture;
	       }
	       public void setPicture(String picture) {
	              this.picture = picture;
	       }
	       public boolean isStatus() {
	              return status;
	       }
	       public void setStatus(boolean status) {
	              this.status = status;
	       }
	       public Register() {
	              super();
	              // TODO Auto-generated constructor stub
	       }
	       public Register(String firstName, String lastName, int age, String gender, long contactNumber, String category,
	                     String userId, String password, String picture, boolean status) {
	              super();
	              this.firstName = firstName;
	              this.lastName = lastName;
	              this.age = age;
	              this.gender = gender;
	              this.contactNumber = contactNumber;
	              this.category = category;
	              this.userId = userId;
	              this.password = password;
	              this.picture = picture;
	              this.status = status;
	       }
	       
	}




