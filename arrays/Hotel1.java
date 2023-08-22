class Hotel1{
static String foodMenu[] = {"Dosa","idli","vangibath","upma","masala dosa","pulliyogare","chitran","magi","lemon rice",
"fride rice","curd rice","jeera rice","palva","tomato bath","bisibelebath", "fayas","parota","capati",
"noodels","karabath","masala bath","veg biriyani","egg rice","chicken fry","chicken kabab","chicken curry",
"gobi","panipuri","sevpuri","samosa","paneer manchuri","veg roll","paneer roll",
"belpuri","veg noodels","butter roti","soup","kaju curry","chicken soup",
"palak paneer","palak rice","pakoda","masala vada","chatni","egg roll",
"egg magi","panner manchiri","dahi puri","dahi vada","jamuna","mysurapak","panner butter masala",
"pizza","burger","rolls"};


public static void main(String Hotel[]){
System.out.println("The foodMenu is"+ foodMenu[0]+" "+ foodMenu[1]);


System.out.println("main ended");
   //looping statement
   System.out.println("The Length of foodMenu is"+ foodMenu.length );
   /*for(int index=0; index < foodMenu.length; index++){
	   */
	   
   System.out.println(foodMenu[index]);
   System.out.println("----------------");
   
   for(int index=foodMenu.length-1; index>=0; index--){
	   
   System.out.println(foodMenu[index]);
   }
   
   

   //devsIndex++;
   
   System.out.println();
   System.out.println("-----------");
   System.out.println("main ended");
	   
  }
   
   
 }



