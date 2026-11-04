import transaction.Account;
import report.TransactionReport;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Account no: ");
        
        
        int x = sc.nextInt();
        
        System.out.print("Enter balance: ");
        
        double y = sc.nextDouble();

        
        Account a = new Account(x, y);
        
        
         
         
        
        a.deposit(1000);
        a.withdraw(5000);

        
        TransactionReport t = new TransactionReport();

        t.generateReport(a);
        
        
        sc.close();
    }
}