import java.util.Scanner;
public class BankTest 
{
	public static void main(String[] args) 
	{
		Bank bank = null;
		Scanner sc = new Scanner(System.in);

		System.out.print("which bank card?[1.SBI | 2.ICICI]: ");
		int opt = sc.nextInt();

		if(opt == 1){
			bank = new SBI();
		}
		else if(opt == 2){
			bank = new ICICI();
		}
		else{
			System.out.println("ERROR: Invalid Card");
			return;
		}

		bank.deposit(2000);
		bank.withdraw(1500);

		System.out.println(Bank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);
		System.out.println(bank.n);

		//Bank.n = 10; //error
	}
}
