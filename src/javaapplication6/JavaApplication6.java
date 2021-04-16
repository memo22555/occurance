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
String s="abcabcabc";
        String Sample = "abc";
int n=0;
int position=0;
for(int i=0;true;i++){
   int result= s.indexOf(Sample, position);
    if (result !=-1){
        n++;
        position+=3;
      
    }else
        break;
}
        System.out.println(n);
    }
    
}
