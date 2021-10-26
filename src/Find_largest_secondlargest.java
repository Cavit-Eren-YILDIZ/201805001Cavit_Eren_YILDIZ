import java.util.Scanner;

public class Find_largest_secondlargest {

	public static void main(String[] args) {
    

	    Scanner scanner=new Scanner(System.in);
	    int num;
	    int i=0;
	    int largest=0;
	    int secondlargest=0;
	
	    while(i<10){
	
	    	System.out.println("Enter number:");
	        num=scanner.nextInt();
	
	        if(num>largest){
	
	        	secondlargest=largest;
	            largest=num;
	            }
	
	
	        else{
	
	        	if(num>secondlargest) {
	        		secondlargest=num;
	        	} 
	        }
	        i++;
	    }
    System.out.println("largest number is "+largest);
    System.out.println("and second largest number is "+secondlargest);

scanner.close();
	}

}

