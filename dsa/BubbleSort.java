class BubbleSort
{
    public static void main(String[] args) {
        int[] nums = {3,1,6,2,4,8,7};
        System.out.print("Bubble Sorting: Before Sorting:  ");
        for(int n : nums)
        {
            System.out.print(n + " ");
        }

        for(int i = nums.length - 1; i > 0; i--)
        {
            for(int j = 0; j < i; j++)
            {
                if(nums[j] > nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.print("\nAfter Sorting:  ");
        for(int n : nums)
        {
            System.out.print(n + " ");
        }
    }
}