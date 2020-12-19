package MatrixMultiplication;
import java.util.ArrayList;
import java.util.List;

public class GroupMultiplier {
    
    public static void multiply(double[][] matrix1, double[][] matrix2, double[][] result){
        List threads = new ArrayList<>();
        int rows1 = matrix1.length;
         int col1 =matrix1[0].length;
         
       
       int xxx=0;
        for (int i = 0; i < rows1; i++) {
            RawMultiplierTask task = new RawMultiplierTask(result, matrix1, matrix2, i);
          if(xxx<rows1) { 
         Thread thread = new Thread(task);
         thread.start();
         threads.add(thread);
         if (threads.size() % 10 == 0) {
          waitForThreads(threads);
         }
         xxx++;
          }
        }
    }
    
    protected static void waitForThreads(List<Thread> threads) {
        for (Thread thread : threads) {
            try {
             thread.join();
            } catch (InterruptedException e) {
             e.printStackTrace();
            }
           }
           threads.clear();
          
    }
}
