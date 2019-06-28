package atmmachine;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.Scanner;



public class Pinchange {

	public void pin() throws Exception

	{

		Scanner s=new Scanner(System.in);

		String url4="jdbc:mysql://localhost:3306/atm2";

		String uname4="root";

		String pass4="";
		Class.forName("com.mysql.jdbc.Driver");

		try {
		System.out.println("enter account number");
		int account=s.nextInt();
		
		
		Connection con5=DriverManager.getConnection(url4,uname4,pass4);

		Statement st5=con5.createStatement();

		String sql1="select pin  from account where  account_no="+account+"";
		ResultSet rs=st5.executeQuery(sql1);

		rs.next();

		int pinn=rs.getInt("pin");

		System.out.println("Enter your old pin number: ");
		

		int pin_no4=s.nextInt();
if(pin_no4==pinn) {
	

		System.out.println("Enter the new pin number:");

		int pin_no5=s.nextInt();

		String query5="update account set pin="+pin_no5+" where pin="+pin_no4+"";  

		
		st5.executeUpdate(query5);
		System.out.println("pin changed successfully");

	}
else
{
	System.out.println("Pin is incorrect try again");
}}
		catch(Exception e)
		{
			System.out.println("Account number not fount");
		}
	}}




