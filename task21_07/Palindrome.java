package ProblemSolvingUsingJava.task21_07;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        boolean flag = true;
        for(int i=0;i<n.length()/2;i++){
            char a = n.charAt(i);
            char b = n.charAt(n.length()-1-i);
            if(a!=b){
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("It is a Palindrome");
        else System.out.println("It is not a Palindrome");
    }
}
