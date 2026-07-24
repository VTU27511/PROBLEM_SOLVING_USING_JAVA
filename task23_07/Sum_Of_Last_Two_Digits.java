package ProblemSolvingUsingJava.task23_07;

import java.util.Scanner;

public class Sum_Of_Last_Two_Digits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int cnt = 0;
        int sum = 0;
        while(n>0) {
            if(cnt==2) break;
            rem = n % 10;
            sum+=rem;
            cnt++;
            n /= 10;
        }
        System.out.println(sum);
    }
}
