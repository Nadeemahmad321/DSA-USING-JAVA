package FUNDAMENTALS.FIBONACCI_SERIES;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term you want:");
        int nthTerm = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        if(nthTerm == 0){
            System.out.print(firstTerm);
        }
        if(nthTerm == 1 ){
            System.out.print(secondTerm);
        }
        for(int i = 3;i<=nthTerm;i++){
            System.out.println(firstTerm);
            System.out.println(secondTerm);
            int thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            System.out.println(thirdTerm);
        }


    }
}
