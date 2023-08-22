
class SuperMarketItems{
    static String chocolates[]={"Dairy milk","5star","perk","kit kat","parly","orange","pinaapple","eclairs","cadberry","silk","kach mango","snickers","milkyware","mars","amul"};
	static String soaps[]={"dove","pears","lifeboy","lux","mysore sandole","dettol","biotique","himalaya","hamam","medimix","vivel","cinthon","margo","liril","nivea",};
	 static String perfumes[]={"axe","yardly","fogg","chanel","burberry","evva","nivya","hugo","azzaro","guerlain","coolwater","miss Dior","armani","love position","obsession"};
	 static String snacks[]={"lays","kurkure","samosa","bhel puri","bonda","kachori","aloo chat","banana chips","panipuri","bread pakoda","pakora","popcorn","poha","bhaji","trail mix"};
	 static String vegetables[]={"cabbage","flower","curry leaves","herbslegumes","onions","potato","brinjal","peppers","carrot","radish","cucumber","ginger","tubers","tomato","mustard"};
	 static String fruits[]={"banana","mango","lemon","apple","grape","kiwi","orange","papaya","pineapple","watermelon","cherry","grapefruit","pear","jackfruit","fig"};
	 static String groceries[]={"aldi","safeway","costco","save mart","fresh mart","sugar","jaggery","brown rice","rava","red chilli","rajama","green gram","sago","ragi","dosa rice"};
     static String softdrinks[]={"coca cola","thums up","sprite","pepsi","7 up","mirinda","mazza","mountain dew","fanta","limca","frooti","minute maid","campa cola","pros","champa cola"};
	 static String icecreams[]={"Gelato","Chocolate","vanilla","strawberry","Chocolate chip","Eggnog","Eskimo","Kulfi","Sherbet","Sorbet","Frozen Yogurt","Soft Serve","Philadelphia","Snow Cream","Rolled Ice Cream"};
	 static String Biscuits[]={"Parle","Britannia","Sunfeast","NutriChoice ","Priya Gold ","Unibic","Orion ","Cremica ","Cadbury","Anmol","Haldiram Biscuits ","Pillsbury ","FUN2","Nature Valley","Horlicks Biscuits"};
	
	public static void gettingChocoloates(String getchocolates[]){
	  for(int index=0 ; index<getchocolates.length ; index++){
	   System.out.println(getchocolates[index]);
	  }
	  System.out.println("Reverse order");
	  for(int index=getchocolates.length-1;index >= 0;index--){
		  System.out.println(getchocolates[index]);
		  }
	  
	  }
	 
	  
	 public static void gettingSoaps(String getsoaps[]){
	  for(int index=0 ; index<getsoaps.length ; index++){
	   System.out.println(getsoaps[index]);
	  }
	  System.out.println("Reverse order");
	  for(int index=getsoaps.length-1;index >= 0;index--){
		  System.out.println(getsoaps[index]);
		  }
	 }
	 
	 public static void gettingperfumes(String getperfumes[]){
	  for(int index=0 ; index<getperfumes.length ; index++){
	   System.out.println(getperfumes[index]);
	  }
	  System.out.println("Reverse order");
	  for(int index=getperfumes.length-1;index >= 0;index--){
		  System.out.println(getperfumes[index]);
		  }
	 }
	 
	 
	 public static void gettingsnacks(String getsnacks[]){
	  for(int index=0 ; index<getsnacks.length ; index++){
	   System.out.println(getsnacks[index]);
	  }
	  System.out.println("Reverse order");
	  for(int index=getsnacks.length-1;index >= 0;index--){
		  System.out.println(getsnacks[index]);
		  }
	 }
	 
	 public static void gettingvegetables(String getvegetables[]){
	  for(int index=0 ; index<getvegetables.length ; index++){
	   System.out.println(getvegetables[index]);
	  }
	  System.out.println("Reverse order");
	  for(int index=getvegetables.length-1;index >= 0;index--){
		  System.out.println(getvegetables[index]);
		  }
	 }
	 
	 public static void gettingfruits(String getfruits[]){
	  for(int index=0 ; index<getfruits.length ; index++){
	   System.out.println(getfruits[index]);
	  }
	  System.out.println("Reverse order");
	  for(int index=getfruits.length-1;index >= 0;index--){
		  System.out.println(getfruits[index]);
		  }
	 }
	 
	 public static void gettinggroceries(String getgroceries[]){
	  for(int index=0 ; index<getgroceries.length ; index++){
	   System.out.println(getgroceries[index]);
	  }
	  System.out.println("Reverse order");
	  for(int index=getgroceries.length-1;index >= 0;index--){
		  System.out.println(getgroceries[index]);
		  }
	 }
	 
	 public static void gettingsoftdrinks(String getsoftdrinks[]){
	  for(int index=0 ; index<getsoftdrinks.length ; index++){
	   System.out.println(getsoftdrinks[index]);
	  }
	  System.out.println("Reverse order");
	  for(int index=getsoftdrinks.length-1;index >= 0;index--){
		  System.out.println(getsoftdrinks[index]);
		  }
	 }
	 
	 public static void gettingcecreams(String geticecreams[]){
	  for(int index=0 ; index<geticecreams.length ; index++){
	   System.out.println(geticecreams[index]);
	  }
	  System.out.println("Reverse order");
	  for(int index=geticecreams.length-1;index >= 0;index--){
		  System.out.println(geticecreams[index]);
		  }
	 }


     public static void gettingBiscuits(String getBiscuits[]){
	  for(int index=0 ; index<getBiscuits.length ; index++){
	   System.out.println(getBiscuits[index]);
	  }
	  System.out.println("Reverse order");
	  for(int index=getBiscuits.length-1;index >= 0;index--){
		  System.out.println(getBiscuits[index]);
		  }
	 }




	 
	 public static void main(String args[]){
		 System.out.println("Calling main method");
		 gettingChocoloates(chocolates);
		 System.out.println("******************************************************");
		 gettingSoaps(soaps);
		 System.out.println("*********************************************************");
		 gettingperfumes(perfumes);
		 System.out.println("*************************************************************");
		 gettingsnacks(snacks);
		 System.out.println("*************************************************************");
		 gettingvegetables(vegetables);
		 System.out.println("*************************************************************");
		 gettingfruits(fruits);
		 System.out.println("*************************************************************");
		 gettinggroceries(groceries);
		 System.out.println("*************************************************************");
		 gettingsoftdrinks(softdrinks);
		 System.out.println("*************************************************************");
		 gettingcecreams(icecreams);
		 System.out.println("*************************************************************");
		 gettingBiscuits(Biscuits);
		 
		 
		 
	 }
	 
	 
	 
	 
	 
}
	  
	  
	  
	  