package com.mycompany.gajiagent;

/**
 *
 * @author Hanri
 */
import java.util.Scanner;
public class GajiAgent {

public static void main(String[] args) {
		int totalbarang;
		double bonus, denda, totalgaji = 0; 
		Scanner input = new Scanner(System.in);
		totalbarang = input.nextInt();
		if(totalbarang > 80) {
			bonus = (35*0.01)*(totalbarang*50000);
			totalgaji = 500000 + bonus;
		}
                else if(totalbarang >= 40){
			bonus = (25*0.01)*(totalbarang*50000);
			totalgaji = 500000 + bonus;
		}
                else if (totalbarang < 15) {
			totalbarang = 15 - totalbarang;
			denda = (15*0.01)*(totalbarang*50000);
			totalgaji = 500000 - denda;
		}
                else {
			bonus = (10*0.01)*(totalbarang*50000);
			totalgaji = 500000 + bonus;	
		}
                
		System.out.println((int)totalgaji);
		input.close();
	}
}    