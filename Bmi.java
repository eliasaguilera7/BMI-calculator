
/*Name: Elias Aguilera
  Student Number: ************
  Assignment: Heart Calculator Application
  Date. October 21, 2018


*/

import java.util.Scanner;
public class Bmi {
	

    static Scanner input= new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		
		// assign variables to each method
		String repre;
		String sex2;
		
		int heart;
		byte age;
		float height, weight;
		float bodyMass;
		int targetHeartRate;
		int targetHeartRateEighty;
		int targetFinalRate;
		int targetHeartFifty;
		
		// Executions of methods
		
		String userWeightType;
		
		displayPurpose();
		
		repre = name();
		age = getAge (repre);
		sex2 = sex();
		height = height();
		weight = weight();
		heart = heartRate(age);	
		bodyMass = bodyMass(weight, height, heart);
		userWeightType = userWeightType(bodyMass);
		targetHeartRateEighty = targetHeartRateEighty(heart);
		targetHeartFifty = targetHeartRateFifty(heart);
		targetFinalRate = targetFinalRate(targetHeartRateEighty,targetHeartFifty );
	
		
		}


	//Input and save person name
	
	private static String name(){
	
	System.out.printf ("%20s%n" , "Please input your name");
	String name = input.nextLine();
	return name; 
	
	}
	
/***************************************************************************/	
////////////////////   A  G  E     I  N  P  U  T ///////////////////////////	
/***************************************************************************/
//Takes the person age and displays name and age
	
	private static byte getAge (String name) {
		
		byte age;

		
		do{ 
			
			System.out.println("Please input your age ");
			age = (byte) input.nextInt();
		
			
		if (age < 0 || age >123 ) {	System.out.println("Please input your correct age");
			age = (byte) input.nextInt();}
	
		
		System.out.println("Your age is "+ age);
		
		}while(age < 0 || age >123 );
		
	
		
		return age;
		
		
		}
		
	
/*****************************************************************************************************/	
///////////////////////////   G  E  N  D  E  R    I  N  P  U  T////////////////////////////////////////
/****************************************************************************************************/	
//Let people input (Letters "M"" or "N"), and displays if is male or female.
	
		    private static String sex() {
			
		    String sex;
			String Male= "M";
			String Female = "F";

			System.out.print("Please put your sex (Male or Female)");
			
			sex = input.next();
			
			while (!(Male.equalsIgnoreCase(sex) || Female.equalsIgnoreCase(sex))) {
				System.out.println("Plese choose only between (M or F)");
				sex = input.next();
			}
			
            
			if (sex.equalsIgnoreCase("M")) {
			
			System.out.println("You are a Male");
			
			}
			
			else {
				
				System.out.println("You are a Female");
				
				}
			
           
			return sex;	
		}
			
		    
/*********************************************************************************************************/		    
//////////////////////////////////////  H   E   I   G   H   T       I N P U T  ///////////////////////////
/*******************************************************************************************************/			
//Takes height input from user 	
		    
		    private static float height () {
				
				float height;
			
				
				do{ 
					
					System.out.println("Please input your height ");
					height = input.nextFloat();
					
					
				if (height < 21.5 || height >107.1 ) {	System.out.println("Please input your correct height");
					height = input.nextFloat();}
					
				}while(height < 21.5 || height >107.1 );
				
				System.out.println("Your height is "+ 	height + "inches");
				
				return height;	   
		    
		    }
		    
		    
/*********************************************************************************************************************/		    
/////////////////////////////////  W  E  I  G  H  T     I  N  P  U  T ////////////////////////////////////////////////
/********************************************************************************************************************/		    
//Takes weight input from the user		   
		    
		    private static short weight () {
				
				short weight;
			
				
				do{ 
					
					System.out.println("Please input your weight ");
					weight = input.nextShort();
					
					
				if (weight < 1 || weight >1400 ) {	System.out.println("Please input your correct weight");
					weight = input.nextShort();}
					
				}while (weight < 1 || weight >1400 );
				
				System.out.println("Your weight is "+ 	weight + " pounds");
				
				return weight;
				   
		    
		    }
		    
/*********************************************************************************************************/		    
//////////////////////////////// H  E  A  R  T     R  A  T  E     /////////////////////////////////////////
/*********************************************************************************************************/		    
// calculates the heart rate of an user
		    
		    
		    private static int heartRate (byte age) {
				
		    	        int heartRate;
		    	      
				
						 
						heartRate= (220-age);
						
					    System.out.println("Your maximun heart rate is: " + heartRate);
						
							
							
			
						
						return heartRate;
						   
				    
				    }
		    
		    
		    
/*********************************************************************************************************/		    
////////////////////////////////T A R G E T  H  E  A  R  T     R  A  T  E   50%  /////////////////////////////
/*********************************************************************************************************/		    
//calculates the heart rate of an user


private static int targetHeartRateFifty (int heartRate) {

   int targetHeartRateFifty;
 

	 
	targetHeartRateFifty = (heartRate * 1/2);
	
		
	
	return targetHeartRateFifty;
	   

}




/*********************************************************************************************************/		    
////////////////////////////////T A R G E T  H  E  A  R  T     R  A  T  E   85%  /////////////////////////////
/*********************************************************************************************************/		    
//calculates the heart rate of an user


private static int targetHeartRateEighty (int heartRate) {

int targetHeartRateEighty;



targetHeartRateEighty  = (heartRate * 85/100);



return targetHeartRateEighty ;


}
    
		    
		    
/**********************************************************************************************/		    
		    ///////////////////////// BODY MASS INDEX//////////////////////
/**********************************************************************************************/		    
//This is a formula to displey the user Body Mass Index
		    
		    private static float bodyMass(float weight, float height, int heart ) {
				
   	        int bodyMass;
    	      
		
				 
				bodyMass= ((int)weight * 703 )/( (int)height * (int)height);
				
			    System.out.println("Your BodyMass is: " + bodyMass);
				
					
					
	
				
				return bodyMass;
				   
		    
		    }
		    
		    
/*********************************************************************************************/		    
		    //////////////// R   E   S  U  L  T  S    D I S P L A Y //////////////////////////////
/********************************************************************************************/		   
// Here it is display if the user is under weight normal weight, overweight or obese	    
		    
		    private static String userWeightType (float bodyMass ) {
				
   	        
    	      String userWeightType= ".";
		
				 				if (bodyMass<18.55) {
				 					
				 					System.out.println("You are under weight"+ userWeightType );
				 				}
				 				
				 				else if (bodyMass >= 18.5 || bodyMass <= 24.9) {
				 					
				 				System.out.println("You have a normal weight" +userWeightType );
				 					
				 				}
				 				
				 				else if (bodyMass >= 30 ) {
				 					
					 				System.out.println("You are obese" +userWeightType);
					 					
					 				}
					
				
			return userWeightType;
				   
		   
			
			
			
		    }
    
		   
/*********************************************************************************************/		    
//////////////// T A R G E T      H E A R T R A T E     D I S P L A Y ////////////////////////
/********************************************************************************************/		    
		    
		    
		    private static int targetFinalRate (int targetHeartRateEighty, int targetHeartFifty ){
		        int targetFinalRate = 0;
		    	
		    	System.out.println ("Your target heart rate is " +   (targetHeartFifty + targetFinalRate)   + " to "+      targetHeartRateEighty  );
		    	
		    	return targetFinalRate; 
		    	
		    	}
    
    	    
		    
		
		// display purpose
		private static void displayPurpose() {
		System.out.println("*******************************************************");
		System.out.println("This is a Health Calculator Application ");
		System.out.println("*******************************************************");
		
	
		}// End of display purpose
			
	}// End of BMI class
	



	

	
	
	
