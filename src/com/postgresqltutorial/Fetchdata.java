package com.postgresqltutorial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.net.httpserver.Authenticator.Result;

public class Fetchdata {

	public static void main(String[] args) {
		 App app = new App();
	   //  app.connect();
	     Connection conn = app.connect();
	     ResultSet rs = null;
	     Statement stmt = null;
	    
	     try {
	    	stmt = conn.createStatement(); 
	    	String sql = "Select name from userdata;"; 
	 	    rs = stmt.executeQuery(sql);
	 	    while(rs.next())
	 	    {	
	 	    String name = rs.getString("name");
	 	    System.out.println(name);
	 	    	
	 	    }	
	 	 /*   String test1 = st.
	 	    st.execute();
	 	      System.out.println(test1);*/
	 	      
	 			}

	 			catch (SQLException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 			}
	     
			

	}

}
