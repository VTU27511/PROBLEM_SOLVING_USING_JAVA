package ProblemSolvingUsingJava.task23_07;

import java.util.Scanner;

public class Maximum_Element {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele>max) max = ele;
        }
        System.out.println(max);
    }
}
