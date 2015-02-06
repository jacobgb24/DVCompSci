public class QuickSort{
public static void main(String[]args){
	int[] numbers= new int[1000000];
	int[] num2 = new int[1000000];
	System.out.println("100 random numbers(0-50):");
	for(int c = 0; c<numbers.length; c++){
		numbers[c]=(int)(Math.random()*100000)+1;
		//System.out.print(numbers[c]+"\t");
	}
	num2=numbers.clone();
	
	
	long startq=System.currentTimeMillis();
	quickSort(numbers, 0, numbers.length-1);
	long endq=System.currentTimeMillis();
	
	long starth=System.currentTimeMillis();
	bubbleSort(num2);
	long endh=System.currentTimeMillis();
	
	System.out.println("\nSorted Numbers: ");
	for(int i = 0; i<numbers.length; i++)
		System.out.print(numbers[i]+"\t");
	System.out.println("Quick Sort: "+(endq-startq)+" Bubble Sort: "+(endh-starth));
	}
	static int partition(int arr[], int left, int right)
	{
      int i = left, j = right;
      int tmp;
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

public static void bubbleSort(int[] arr) {
      boolean swapped = true;
      int j = 0;
      int tmp;
      while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {                                       
                  if (arr[i] > arr[i + 1]) {                          
                        tmp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = tmp;
                        swapped = true;
                  }
            }                
      }
}
}