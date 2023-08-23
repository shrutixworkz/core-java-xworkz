class Microwave{

static boolean isConnected;

 public static boolean onOrOff(){
 System.out.println("Inside onOrOff");
 if(false==false)
 if(isConnected == false){
 isConnected = true;
 System.out.println("the microwave is turned Onn....");
 } else if(isConnected == true){
 isConnected = false;
 System.out.println("the microwave is turned Off");
 System.out.println("end of onOrOff");
 }
 return isConnected;
   
 }

 static int minWavelength;
 static int maxWavelength=4;
 static int currentWavelength;
 public static void increaseWavelength(){
	 
	 System.out.println("start of increaseWavelength");
	 if(isConnected == true){
		 if(currentWavelength < maxWavelength){
			 currentWavelength= currentWavelength+1;
			 System.out.println("the current Wavelength is "+currentWavelength);
		 }
		 else{
			 System.out.println("max Wavelength is reached");
		 }
	 }else{
		 System.out.println("Gube...first Ac onn mado....");
		 
	 }	 
 }
	 static int currentWavelengthDescr;
	 public static void decreaseWavelength(){
	 System.out.println("start of decreaseWavelength");
	 if(isConnected == true){
		 if(currentWavelengthDescr < maxWavelength){
			 currentWavelengthDescr= currentWavelengthDescr -1;
			 System.out.println("the current Wavelength is "+currentWavelengthDescr);
		 }
		 else{
			 System.out.println("max Wavelength is reached");
		 }
	 }else{
		 System.out.println("Gube...first Wavelength onn mado....");
		 
		 
	 }
 }
	 }