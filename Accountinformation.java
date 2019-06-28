package atmmachine;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;

import java.util.Scanner;


public class Accountinformation {
	
		public void generalinformation()throws Exception
		{
			Scanner s=new Scanner(System.in);
			String url="jdbc:mysql://localhost:3306/atm2";
			String uname="root";
			String pass="";
			try {
			System.out.println("enter the accoutn number");
			int account_no=s.nextInt();
			String query="select *from account where account_no="+account_no+"";
			Class.forName("com.mysql.jdbc.Driver");

			Connection con=DriverManager.getConnection(url,uname,pass);

			Statement st =con.createStatement();

			ResultSet rs=st.executeQuery(query);

			rs.next();

			System.out.println("\t  information about account\nAccount Number: ");

			int accno=rs.getInt("account_no");

			System.out.print(accno);

			String accinfo="\nFirst Name :  "+rs.getString("first_name")+"  "+rs.getString("last_name")+"\nAddress:   "+rs.getString("address");

			System.out.print(accinfo);}catch(Exception e)
			{
				System.out.println("account number not found");
			}
			
			

			

		}


			
		}
	   
