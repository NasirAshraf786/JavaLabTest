package com.ques01;

public class ContactsBook {
	  String name;
	    String address;
	    String contact_No;
	    String email;
	 
	    public ContactsBook(String name, String address, String contact_No, String email) 
	    {
	        
	        this.name = name;
	        this.address = address;
	        this.contact_No = contact_No;
	        this.email = email;
	    }
	     
	   
	    @Override
	    public String toString() 
	    {
	        return "NAME : " +name+
	        	   "ADDRESS : " + address+
	               "CONTACT NUMBER : " +contact_No+
	               "EMAIL ID : " +email;
	    }
}



