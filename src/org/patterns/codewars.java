package org.patterns;

import java.util.Stack;

public class codewars {
    public static void main(String[] args) {
        int[] input = {1,2,2,3,3,3,4,3,3,3,2,2,1};
        int out = findIt(input);
        System.out.println(out);

    }
    public static int findIt(int[] a) {
        Stack stack = new Stack();
        int[] duplicate = a;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < duplicate.length; j++) {
                if(a[i] == duplicate[j]){
                    count += 1;
                }
            }
            if (count % 2 != 0){
                stack.push(a[i]);
            }
        }
        return (int) stack.peek();
    }

}
