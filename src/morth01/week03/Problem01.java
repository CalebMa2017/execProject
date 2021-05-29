package morth01.week03;

import java.util.Scanner;
import java.util.Stack;

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < next.length(); i++) {
            char c = next.charAt(i);
            if(c=='(') {
                stk.push('(');
            }else if(c==')') {
                if(stk.empty()) System.out.println("NO");
                System.exit(0);
                stk.pop();
            }
        }
        if(stk.empty()) System.out.println("YES");
        else System.out.println("NO");
    }
}
