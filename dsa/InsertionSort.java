class InsertionSort
{
    public static void main(String[] args) {
        int[] nums = {3,1,6,2,4,8,7};
        System.out.print("Insertion Sort, Before Sorting:  ");
        for(int n : nums)
        {
            System.out.print(n + " ");
        }

        for(int i = 1; i < nums.length; i++)
        {
            int key = nums[i];
            int j = i - 1;
                
            while(j >= 0 && nums[j] > key)
            {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        System.out.print("\nAfter Sorting:  ");
        for(int n : nums)
        {
            System.out.print(n + " ");
        }
    }
}