

package javaapplication43;
import java.util.*;


public class Strcount{

    
  
    public static void main(String[] args) {
        Scanner gh=new Scanner(System.in);
          String s=gh.next();
    int count = 0 ;

    for (int i = 0; i < s.length(); i++) {

        for (int j = 0; j < s.length(); j++) {
            
            if(s.charAt(i)!=' ')
            {

            if(s.charAt(i)==s.charAt(j))
            {
               count++;

            }
            }
        }   
       if(s.charAt(i)==' ')
       {
           
       }
       else
       {
        System.out.println(s.charAt(i)+"="+count);
        String d=String.valueOf(s.charAt(i));
        s=s.replaceAll(d," ");
        count = 0;
       }

    }

}
    }
    

