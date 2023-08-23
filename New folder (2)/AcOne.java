class AcOne{

static boolean isConnected;

 public static boolean onOrOff(){
 System.out.println("Inside onOrOff");
 if(false==false)
 if(isConnected == false){
 isConnected = true;
 System.out.println("the ac is turned Onn....");
 } else if(isConnected == true){
 isConnected = false;
 System.out.println("the Ac is turned Off");
 System.out.println("end of onOrOff");
 }
 return isConnected;
   
 }

 static int minTemp;
 static int maxTemp=4;
 
 static int currentTemp;
 public static void increaseTemp(){
	 
	 System.out.println("start of increaseTemp");
	 if(isConnected == true){
		 if(currentTemp < maxTemp){
			 currentTemp= currentTemp+1;
			 System.out.println("the current Tempratury is "+currentTemp);
		 }
		 else{
			 System.out.println("max Tempratury is reached");
		 }
	 }else{
		 System.out.println("Gube...first Ac onn mado....");
		 
	 }	 
 }
	 static int currentTempDescr;
	 public static void decreaseTemp(){
	 System.out.println("start of decreaseTemp");
	 if(isConnected == true){
		 if(currentTempDescr < maxTemp){
			 currentTempDescr= currentTempDescr -1;
			 System.out.println("the current Tempratury is "+currentTempDescr);
		 }
		 else{
			 System.out.println("max Tempratury is reached");
		 }
	 }else{
		 System.out.println("Gube...first Ac onn mado....");
		 
		 
	 }
 }
	 }