package Problems;

import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int sum = 0;
        for (int i =1 ; i<=number;i++){
            if (i/10 == 0){
                if (i >= val1 && i <= val2){
                    sum+=i;
                }
            }else {
                int n = i;
                int mySum = 0;
                while (n !=0){
                    int myNumber = n%10;
                    mySum+=myNumber;
                    n/=10;
                }
                if (mySum >= val1 && mySum<=val2){
                    sum+=i;
                }

            }
        }
        System.out.println(sum);
    }
}
