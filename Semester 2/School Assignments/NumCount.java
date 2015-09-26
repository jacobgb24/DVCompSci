public class NumCount {
public static void main(String[]args) {
	int[] numbers= new int[100];
	int[] count = new int[51];
	
	
	System.out.println("100 random numbers(0-50):");
	for(int i = 0; i<numbers.length; i++){
		numbers[i]=(int)(Math.random()*50)+1;
		System.out.print(numbers[i]+"\t");
	}
	System.out.println("\nSorted Numbers:");
	Sort(numbers);
	for(int i = 0; i<numbers.length; i++)
		System.out.print(numbers[i]+"\t");
	
	
	System.out.println("\nCount for each number:");
	for(int n =0; n<numbers.length; n++)
		count[numbers[n]]+=1;
	for(int c=1; c<=50;c++)
		System.out.println(c+"\t"+count[c]);
		
}

public static void Sort(int[] num){
	 for(int i=0; i<num.length; i++){
	 	int key = num[i];
	 	int pos = i;
	 	while(pos>0 && num[pos-1]>key){
	 		num[pos]=num[pos-1];
	 		pos--;
	 	}
	 	num[pos]=key;
	 }
}
}
		
	