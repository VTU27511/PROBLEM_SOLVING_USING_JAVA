package ProblemSolvingUsingJava.task23_07;

import java.util.Scanner;

public class Sum_Of_Even_Digits_And_Odd_Digits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0 ;
        int even = 0;
        int odd = 0;
        while(n>0){
            rem = n%10;
            if(rem%2==0) even+=rem;
            else odd+=rem;
            n=n/10;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
