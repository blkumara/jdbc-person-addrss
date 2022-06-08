package com.ty.person_address.Controller;

import com.ty.person_address.dto.Address;

import Service.AddressService;

public class SaveAddress {
	public static void main(String[] args) {
		
	
	AddressService addressService=new AddressService();
	Address address=new Address();
	
	address.setAid(4);
	address.setStreet("8st Cross");
	address.setDoor_num("5");
	address.setCity("Hassan");
	address.setPin(573201);
	address.setPid(2);
	}
}
