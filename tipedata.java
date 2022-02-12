package com.mycompany.tipedata;
import java.util.*;
import java.io.*;
/**
 *
 * @author FAKHRI
 */
class tipedata {
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x = sc.nextLong();
                
                // Java Datatypes - HackerRank Solution START
                
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                {
                    System.out.println("* byte");
                }
                if(x>=-32768 && x<=32767)
                {
                    System.out.println("* short");
                }
                if(x>=-2147483648 && x<=2147483647)
                {
                    System.out.println("* int");
                }
                System.out.println("* long");
                
                // Java Datatypes - HackerRank Solution END
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
