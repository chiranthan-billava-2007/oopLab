package report;

import transaction.Account;

public class TransactionReport {

    public void generateReport(Account account) {

        System.out.println("\n----- TRANSACTION REPORT -----\n");

        System.out.println("Account Number: "
                + account.getAccountNumber());

        System.out.println("Balance: "
                + account.getBalance());

        System.out.println("------------------------------");
    }
}