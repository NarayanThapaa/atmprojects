package atmmachine;
import java.sql.*;
import java.util.Scanner;
public class Bankaccount {
public void method() throws Exception{
String url="jdbc:mysql://localhost:3306/atm2";
String uname="root";
String pass="";
Scanner sc=new Scanner(System.in);
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(url,uname,pass);
Statement st=con.createStatement();


System.out.println("enter your firstname\n");
String fn=sc.nextLine();
System.out.println("enter your last name\n");
String ln=sc.nextLine();
System.out.println("enter your contact number");
int cont=sc.nextInt();
System.out.println("enter your address");
String add=sc.next();
System.out.println("create account");
int ac=sc.nextInt();
System.out.println("create pin");
int pin=sc.nextInt();
String query="INSERT INTO account(first_name,last_name,contact,address,pin,account_no)VALUES ('"+fn+"','"+ln+"','"+cont+"','"+add+"',"+pin+","+ac+")";

st.executeUpdate(query);



//st.close();
//con.close();
}

}



