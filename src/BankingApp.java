import  java.util.*;
public class BankingApp {
    public  static void  main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, BankAccount> accounts = new HashMap<>();
        int nextAccountNumber = 1001;
        while (true) {
            System.out.println("\n--- BANK MENU---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Account Info");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter acccount holder name:");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    BankAccount newAccount = new BankAccount(name, nextAccountNumber);
                    accounts.put(nextAccountNumber, newAccount);
                    System.out.println("Account created successfully Account No:" + nextAccountNumber);
                    nextAccountNumber++;
                }
                case 2 -> {
                    System.out.println("Enter account number");
                    int accNo = scanner.nextInt();
                    BankAccount account = accounts.get(accNo);
                    if (account != null) {
                        System.out.println("Enter the amount: ");
                        double amount = scanner.nextDouble();
                        account.depost(amount);
                    } else {
                        System.out.println("Account not found");
                    }
                }
                case 3 -> {
                    System.out.println("Enter the account number: ");
                    int accNo = scanner.nextInt();
                    BankAccount account = accounts.get(accNo);
                    if (accounts != null) {
                        System.out.println("Enter the amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        account.withdraw(amount);

                    } else {
                        System.out.println("Account not found");
                    }
                }
                case 4 -> {
                    System.out.println("Enter the account number");
                    int accNo = scanner.nextInt();
                    BankAccount account = accounts.get(accNo);
                    if (account != null) {
                        account.displayInfo();
                    } else {
                        System.out.println("Account not found");
                    }
                }

                case 5 -> {
                    System.out.println("Thankyou fo rusing banki cli app");
                    return;
                }
                default -> System.out.println("Invalid choice Please try again");


            }

        }
    }
}
