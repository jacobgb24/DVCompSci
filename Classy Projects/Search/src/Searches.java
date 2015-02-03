/**
 * Created by jacob_000 on 2/2/2015.
 */
public class Searches {
    public static int linearSearch(String[] names, String key){
        for(int i=0; i<names.length; i++)
            if(key.equalsIgnoreCase(names[i]))
                return i;
        return -1;
    }
    public static int binarySearch(int[] nums, int key){
        int low=0, high=nums.length-1, middle=(low+high)/2;
        while(nums[middle]!=key && low<=high){
            if(key<nums[middle])
                high=middle-1;
            else
                low=middle+1;
            middle=(low+high)/2;
        }
        if(nums[middle]==key)
            return middle;
        else
            return -1;
    }

}
