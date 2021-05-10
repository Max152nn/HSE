import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService ser = Executors.newFixedThreadPool(10);
        Bank runBank = new Bank();
        for (int i = 0; i <= 100; i++) {
            ser.submit(runBank);
        }
        ser.shutdown();
        ser.awaitTermination(1, TimeUnit.DAYS);
    }
}
