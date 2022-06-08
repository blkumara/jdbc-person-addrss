package com.ty.person_address.Controller;

import java.util.List;

import com.ty.person_address.dao.AddressDao;
import com.ty.person_address.dto.Address;

public class GetAllAddress {
	public static void main(String[] args) {
		AddressDao addressDao = new AddressDao();
		// addressDao.saveAddress(address);
		List<Address> list = addressDao.getAddress(2);
//System.out.println("Aid is"+address.getAid ());
//System.out.println("Street Is"+address.getStreet());
//System.out.println("Door_Num Is"+address.getDoor_num());
//System.out.println("City Is"+address.getCity());
//System.out.println("PinCode Is"+address.getPin());
//System.out.println("Pid Is"+address.getPid());

		System.out.println(list);
	}
}
