class Sorting{

public static void main(String arg[]){
     int sort[] = {15,34,100,1};
	        int max,min;
			max = sort[0];
			min = sort[0];
			
	for(int i=1;i<sort.length;i++){
	  if(sort[i]>max){
	  max = sort[i];
	  
	  
	  }
	  if(sort[i]<min){
	  min = sort[i];
	  
	  }
	
	}
			
	System.out.println("The maximum number is"+max);
	System.out.println("The minimum number is"+min);		
	 







}








}
