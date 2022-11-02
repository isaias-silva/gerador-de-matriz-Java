import java.util.Random;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("digite o quadrado: ");
       int n=sc.nextInt();
      int[][] numbers= new int[n][n];
      for(int i=0; i<n;i++){
          for(int j=0; j<n;j++){
              numbers[i][j]=new Random().nextInt(2);
          }
      }

       for(int i=0; i<n;i++){
           for(int j=0; j<n;j++){
               if(j==n-1){
                   System.out.println("["+numbers[i][j]+"]");
               }else {
                   System.out.print("["+numbers[i][j] + "]");
               }
           }
       }

    }

}