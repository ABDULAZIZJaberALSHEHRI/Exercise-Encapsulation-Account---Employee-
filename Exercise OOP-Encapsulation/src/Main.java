import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Adding account 1
        Account account1 = new Account();
        account1.setId("1");
        account1.setName("Abdulaziz");
        account1.setBalance(2000);

        //Adding account 2
        Account account2 = new Account();
        account2.setId("2");
        account2.setName("Ahmed");
        account2.setBalance(5000);

        //Adding account 3
        Account account3 = new Account();
        account3.setId("3");
        account3.setName("Khalid");
        account3.setBalance(9000);

        //Account 1 information
        System.out.println("-------- Account 1 --------");
        System.out.println("Name: " + account1.getName());
        System.out.println("ID :" + account1.getId());
        System.out.println("balance: " + account1.getBalance());

        //Account 2 information
        System.out.println("-------- Account 2 --------");
        System.out.println("Name: " + account2.getName());
        System.out.println("ID :" + account2.getId());
        System.out.println("balance: " + account2.getBalance());

        //Account 3 information
        System.out.println("-------- Account 3 --------");
        System.out.println("Name: " + account3.getName());
        System.out.println("ID :" + account3.getId());
        System.out.println("balance: " + account3.getBalance());

        // starting chose accounts to apply all cases on it
        System.out.println("\nWelcome to bank accounts simulator, press zero to start control the accounts.");
        int options = input.nextInt();

        do {
            System.out.println("\n -Chose one of these three accounts to apply credit,debit and transfer money: " +
                    "\n1. press one for account 1" +
                    "\n2. press two for account 2" +
                    "\n3. press three for account 3"+
                    "\nto Exit press '-1'.");
            options=input.nextInt();

            // Account 1------------------------------------------------------------------------
            if (options == 1) {
                System.out.println("Account 1");
                System.out.println("Name: " + account1.getName());
                System.out.println("ID :" + account1.getId());
                System.out.println("Account '1' balance: " + account1.getBalance());

                System.out.println("for debit press '1' | for credit press '2' | for transaction press '3': ");
                options = input.nextInt();
                while (options>3 || options<1){
                    System.out.println("'INPUT OVER THE LIMIT, PLEASE ENTER 1 FOR DEBIT OR 2 FOR CREDIT OR 3 FOR TRANSFER'");
                    options = input.nextInt();
                }
                // debit operation ---------------------------------------
                if (options == 1) {
                    System.out.println("Enter amount of debit: ");
                    int user_debit = input.nextInt();
                    System.out.println("debit :");
                    account1.setBalance(account1.debit(user_debit));
                    System.out.println("Account '1' balance after debit: " + account1.getBalance());
                }// credit operation -------------------------------------
                if (options == 2) {
                    System.out.println("Enter amount of credit: ");
                    int user_credit = input.nextInt();
                    System.out.println("credit :");
                    account1.setBalance(account1.credit(user_credit));
                    System.out.println("Account '1' balance after credit: " + account1.getBalance());

                }// transferTo operation by choosing the wanted account to transfer to -------------------------------
                if (options ==3){
                    System.out.println(" |MONEY TRANSACTION| \n Enter 2 to transfer for account '2' " +
                            "\n or '3' to transfer for account '3' : ");
                    int transfer = input.nextInt();
                    while (transfer <2 || transfer >3){
                        System.out.println("'Invalid input' " +
                                "|MONEY TRANSACTION| \nEnter 2 to transfer for account '2'" +
                                "\n or '3' to transfer for account '3' : ");
                        transfer = input.nextInt();
                    }
                    if (transfer == 2) {
                        System.out.println("Enter amount of money: ");
                        int amount_ = input.nextInt();
                        System.out.println("transfer :");
                        account1.setBalance(account1.transferTo(account2, amount_));
                        System.out.println("Account '1' balance after transfer: " + account1.getBalance());
                    }
                    if (transfer == 3){
                        System.out.println("Enter amount of money: ");
                        int amount_ = input.nextInt();
                        System.out.println("transfer :");
                        account1.setBalance(account1.transferTo(account3, amount_));
                        System.out.println("Account '1' balance after transfer: " + account1.getBalance());
                    }
                }

            }
            // Account 2------------------------------------------------------------------------
            else if (options == 2) {
                System.out.println("Account 2");
                System.out.println("Name: " + account2.getName());
                System.out.println("ID :" + account2.getId());
                System.out.println("balance: " + account2.getBalance());

                System.out.println("for debit press '1' | for credit press '2' | for transaction press '3': ");
                options = input.nextInt();
                while (options>3 || options<1){
                    System.out.println("'INPUT OVER THE LIMIT, PLEASE ENTER 1 FOR DEBIT OR 2 FOR CREDIT OR 3 FOR TRANSFER'");
                    options = input.nextInt();
                }
                // debit operation ---------------------------------------
                if (options == 1) {
                    System.out.println("Enter amount of debit: ");
                    int user_debit = input.nextInt();
                    System.out.println("debit :");
                    account2.setBalance(account2.debit(user_debit));
                    System.out.println("Account '2' balance after debit: " + account2.getBalance());
                }
                // credit operation ---------------------------------------
                if (options == 2) {
                    System.out.println("Enter amount of credit: ");
                    int user_credit = input.nextInt();
                    System.out.println("credit :");
                    account2.setBalance(account2.credit(user_credit));
                    System.out.println("Account '2' balance after credit: " + account2.getBalance());
                }
                // transferTo operation by choosing the wanted account to transfer to -------------------------------
                if (options ==3){
                    System.out.println(" |MONEY TRANSACTION| \n Enter 1 to transfer for account '1' " +
                            "\n or '3' to transfer for account '3' : ");
                    int transfer = input.nextInt();
                    while (transfer <1 || transfer >3){
                        System.out.println("'Invalid input' " +
                                "|MONEY TRANSACTION| \nEnter 1 to transfer for account '1'" +
                                "\n or '3' to transfer for account '3' : ");
                        transfer = input.nextInt();
                    }
                    if (transfer == 1) {
                        System.out.println("Enter amount of money: ");
                        int amount_ = input.nextInt();
                        System.out.println("transfer :");
                        account2.setBalance(account2.transferTo(account1, amount_));
                        System.out.println("Account '2' balance after transfer: " + account2.getBalance());
                    }
                    if (transfer == 3){
                        System.out.println("Enter amount of money: ");
                        int amount_ = input.nextInt();
                        System.out.println("transfer :");
                        account2.setBalance(account2.transferTo(account3, amount_));
                        System.out.println("Account '2' balance after transfer: " + account2.getBalance());
                    }
                }

            }
            // Account 3------------------------------------------------------------------------
            else if (options == 3) {
                System.out.println("Account 3");
                System.out.println("Name: " + account3.getName());
                System.out.println("ID :" + account3.getId());
                System.out.println("balance: " + account3.getBalance());

                System.out.println("for debit press '1' | for credit press '2' | for transaction press '3': ");
                options = input.nextInt();
                while (options>3 || options<1){
                    System.out.println("'INPUT OVER THE LIMIT, PLEASE ENTER 1 FOR DEBIT OR 2 FOR CREDIT OR 3 FOR TRANSFER'");
                    options=input.nextInt();
                }
                // debit operation ---------------------------------------
                if (options == 1) {
                    System.out.println("Enter amount of debit: ");
                    int user_debit = input.nextInt();
                    System.out.println("debit :");
                    account3.setBalance(account3.debit(user_debit));
                    System.out.println("Account '3' balance after debit: " + account3.getBalance());
                }
                // credit operation ---------------------------------------
                if (options == 2) {
                    System.out.println("Enter amount of credit: ");
                    int user_credit = input.nextInt();
                    System.out.println("credit :");
                    account3.setBalance(account3.credit(user_credit));
                    System.out.println("Account '3' balance after credit: " + account3.getBalance());
                }
                // transferTo operation by choosing the wanted account to transfer to -------------------------------
                if (options ==3){
                    System.out.println(" |MONEY TRANSACTION| \n Enter 1 to transfer for account '1' " +
                            "\n or '2' to transfer for account '2' : ");
                    int transfer = input.nextInt();
                    while (transfer <1 || transfer >2){
                        System.out.println("'Invalid input' " +
                                "|MONEY TRANSACTION| \nEnter 1 to transfer for account '1'" +
                                "\n or '2' to transfer for account '2' : ");
                        transfer = input.nextInt();
                    }
                    if (transfer == 1) {
                        System.out.println("Enter amount of money: ");
                        int amount_ = input.nextInt();
                        System.out.println("transfer :");
                        account3.setBalance(account3.transferTo(account1, amount_));
                        System.out.println("Account '3' balance after transfer: " + account3.getBalance());
                    }
                    if (transfer == 2){
                        System.out.println("Enter amount of money: ");
                        int amount_ = input.nextInt();
                        System.out.println("transfer :");
                        account3.setBalance(account3.transferTo(account2, amount_));
                        System.out.println("Account '3' balance after transfer: " + account3.getBalance());
                    }
                }
            }
        }while (options != -1);

        System.out.println("\nAccount 1: "+account1.tostring());
        System.out.println("\nAccount 2: "+account2.tostring());
        System.out.println("\nAccount 3: "+account3.tostring());
    }

}