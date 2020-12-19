/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barrier;

import java.util.logging.Level;
import java.util.logging.Logger;


public class New_barrier {
    public static void main(String[] args){
     Barrier bar = new Barrier_sem(2);
     
     Thread t1 = new Thread(new Runnable() {
         
     @Override 
     public void run(){
     for(int z =0 ; z<2 ; z++ )
     {
       System.out.println(z);
       try{
           Thread.sleep(1000);
       }catch (InterruptedException ex) {
       Logger.getLogger(New_barrier.class.getName()).log(Level.SEVERE , null ,ex);
       }
       
     }
     
     System.out.println("barrier boint is wait");
     bar.barrierPoint();
     System.out.println("barrier boint is exite");
     
     
     }
     });
        Thread t2 = new Thread(new Runnable() {
         
     @Override 
     public void run(){
     for(int z =0 ; z<2 ; z++ )
     {
       System.out.println(z);
       try{
           Thread.sleep(1000);
       }catch (InterruptedException ex) {
       Logger.getLogger(New_barrier.class.getName()).log(Level.SEVERE , null ,ex);
       }
       
     }
     
     System.out.println("barrier boint is wait");
     bar.barrierPoint();
     System.out.println("barrier boint is exite");
     
     
     }
     });
        Thread t3= new Thread(new Runnable() {
         
     @Override 
     public void run(){
     for(int z =0 ; z<2 ; z++ )
     {
       System.out.println(z);
       try{
           Thread.sleep(1000);
       }catch (InterruptedException ex) {
       Logger.getLogger(New_barrier.class.getName()).log(Level.SEVERE , null ,ex);
       }
       
     }
     
     System.out.println("barrier boint is wait");
     bar.barrierPoint();
     System.out.println("barrier boint is exite");
     
     
     }
     });
       
        Thread t4 = new Thread(new Runnable() {
         
     @Override 
     public void run(){
     for(int y =0 ; y<2 ; y++ )
     {
       System.out.println(y);
       try{
           Thread.sleep(1000);
       }catch (InterruptedException ex) {
       Logger.getLogger(Driver.class.getName()).log(Level.SEVERE , null ,ex);
       }
       
     }
     
     System.out.println("barrier boint is wait");
     bar.barrierPoint();
     System.out.println("barrier boint is exite");       
             
    }
    
});
         Thread t5 = new Thread(new Runnable() {
         
     @Override 
     public void run(){
     for(int y =0 ; y<2 ; y++ )
     {
       System.out.println(y);
       try{
           Thread.sleep(1000);
       }catch (InterruptedException ex) {
       Logger.getLogger(Driver.class.getName()).log(Level.SEVERE , null ,ex);
       }
       
     }
     
     System.out.println("barrier boint is wait");
     bar.barrierPoint();
     System.out.println("barrier boint is exite");       
             
    }
    
});
          Thread t6= new Thread(new Runnable() {
         
     @Override 
     public void run(){
     for(int y =0 ; y<2 ; y++ )
     {
       System.out.println(y);
       try{
           Thread.sleep(1000);
       }catch (InterruptedException ex) {
       Logger.getLogger(Driver.class.getName()).log(Level.SEVERE , null ,ex);
       }
       
     }
     
     System.out.println("barrier boint is wait");
     bar.barrierPoint();
     System.out.println("barrier boint is exite");       
             
    }
    
});
        t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();
         t6.start();
    }
}