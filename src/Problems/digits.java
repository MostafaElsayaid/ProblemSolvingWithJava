package Problems;


import java.util.Scanner;

public class digits {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int size = scanner.nextInt();
           for (int i = 0 ; i<size ; i++){
              int value =  scanner.nextInt();
              if (value==0){
                  System.out.println(0);
                  continue;
              }
              while (value!=0){
                  int myNumber = value%10;  // 121 mynumber = 12.1
                  System.out.print(myNumber + " ");
                  value/=10;
              }
               System.out.println();
           }
       }


    }
