public class AssignmentQ2 {
    
    public int  rotated_sortedArray(int[] nums, int target){
        int n = nums.length;

        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid=start+ (start+end)/2;
            if(nums[mid]==target)
            return mid;

            else if(nums[start]<=nums[mid])
            {
                if(nums[start]<=target && target<=nums[mid]){
                    end = mid - 1;
                 } else 
                    start = mid + 1;          
            }

            else {
                if(nums[mid] <= target && target<=nums[end]){
                    start = mid + 1;
                } else 
                    end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       AssignmentQ2 ass = new AssignmentQ2();
       int nums[] = {4,5,6,7,0,1,2};
       int target = 0;
       
       int index = ass.rotated_sortedArray(nums,target);
       System.out.println("Target found at index: " + index );
   
    }
}
