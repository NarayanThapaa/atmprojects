package atmmachine;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.Statement;

import java.util.Scanner;



public class withdraws {

	public void draws() throws Exception

	{

		Scanner s=new Scanner(System.in);

		String url2="jdbc:mysql://localhost:3306/atm2";

		String uname2="root";

		String pass2="";

		System.out.println("enter your account no:");

		int accountno=s.nextInt();

		System.out.println("Enter the amount to withdraw:");

		int withdraw=s.nextInt();

		String query2="INSERT INTO withdraws(account_no,withdraws)VALUES("+accountno+","+withdraw+")";

		Class.forName("com.mysql.jdbc.Driver");

		Connection con2=DriverManager.getConnection(url2,uname2,pass2);

		Statement st2=con2.createStatement();

		st2.executeUpdate(query2);

	}



}