import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Userinput obj = new Userinput();
        Scanner sc = new Scanner(System.in); 
            System.out.println("If you want to insert the card in atm please enter 1");
            int card = sc.nextInt();
            if(card==1){
                System.out.println("Card has been inserted properly.");
                System.out.println("Welcome!");
                System.out.println("There are some choices which are represented with numbers.");
                System.out.println("If you want any choices, enter the respective number.");
                System.out.println("Then only, your choices will be executed.");
                System.out.println("Withdrawal: 0");
                System.out.println("Deposit: 1");
                System.out.println("Check Balance: 2");
                System.out.println("Enter your choice:");
            }
            int number = sc.nextInt();
            if(number==2){
                obj.Chceckbalance();
            }
            else if(number==0){
                obj.Withdrawl();
            }
            else if (number==1){
                obj.Deposit();
            }
            
            System.out.println("if you want to do change anything please enter 1 else enter any number");
            int num = sc.nextInt();
            while(num == 1){
                System.out.println("Enter any choices:");
                System.out.println("Deposit:1");
                System.out.println("Withdrawl:0");
                System.out.println("Check Balance:2");
                   number = sc.nextInt();
            if(number==2){
                 obj.Chceckbalance();
            }
            else if(number==0){
                obj.Withdrawl();
            }
            else if (number==1){
              obj.Deposit();
            }
            else{

            }
            System.out.println("if you want to do change anything please enter 1 else enter any number");
            num = sc.nextInt();
            
            }
        System.out.println("Thank you");
            System.out.println("Now you can remove the card");
    }
}
class Userinput{
    Scanner sc = new Scanner(System.in);
    int Balance = 5000;
    int newbalance = Balance;
    int ourbalance = newbalance;
   void Chceckbalance(){
    System.out.println("The balance in your account is"+" "+newbalance);
   }
   void Deposit(){
    System.out.println("The amount you want to Deposit in your account is:");
    int Deposit = sc.nextInt();
    newbalance = Balance+Deposit;
    System.out.println("Now the balance in your account is"+" "+newbalance);
   }
   void Withdrawl(){
    System.out.println("The amount you want to withdraw from your account is:");
    int Withdrawl = sc.nextInt();
    newbalance = Balance-Withdrawl;
    System.out.println("Now the balance in your account is"+" "+newbalance);
   }
}