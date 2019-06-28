package atmmachine;
import java.util.Scanner;

public class MainClass {
	

	public static void main(String args[])throws Exception
	{
		while (true) {
			System.out.println("!!!welcome to the Thapa bank!!!\n");
			System.out.println("enter your choice:1.goto bank\n2.goto atm\n3.exit");
			Scanner sa = new Scanner(System.in);
			int choice = sa.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("------welcome to the banking service-------\n");
			System.out.println("1.--creat your bank account--\n2.--deposit--");
			int choice1=sa.nextInt();
			
			switch(choice1) {
			case 1:
			Bankaccount obj1=new Bankaccount();
			obj1.method();
			System.out.println("-----Thank You for creating Bank account--------");
			break;
			
			case 2:
				Depositbalance d= new Depositbalance();
				d.bal();
				break;
			}break;
			case 2: 
				System.out.println("welcome to the atm service\n");
				System.out.println("1.--balanceenquiry--\n2.--withdraw--\n3.--bankstatement--\n4.--generalinformation--\n5.--pinchange--");
				int choice2=sa.nextInt();
				switch(choice2) {
				case 1:
					Balanceenquiry bn=new Balanceenquiry();
					bn.balance();break;
				case 2:
					withdraws wd=new withdraws();
					wd.draws();break;
									
				case 3:
					BankStatement bs=new BankStatement();
					bs.bank();break;
				case 4:
					Accountinformation ai=new Accountinformation();
					ai.generalinformation();break;
				case 5:
					Pinchange pn=new Pinchange();
					pn.pin();break;}
				break;
			case 3:System.exit(0);
			break;
			default:
			System.out.println("Invalid input try againg");
				
				
				
		}
		}
	}
}




					

	

		
		
	


