public class Transaction {
    public int id;

    public Transaction() {
    }

    public void doTransaction(BankAccount from, BankAccount to, int nextInt) {
        final long TIME_START = System.currentTimeMillis();
        int elapsedTime;
        try {
            System.out.println("Транзакция, созданная с банковского счета № " + from.numberOfBankAccount +
                    " на № " + to.numberOfBankAccount);
            int balanceBeforeTransaction = from.getBalance();
            int balanceBeforeTransaction2 = to.getBalance();

            from.withdraw(nextInt);
            to.deposit(nextInt);

            id++;
            elapsedTime = (int) (System.currentTimeMillis() - TIME_START);
            System.out.println("Транзакция: " + id + " (" +
                    from.accountName + " на " + to.accountName + ")" + " завершена с банковского счета № " +
                    from.numberOfBankAccount + "[" + balanceBeforeTransaction + "]"
                    + " на № " + to.numberOfBankAccount + "[" + balanceBeforeTransaction2 + "]" + " для: " + nextInt +
                    ", баланс после транзакции: " +
                    from.getBalance() + " / " + to.getBalance() + ", " + "Прошедшее время:" + elapsedTime +
                    "мс (" + Thread.currentThread().getName() + ")");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
