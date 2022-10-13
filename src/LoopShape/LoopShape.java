package LoopShape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
    	//topline
    	//loop from 1-width
    	for (int counter=1;counter<=width;counter++) {
    		//print out symbol
    		System.out.print("#");
    		
    	//print out your newline\
    	}
    	System.out.println();
        for (int counter=1; counter<=height-2;counter++) {
        	System.out.print("#");
        	for (int counter2=0;counter2<width-2;counter2++) {
        		System.out.print(" ");
        	}
        	if (width>1) {
        		System.out.println("#");
        	}else {
        		System.out.println();
        	}
        }
        for (int boi=1; boi<width+1; boi++) {
    		System.out.print("#");
	}
//        System.out.println();
//        for (int counter=1; counter<=height-2;counter++) {
//        	System.out.println("#");
        }
    
    	
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        
        
    }
}
