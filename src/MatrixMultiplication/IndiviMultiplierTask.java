/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixMultiplication;

/**
 *
 * @author AbdallaEssam
 */
public  class IndiviMultiplierTask implements Runnable {

    private final double[][] result;
 private double[][] matrix1;
 private double[][] matrix2;
 private final int row;
    private final int col;

 public IndiviMultiplierTask(double[][] result, double[][] matrix1, double[][] matrix2, int row,int col) {
  this.result = result;
  this.matrix1 = matrix1;
  this.matrix2 = matrix2;
  this.row = row;
  this.col = col;
 }

 @Override
 public void run() {
     
     result[row][col] =0;
     
for (int j = 0; j < matrix1[row].length; j++) {
    
    result[row][col] += matrix1[row][j] * matrix2[j][col];

   }
 }
}
