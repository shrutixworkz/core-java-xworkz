class University{

 static String degree[]={"RPA First grade degree","ASC degree","SJR degree","SET degree","KLE sociaties degree",
 "Shree verendra patil","Government degree","BSV degree","OM prabha degree","PES degree","Basaweswara degree",
 "VVN degree","Sri Krishna","SSK degree","National degree","Rajaji nagar","Sri shanthini degree","St.Teresa's",
 "MES degree","D.V.S degree"};
 
        public static void main(String args[]){
       System.out.println("The degree is"+ degree[0]+" "+ degree[1]);


     System.out.println("main ended");
   //looping statement
   System.out.println("The Length of degree is"+ degree.length );
   for(int index=0; index < degree.length; index++){
	   
	   
   System.out.println(degree[index]);
   System.out.println("----------------");
  }
  System.out.println("##########################################################################");
   for(int index=degree.length-1; index>=0; index--){
	   
   System.out.println(degree[index]);
   }
   
   //for (data type var=value;conditionstatement;increment statement)
   
   

   
  }
}
   