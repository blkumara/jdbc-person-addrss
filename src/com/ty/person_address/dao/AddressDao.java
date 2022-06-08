package com.ty.person_address.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.person_address.dto.Address;
import com.ty.person_address.util.ConnectionObject;

public class AddressDao {

	public int saveAddress(Address address) {
		int resultCount = 0;
		String sql = "Insert into address values(?,?,?,?,?,?)";
		Connection connection = ConnectionObject.getConnection();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, address.getAid());
			preparedStatement.setString(2, address.getStreet());
			preparedStatement.setString(3, address.getDoor_num());
			preparedStatement.setString(4, address.getCity());
			preparedStatement.setString(4, address.getCity());
			preparedStatement.setInt(5, address.getPin());
			preparedStatement.setInt(6, address.getPid());

			resultCount = preparedStatement.executeUpdate();
			System.out.println("Address inserted");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultCount;

	}

	public List<Address> getAddress(int pid) {
		List<Address> list = new ArrayList<Address>();
		String query = "Select * from address where pid=?";
		
		Connection connection = ConnectionObject.getConnection();

		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, pid);
			ArrayList<Address> arrayList = new ArrayList<Address>();
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int aid = resultSet.getInt(1);
				String street = resultSet.getString(2);
				String door_num = resultSet.getString(3);
				String city = resultSet.getString(4);
				int pin = resultSet.getInt(5);
				int pid1 = resultSet.getInt(6);

				Address address = new Address();
				address.setAid(aid);
				address.setStreet(street);
				address.setDoor_num(door_num);
				address.setCity(city);
				address.setPin(pin);
				address.setPid(pid);
				list.add(address);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}
}
