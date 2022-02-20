package com.mycompany.bukatutupjalan;

/**
 *
 * @author Hanri
 */
import java.util.Scanner;
public class BukaTutupJalan {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        String a = input.nextLine();
        String[] b = a.split(" ");
        String result = "";
        
        for (String x : b){
            result += x;
        }

        long plat = Long.parseLong(result);

        if ((plat - 999999)%5 == 0){
        	System.out.println("berhenti");
        }
        else {
        	System.out.println("jalan");
        }
        input.close();
    }
}