import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank implements Runnable {
    List<Transaction> transactionList = new ArrayList<>();
    List<BankAccount> bankAccounts = new ArrayList<>();
    Random random = new Random();

    Bank() {
        for (int i = 1; i <= 10; i++) {
            bankAccounts.add(new BankAccount("Account " + i, random.nextInt(1000), random.nextInt(1000000)));
        }
    }

    Transaction transaction = new Transaction();

    @Override
    public void run() {
        System.out.println("Поток запущен " + Thread.currentThread().getName());
        BankAccount from = null;
        BankAccount to = null;

        while (true) {
            int a1 = random.nextInt(5);
            int a2 = random.nextInt(5);
            if (a1 == a2)
                continue;
            from = bankAccounts.get(a1);
            to = bankAccounts.get(a2);
            break;
        }
        transaction.doTransaction(from, to, random.nextInt(400));
        transactionList.add(transaction);


    }


}