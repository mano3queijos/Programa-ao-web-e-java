package br.com.caelum.servlet.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.servlet.domain.Contact;

public class ContactDao {

	
	private static List<Contact> contacts= new ArrayList<>();
	
	
	public static void add(Contact contact) {
		contacts.add(contact);
		
	}
	
	public static List<Contact> getContacts(){
		return new ArrayList<>(contacts);
	}
}
