package com.postgresqltutorial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class data1 extends App

{

public static void main(String[] args) {
		
		App d = new App();
		
		
	
		Scanner s =new Scanner(System.in);
		
		System.out.println("enter name");
		String name;
		name = s.nextLine();
		
		System.out.println("enter Age");
		int age = s.nextInt();
		
		System.out.println("enter id");
		int id = s.nextInt();
		
		System.out.println("enter Address");
		s.nextLine();
		String add = s.nextLine();
		
		System.out.println("enter Email Address");
		String email = s.nextLine();
		Connection conn = null;
		try {
			conn = d.connect();
		}
		catch(Exception e){
		 e.printStackTrace();
		}
		System.out.println("enter Email Address");
		
		PreparedStatement st = null;
	//	d.connect();
		
	      try {
	    st = conn.prepareStatement("INSERT INTO userdata (id,name,age,address,email) VALUES (?,?,?,?,?)");
		 
	      st.setInt(1,id);
	      st.setString(2,name);
	      st.setInt(3,age);
	      st.setString(4,add);
	      st.setString(5,email);
	      
	      st.execute();
	      System.out.println("DONE");
	      
			}

			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		/*
		 * catch (ClassNotFoundException cnf) { cnf.printStackTrace(); }
		 */
			finally
			{
				try 
				{
					if(st!=null)
						st.close();
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
			}
  		}
		}

