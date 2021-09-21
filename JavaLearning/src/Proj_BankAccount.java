public class Proj_BankAccount {

    private String owner;
    private int balance;




    public Proj_BankAccount(String owner){
        this(owner,0);
    }

    public Proj_BankAccount(String owner,int balance){
        this.owner=owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount >0){
            this.balance+=amount;
        }
        else{
            System.out.println("Amount to deposit must be greater than zero");
        }

    }

    public void withdraw(int amount){
        if(amount >0 && amount<=balance){
            this.balance-=amount;
        }
        else{
            System.out.println("Amount to withraw must be greater than zero and should be less than the balance");
        }

    }

    public static void main(String[] args) {
        Proj_BankAccount myAccount=new Proj_BankAccount("Ankit",20000);
        Proj_BankAccount demoAccount=new Proj_BankAccount("Demo");

        demoAccount.deposit(500);
        System.out.println("owner: "+demoAccount.getOwner());
        System.out.println("balance: "+demoAccount.getBalance());

        demoAccount.withdraw(1000); // warning
        System.out.println("owner: "+demoAccount.getOwner());
        System.out.println("balance: "+demoAccount.getBalance());
        System.out.println();

        System.out.println("owner: "+myAccount.getOwner());
        System.out.println("balance: "+myAccount.getBalance());

        System.out.println();

        System.out.println("Deposit 1000 to my account");

        myAccount.deposit(1000);

        System.out.println("owner: "+myAccount.getOwner());
        System.out.println("balance: "+myAccount.getBalance());

    }
}
