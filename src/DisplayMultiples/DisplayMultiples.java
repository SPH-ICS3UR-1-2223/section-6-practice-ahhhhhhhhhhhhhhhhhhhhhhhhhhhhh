package DisplayMultiples;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
    	Scanner in = new Scanner (System.in);
    	System.out.println("Give me a number!");
    	int First= in.nextInt();
    	for (int Numsec = 1; Numsec<=12; Numsec++) {
    		System.out.println(Numsec*First);
    	}
    	
    }

}
