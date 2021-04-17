/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Memo
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "abcabcabcabcabcabcabcabcabcabc";
        String Sample = "abc";
        //System.out.println(s.length());
        char C[] = s.toCharArray();
        // System.out.println(C[0]);
        int n = 15;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            if (C[i] == 'a' && C[i + 1] == 'b' && 'c' == C[i + 2]) {
                count++;
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        System.out.println(count);

    }
}
