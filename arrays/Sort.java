class Sort{

public static void main(String args[]){
 int array[] = {100,56,78,89,1};
 int array1[] = {100,56,78,89,1};
 
 for(int index = 0 ; index < array.length ;index++){
 // 100 < 56
 
 for(int anotherindex = index+1 ; anotherindex < array.length ; anotherindex++){
			int temp = 0;
			//Ascending order
			if(array[anotherindex] < array[index]){
			temp = array[index];
			array[index] = array[anotherindex];
			array[anotherindex] = temp;
			//Desending order
			int temp1 = 0;
			if(array1[index] < array1[anotherindex]){
			temp1 = array1[index];
			array1[index] = array1[anotherindex];
			array1[anotherindex] = temp1;
			}
			
			
 
}
}
}
System.out.print("The array values ascending:  ");
for(int index = 0 ; index < array.length ;index++){
	System.out.println();
System.out.println(array[index]);
}

System.out.print("The array values descending:  ");
for(int index = 0 ; index < array1.length ;index++){
	System.out.println();
System.out.println(array1[index]);
}

}
}