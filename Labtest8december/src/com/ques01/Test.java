package com.ques01;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
        List<ContactsBook> contactList = new ArrayList<ContactsBook>();
        
        contactList.add(new ContactsBook("JIYA","RANCHI", "876543219", "jiya123@gmail.com\n"));
        contactList.add(new ContactsBook("PRIYA","BANGALURU", "908765436", "priya456@gmail.com\n"));
        contactList.add(new ContactsBook("AARAV","MUMBAI", "876965", "areav345@gmail.com\n"));
        contactList.add(new ContactsBook("ALI", "NOIDA", "9905643990", "ali786@yahoo.com\n"));
        
        System.out.println(contactList);
        
	}

}
