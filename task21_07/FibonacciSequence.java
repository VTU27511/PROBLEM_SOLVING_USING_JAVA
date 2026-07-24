package ProblemSolvingUsingJava.task21_07;

import java.util.Scanner;

public class FibonacciSequence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0,second = 1,sum;
        for(int i = 0;i < n;i++) {
            if (i <= 1) {
                System.out.print(i + " ");
            } else {
                sum = first + second;
                System.out.print(sum + " ");
                first = second;
                second = sum;
            }
        }
    }
}
