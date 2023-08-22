class Factorialformula{
   public static void main(String args[]){
           int n=5,factorial;
		    //factorial=4*3*2*1;
			factorial=fact(n);
		   
		   
   System.out.println("the factorial number is"+factorial);
   }

	private static int fact(int num){
		if(num == 0){
			return 1;
		}else{
			int result= num*fact(num-1);
			System.out.println("the result is"+result);
			return result;
		}
	}
	   
}






