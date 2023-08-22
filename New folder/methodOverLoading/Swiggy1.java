class Swiggy1{


public static double search(String foodname,int quantity){
  double price = 0.0;
  System.out.println("invoked search : foodname (String),quantity (int)");
     if (foodname == "pizza"){
	 price=110.00 * quantity;
	 
	 }
	 
	 if (foodname == "pizza"){
	 price=110.00 * quantity;
	 
	 }
	 
	 if (foodname == "burger"){
	 price=120.00 * quantity;
	 
	 }
	 
	 if (foodname == "geera rice"){
	 price=135.00 * quantity;
	 
	 }
	 
	 if (foodname == "biriyani"){
	 price=140.00 * quantity;
	 
	 }
	 
	 if (foodname == "parota"){
	 price=159.00 * quantity;
	 
	 }
	 
	 System.out.println("end of search");
	 return price ;



}



}