package atmmachine;
import java.sql.*;
import java.util.Scanner;
public class Depositbalance
  {
	public void bal() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/atm2";
		String uname="root";
		String pass="";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,uname,pass);
	
		Statement st=con.createStatement();

		Scanner sc=new Scanner(System.in);
		try {
	     System.out.println("Enter the Account no \n");

     	 String Acno =sc.next();
     	 System.out.println("Enter amount \n");

            Scanner sc2=new Scanner(System.in);



             int deposite =sc2.nextInt();

             Connection con2=DriverManager.getConnection(url,uname,pass);

 			Statement st2=con2.createStatement();

              String query2= "insert into deposit (account_no,deposit)"

               + "values("+Acno+","+deposite+")";

                 st2.executeUpdate(query2);
}
catch(Exception e)
{
	System.out.println("Account number not found");
}
     	 
}
}