package com.ty.person_address.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.person_address.dto.Person;
import com.ty.person_address.util.ConnectionObject;

public class PersonDao {
	
	public int savePerson(Person person)
	{
		int resultCount=0;
		String sql="insert into person  values (?,?,?,?)";
		Connection connection=ConnectionObject.getConnection();
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, person.getPid());
			preparedStatement.setString(2, person.getName());
			preparedStatement.setString(3, person.getEmail());
			preparedStatement.setString(4, person.getPhone());
			
			resultCount= preparedStatement.executeUpdate();
			System.out.println("Data Inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultCount;
		
		
		
	}

}
