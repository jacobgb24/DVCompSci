public class FindMinValue{
public static void main(String[]args){
	int[] nums = {10, 9, 8, 7, 6, 5, 4, 1, 2, 3};
	ArrayPoint point = findMin(nums);
	System.out.println(point.toString());
	}
public static ArrayPoint findMin(int[] arr){
	int lowest=0;
	for(int i =1; i<arr.length; i++)
		if(arr[i]<arr[i-1])
			lowest=i;
	return new ArrayPoint(lowest, arr[lowest]);
	}
}