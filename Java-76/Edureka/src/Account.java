
public class Account {
  long acno;
  String name;
  float bal;
  
  /*---- constructors ---*/
  Account(){}
  
  Account(long acno, String name, float bal){
	  this.acno = acno;
	  this.name = name;
	  this.bal = bal;
  }
  
  /*--- method to deposit amount ----*/
  void deposit(float amt) {
	  this.bal = this.bal + amt;
	  System.out.println("Rs."+amt+" Credited | Balance: "+this.bal);
  }
  
  /*--- method to withdraw amount ----*/
  void withdraw(float amt) {
	  if(amt <= this.bal) {
	   this.bal = this.bal - amt;	  
	   System.out.println("Rs."+amt+" Debited | Balance: "+this.bal);
	  }
	  else {
		  System.out.println("ERROR: Insufficient Balance!");
	  }
  }
  
  /*--- method to get aaccount details ----*/
  void getDetails() {	  
	  System.out.println("A/C No: "+this.acno+" | NAME: "+this.name+" | BALANCE: "+this.bal);
  } 
}
