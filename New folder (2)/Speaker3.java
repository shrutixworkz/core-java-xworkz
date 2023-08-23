class Speaker3{
static boolean isConnected;

 public static boolean onOrOff(){
 System.out.println("Inside onOrOff");
 if(false==false)
 if(isConnected == false){
 isConnected = true;
 System.out.println("the Speaker is turned Onn....enjoy");
 } else if(isConnected == true){
 isConnected = false;
 System.out.println("the Speaker is turned Off");
 System.out.println("end of onOrOff");
 }
 return isConnected;
   
 }
/* public static boolean off(){
	 if(isConnected == true){
 isConnected = falsee;
 System.out.println("the Speaker is turned Off");
 */
 static int minVolume;
 static int maxVolume=8;
 static int currentVolume;
 public static void decreaseVolume(){
	 System.out.println("start of decreaseVolume");
	 if(isConnected == true){
		 if(currentVolume < maxVolume){
			 currentVolume= currentVolume -1;
			 System.out.println("the current Volume is "+currentVolume);
		 }
		 else{
			 System.out.println("max volume is reached");
		 }
	 }else{
		 System.out.println("Gube...first speaker onn mado....");
		 
		 
	 }
 }
	 }