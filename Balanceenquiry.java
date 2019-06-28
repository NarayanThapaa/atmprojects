package atmmachine;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Balanceenquiry {
	void balance()throws Exception 
	{
		Scanner s=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/atm2";
		String uname="root";
		String pass="";
		 //get total deposite

		Connection con111=DriverManager.getConnection(url,uname,pass);



		Statement st111=con111.createStatement();

		Scanner sc111 =new Scanner(System.in);
		try {
		System.out.println("enter acount nu\n");
		int ac=sc111.nextInt();

		String qry111="select deposit from deposit where  account_no="+ac+"    ";

		ResultSet rs111=st111.executeQuery(qry111);

		int tdepo=0;
		
		while(rs111.next())

		{

			int depo=rs111.getInt("deposit");
			

		tdepo+=depo;

		}

		

		System.out.println("Total deposite:"+tdepo);
		//get total withdraw
		
		Connection con111w=DriverManager.getConnection(url,uname,pass);



		Statement st111w=con111w.createStatement();

		Scanner sc111w =new Scanner(System.in);
		

		String qry111w="select withdraws from withdraws where  account_no="+ac+"    ";

		ResultSet rs111w=st111w.executeQuery(qry111w);

		int twith=0;
		
		while(rs111w.next())

		{

			int with =rs111w.getInt("withdraws");
			

		twith+=with;

		}

		

		System.out.println("Total withdraw:"+twith);
		
		//total avaianle
		int tava=tdepo-twith;
		System.out.println("Total available balance: "+tava);
		
		
		
		}catch(Exception e) {
			System.out.println("invalid account number");
		}
		
		
	}

}
