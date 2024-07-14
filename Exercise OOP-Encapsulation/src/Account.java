import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Account {
    private String id;
    private String name;
    private int balance;


    public Account() {

    }
    public Account(String id, String name){
        this.name=name;
        this.id=id;
    }
    public Account(String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }


    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBalance(int balance){
        if (balance <0){
            System.out.println(" 'OPERATION DENIED THERE IS NO MONEY IN THE ACCOUNT'");
        }else this.balance=balance;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        if (balance > 0){
            balance = balance-amount;
            return balance;
        }else System.out.println(" 'OPERATION DENIED THERE IS NO MONEY IN THE ACCOUNT'");

        return 0;
    }

    public int debit(int amount){


        balance = amount + balance;

        return balance;
    }
    public int transferTo(Account account, int amount){
        if (balance > 0){
            balance = balance-amount;
            account.balance +=amount;
            System.out.println("|TRANSFER COMPLETE|");
            return balance;
        }else System.out.println(" 'OPERATION DENIED THERE IS NO MONEY IN THE ACCOUNT'");


        return 0;
    }
    public String tostring(){
        return "\nName: "+name + "\nID: " +id + "\nBalance: "+balance;
    }
}
