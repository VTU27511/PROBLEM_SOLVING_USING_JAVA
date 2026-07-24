package ProblemSolvingUsingJava.task21_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Salaries {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            li.add(sc.nextInt());
        }
        for(int ele:li){
            System.out.print((int)(ele+(ele*0.1))+" ");
        }

    }
}
