package atmmachine;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BankStatement {
	public void bank()throws Exception
	{Scanner s=new Scanner(System.in);
	String url="jdbc:mysql://localhost:3306/atm2";
	String uname="root";
	String pass="";
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("--------------Thapa bank----------\n");
	
	Connection con111=DriverManager.getConnection(url,uname,pass);



	Statement st111=con111.createStatement();

	Scanner sc111 =new Scanner(System.in);
	try {
	System.out.println("enter acount nu\n");
	int ac=sc111.nextInt();
System.out.println("enter pin number");
int pi=sc111.nextInt();
	 String sql ="select first_name from account where account_no ="+ac+"";
    
    ResultSet rsq=st111.executeQuery(sql);
    rsq.next();
    String name =rsq.getString("first_name");
    
    System.out.println("Account Holder name: "+name);
    System.out.println("CUrrency:Nepali");

	String qry111="select deposit,account_no from deposit where  account_no="+ac+"    ";

	ResultSet rs111=st111.executeQuery(qry111);
	System.out.println("Transcaction type           account no               amount");            
	while(rs111.next())

	{

		int depo=rs111.getInt("deposit");
		int a=rs111.getInt("account_no");
		  System.out.println("deposite                     "+a+"                      "+depo+"  ");                               
		
 
	

	}
	Connection con111w=DriverManager.getConnection(url,uname,pass);



	Statement st111w=con111w.createStatement();

	Scanner sc111w =new Scanner(System.in);
	

	String qry111w="select withdraws,account_no from withdraws where  account_no="+ac+"    ";

	ResultSet rs111w=st111w.executeQuery(qry111w);


	
	while(rs111w.next())

	{

		int with =rs111w.getInt("withdraws");
		int aa=rs111w.getInt("account_no");
		System.out.println("withdraw                     "+aa+"                       "+with+"  ");
		

	

	}}catch(Exception e) {
		System.out.println("invalid acount number");
		
	}
	}}
	
	

	

	
	

