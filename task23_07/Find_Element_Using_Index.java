package ProblemSolvingUsingJava.task23_07;

import java.util.Scanner;

public class Find_Element_Using_Index {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.print("Enter Idx : ");
        int idx = sc.nextInt();
        if(idx>=0&&idx<n) System.out.println(arr[idx]);
        else System.out.println("ArrayIndexOutOfBounds!!!");
    }
}
