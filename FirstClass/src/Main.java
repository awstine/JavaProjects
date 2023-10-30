package FirstClass.src;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Account testAccount = new Account(1342,30000,4.5);
            if(testAccount.withdraw(2000))
                System.out.println("Success");
            else
                System.out.println("Haiwesss");

            testAccount.deposit(200);
        System.out.print(testAccount.getId() + ":deposit\n"+
                testAccount + testAccount.getBalance() + ":Balance \n" +
                testAccount.getAnnualInterestRate()+":AnnualInterestRate \n"+
                testAccount.getDateCreated());
    }
}