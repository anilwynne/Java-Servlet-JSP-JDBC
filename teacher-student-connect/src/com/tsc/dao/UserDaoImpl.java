package com.tsc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tsc.model.Register;

public class UserDaoImpl implements UserDao{

	@Override
	public int registration(Register r) {
        Connection connection = ConnectionHandler.getConnection();
       int  str= 0;
        try {
               
        	// String INSERT_USERS_SQL = "INSERT INTO regform (first_name,last_name,age,Gender,contactnumber,Category,userId,password,picture,status) VALUES (?, ?, ?, ?, ?,?,?,?,?,?)";
            String insert="insert into regform values(?,?,?,?,?,?,?,?,?,?)";
        	PreparedStatement preparedStatement = connection.prepareStatement(insert);
            //preparedStatement.setInt(1, 1);
            preparedStatement.setString(1, r.getFirstName());
            preparedStatement.setString(2, r.getLastName());
            preparedStatement.setInt(3, r.getAge());
            preparedStatement.setString(4, r.getGender());
            preparedStatement.setLong(5, r.getContactNumber());
            preparedStatement.setString(6, r.getCategory());
            preparedStatement.setString(7, r.getUserId());
            preparedStatement.setString(8, r.getPassword());
            preparedStatement.setString(9, r.getPicture());
            preparedStatement.setString(10, r.isStatus() ? "Yes" : "No");
            str=  preparedStatement.executeUpdate();
            
            

        }catch(Exception ex){
                                                ex.printStackTrace();
                                                
                                } finally {
                                                try {
                                                                connection.close();
                                                                
                                                }catch (SQLException e) {
                                                                e.printStackTrace();
                                                }
                                }

		return str;
	}

	@Override
	public Register getRegistration(String username, String password) {
		Register r = new Register();
        Connection connection = ConnectionHandler.getConnection();
        try {
                String log = "select * from regform where userId = ? and password = ? ";
             PreparedStatement preparedStatement = connection.prepareStatement(log);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())  {
            	r.setUserId(rs.getString(1));
            	r.setPassword(rs.getString(2));
            	
            }

        } catch (SQLException e) { 
               e.printStackTrace(); 
                } finally {
                                                try {
                                                                connection.close();
                                                                
                                                }catch (SQLException e) {
                                                                e.printStackTrace();
                                                }
                                }
                   
    
 
        
     


		return r;
	}

	@Override
	public List<Register> getAdmin() {
		Connection con = ConnectionHandler.getConnection();

		List<Register> reg = new ArrayList<>();;
		try {
			
			 String insert="select * from  regform where Category=? and status=?";
	        	PreparedStatement preparedStatement = con.prepareStatement(insert);
	            //preparedStatement.setInt(1, 1);
	        	ResultSet r =   preparedStatement.executeQuery();
	        	  while (r.next()) {
	        		  Register m = new Register();
	           m.setFirstName(r.getString(1));
	         m.setLastName(r.getString(2));
	         m.setAge(r.getInt(3));
	            m.setGender(r.getString(4));
	            m.setContactNumber(r.getLong(5));
	            m.setCategory( r.getString(6));
	            m.setStatus(r.getString(7).equalsIgnoreCase("yes"));
	           reg.add(m);
      
		}
		}catch(Exception ex){
			ex.printStackTrace();
			
		} finally {
			try {
				con.close();
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return reg;
	}
}
		
		
