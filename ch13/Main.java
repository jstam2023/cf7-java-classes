package gr.aueb.cf.ch13;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(1, "GR223423424", "Alice", "Cooper", "S123245",1000.0);

        try {
            account.deposit(900);
            System.out.println("The deposit was successful.");

            account.withdraw(500, "S123245");
            System.out.println("The withdraw was successful.");

            System.out.println("Balance " + account.getAccountBalance());
            System.out.println(account.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }//end main
}
