public class Histogram{
public static void main(String[]args){
	int[] numbers = new int[103];
	for(int i=0; i<numbers.length; i++){
		numbers[i]=(int)(Math.random()*100)+1;
		System.out.print(numbers[i]+"  ");
	}
	plotHistogram(numbers);
}
public static void plotHistogram(int[] arr){
	for(int i=1; i<=10; i++){
		int num=10*i;
		System.out.print("\n"+(num-9)+"-"+num+": ");
		for(int c=0; c<arr.length; c++){
			if(arr[c]<=num && arr[c]>=(num-9))
				System.out.print("*");
		}
	}
}
}
