public class QuickSort{
public static void main(String[]args){
	int[] numbers= new int[50];
	for(int c = 0; c<numbers.length; c++){ //random
		numbers[c]=(int)(Math.random()*50)+1;
		System.out.print(numbers[c]+"\t");
	}
	System.out.println("\n");
	
	quickSort(numbers, 0, numbers.length-1);
	for(int i = 0; i<numbers.length; i++) //from 1->50
		System.out.print(numbers[i]+"\t");
	System.out.println("\n");
	
	flipOrder(numbers);
	for(int i = 0; i<numbers.length; i++)  //from 50->1
		System.out.print(numbers[i]+"\t");
	}
static int partition(int arr[], int left, int right) {
      int i = left, j = right, tmp;
      int pivot = arr[(left + right) / 2];
      while (i <= j) {
            while (arr[i] < pivot)
                  i++;
            while (arr[j] > pivot)
                  j--;
            if (i <= j) {
                  tmp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = tmp;
                  i++;
                  j--;
            }
      };
      return i;
}
 static void quickSort(int arr[], int left, int right) {
      int index = partition(arr, left, right);
      if (left < index - 1)
            quickSort(arr, left, index - 1);
      if (index < right)
            quickSort(arr, index, right);
}
static int[] flipOrder(int arr[]){
	int temp;
	for(int c=0;c<arr.length/2;c++){
		temp=arr[c];
		arr[c]=arr[arr.length-(c+1)];
		arr[arr.length-(c+1)]=temp;
	}
	return arr;
}
		
}