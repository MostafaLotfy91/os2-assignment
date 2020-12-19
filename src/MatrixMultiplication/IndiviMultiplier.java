package MatrixMultiplication;
import java.util.ArrayList;
import java.util.List;

public class IndiviMultiplier {
    
    public static void multiply(double[][] matrix1, double[][] matrix2, double[][] result){
        List threads = new ArrayList<>();
        int rows1 = matrix1.length;
        int col1 =matrix1[0].length;
        for (int i = 0; i < rows1; i++) {
       for(int j=0 ; j<col1;j++){    
            IndiviMultiplierTask task = new IndiviMultiplierTask(result, matrix1, matrix2, i,j);
         Thread thread = new Thread(task);
         thread.start();
         threads.add(thread);
         if (threads.size() % 10 == 0) {
          waitForThreads(threads);
         }
        }
        }
    }
    
    protected static void waitForThreads(List<Thread> threads) {
        threads.forEach((thread) -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
           threads.clear();
          
    }
}
