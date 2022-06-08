package com.ty.person_address.Controller;

import com.ty.person_address.dao.PersonDao;
import com.ty.person_address.dto.Person;

import Service.PersonService;

public class TestPerson {
	public static void main(String[] args) {
		
		PersonService service=new PersonService();
		
		Person person=new Person();
		
		person.setPid(3);
		person.setName("pavan");
		person.setEmail("pavan@7411");
		person.setPhone("741154152");
		
		PersonDao dao=new PersonDao();
		dao.savePerson(person);
		
	}
}
