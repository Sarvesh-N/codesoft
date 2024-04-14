import java.util.Scanner;

class Bankaccount{
    double balance;

    public Bankaccount(double balance){
        this.balance = balance;
    }

    public double balance(){
        return balance;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited:"+amount);
        System.out.println("Now the balance is :"+balance);
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdrawed amount :"+amount);
            System.out.println("Now the balance is :"+balance);
        }
        else {
            System.out.println("Invalid balance");
        }
    }
}

class Atm{
    private Bankaccount bankaccount;
    private Scanner scanner;

    public Atm(Bankaccount bankaccount){
        this.bankaccount = bankaccount;
        this.scanner = new Scanner(System.in);
    }
    public void displaymenu(){
        System.out.println("ATM");
        System.out.println("1.balance");
        System.out.println("2.deposit");
        System.out.println("3.withdraw");
        System.out.println("4.exit");
    }

    public void Checkbalance(){
        System.out.println("the balance is :"+bankaccount.balance());
    }
    public void deposit(){
        System.out.print("enter the amount to be deposited :");
        double amount = scanner.nextDouble();
        bankaccount.deposit(amount);
    }
    public void withdraw(){
        System.out.print("enter the amount to withdraw :");
        double amount = scanner.nextDouble();
        bankaccount.withdraw(amount);
    }

    public void displayoption(int option){
        switch (option){
            case 1:
                Checkbalance();
                break;
            case 2:
                deposit();;
                break;
            case 3:
                withdraw();
                break;
            case 4:
                System.out.println("Exiting Atm");
                System.exit(0);
                break;
            default:
                System.out.println("enter the valid option");
        }
    }
}

class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        Bankaccount bankaccount = new Bankaccount(1000);
        Atm atm = new Atm(bankaccount);

        while(true){
            atm.displaymenu();
            System.out.print("choose an option:");
            int option = s.nextInt();
            atm.displayoption(option);
        }
    }
}
