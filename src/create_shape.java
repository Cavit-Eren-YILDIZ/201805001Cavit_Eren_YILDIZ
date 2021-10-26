import java.util.Scanner;
	public class create_shape {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			while(true) {
				String OpenAndClose=scanner.nextLine();	
				if (OpenAndClose.equals("q")) {
					System.out.print("exiting the system.");
					break;
				}
				else {
					System.out.println("Please enter Number");
					int star=scanner.nextInt();
					if (star%2==1) {
						for (int i= 0; i<= star-1; i+=2)  {  
							for (int j=0; j<i; j++) {  
								System.out.print(" ");  
							}  
							for (int k=i; k<=star-1; k++)   {   
								System.out.print("* ");   
							}   
								System.out.println("");   
							} 
						for (int i=0; i<star+1; i+=2)   {  
								     
							for (int j=star-i; j>1; j--)   {  
									
								System.out.print(" ");   
							}   
									
							for (int j=0; j<=i; j++ )   {   
								System.out.print("* "); 
							}   
									  
							System.out.println();
							}
						}
					else if (star%2==0) {
						for (int i= 0; i<= star-1; i+=2)  {  
							for (int j=0; j<i; j++) {  
								System.out.print(" ");  
							}  
							for (int k=i; k<=star-1; k++)   {   
									System.out.print("* ");   
								}   	
							System.out.println("");   
							} 
						for (int i=1; i<star+1; i+=2)   {      
							for (int j=star-i; j>1; j--)   {  
								System.out.print(" ");   
								}   
							for (int j=0; j<=i; j++ )   {   
								System.out.print("* "); 
								}   	  
							System.out.println();   
						}	
					}		
					else {
						System.out.print("exiting the system...");
						break;
					}	
				}
			}
		scanner.close();
		}		
	}			

	

