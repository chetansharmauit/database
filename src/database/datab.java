package database;

import java.util.*;

public class datab {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("enter name");
		String name;
		name = s.nextLine();
		
		System.out.println("enter Age");
		int Age = s.nextInt();
		
		System.out.println("enter Address");
		s.nextLine();
		String add = s.nextLine();
		
		System.out.println("enter Email Address");
		String email = s.nextLine();
		
		System.out.println(name + Age +add+email);		
	}
}
