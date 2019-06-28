package atmmachine;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Makepdf {
	public static void main(String[]args)throws Exception
	{Scanner s=new Scanner(System.in);
	String url="jdbc:mysql://localhost:3306/atm2";
	String uname="root";
	String pass="";
	Class.forName("com.mysql.jdbc.Driver");
	
	
	Connection con111=DriverManager.getConnection(url,uname,pass);



	Statement st111=con111.createStatement();

	Scanner sc111 =new Scanner(System.in);
	try {
	System.out.println("enter acount nu\n");
	int ac=sc111.nextInt();

	 String sql ="select first_name from account where account_no ="+ac+"";
    
    ResultSet rsq=st111.executeQuery(sql);
    rsq.next();
    String name =rsq.getString("first_name");
    Document doc=new Document();

	PdfWriter.getInstance(doc, new FileOutputStream("E:/Bankstatement.pdf "));

	doc.open();
	doc.add(new Paragraph("--------------Thapa bank----------\n"));
	doc.add(new Paragraph("Account Holder name: "+name));
	doc.add(new Paragraph("CUrrency:Nepali"));

	String qry111="select deposit,account_no from deposit where  account_no="+ac+"    ";

	ResultSet rs111=st111.executeQuery(qry111);
	doc.add(new Paragraph("Transcaction type           account no               amount"));            
	while(rs111.next())

	{

		int depo=rs111.getInt("deposit");
		int a=rs111.getInt("account_no");
		doc.add(new Paragraph("deposite                     "+a+"                      "+depo+"  "));                               
		
 
	

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
		doc.add(new Paragraph("withdraw                     "+aa+"                       "+with+"  "));
		
doc.close();
System.out.println("pdf is ready");
	

	}}catch(Exception e) {
		System.out.println(e);
		
	}
	}}
	
	

	

	
	

