public class SavingsAccount{
  // Class properties
  private int balance;

  //Class constructors
  public SavingsAccount() {
    balance = 0;
  }
  public SavingsAccount(int initialBalance) {
    balance = initialBalance;
  }

  public void greet(){
    System.out.println("Hello!");
  }

  public void showBalance(){
    /* Note: javadoc specifies void; ex. states to 'return' balance.
       I assume printing the balance meets both criteria.*/
    System.out.println(balance);
  }

  public void deposit(int howMuch) {
    if (howMuch > 0){
      System.out.println("Error: Negative value entered!");
    }
    else{
      balance = balance + howMuch;
    }
  }

  public void withdraw(int howMuch){
    if (howMuch > 0){
      System.out.println("Error: Negative value entered!");
    }
    else{
      balance = balance - howMuch;
    }
  }
}
