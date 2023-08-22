class JioMatone{
public static double search (String foodname ){
double price = 0.0;
System.out.println("invoked search : foodname(String)");
if(foodname =="pizza"){
	price = 185.00 ;
	return price;
}

if(foodname =="burger"){
	price = 234.00 ;
	return price;
}

if(foodname =="vegrol"){
	price = 125.00 ;
	return price;
}

if(foodname =="cake"){
	price = 55.00 ;
	return price;
}

if(foodname =="noodles"){
	price = 123.00 ;
	return price;
}

if(foodname =="pavbajji"){
	price = 85.00 ;
	return price;
}

if(foodname =="egg rol"){
	price = 105.00 ;
	return price;
}

if(foodname =="panner rol"){
	price = 55.00 ;
	return price;
}

if(foodname =="parota"){
	price = 45.00 ;
	return price;
}

if(foodname =="chapati"){
	price = 40.00 ;
	return price;
}
System.out.println("end of search");
return price;
}
}