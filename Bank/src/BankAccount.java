import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount extends Account {

    public int balance;
    public int numberOfBankAccount;
    final Lock lock = new ReentrantLock();

    public BankAccount(String accountName, int balance, int numberOfBankAccount) {
        super(accountName);
        this.balance = balance;
        this.numberOfBankAccount = numberOfBankAccount;
    }


    public void withdraw(int amount) throws Exception {
        synchronized (lock) {
            int balanceException = getBalance() - amount;
            if (balanceException <= 0) {
                throw new Exception("Ошибка транзакции: Недостаточно денег для перевода, банковский счет №" + numberOfBankAccount +
                        ", недостаточно: " + balanceException);
            }
            this.balance = getBalance() - amount;
        }
    }

    public void deposit(int amount) {
        synchronized (lock) {
            this.balance = getBalance() + amount;
        }
    }


    public int getBalance() {
        synchronized (lock) {
            return this.balance;
        }
    }

}
