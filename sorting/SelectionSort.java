class SelectionSort
{
    public static void main(String s[])
    {
        int nums[] = {5,4,7,8,10,2,1};

        System.out.print("Before sorting: ");
        for ( int i : nums) {
            System.out.print(i + " ");
        }

        int n = nums.length;
        for (int i =0; i < n; i++)
        {
            int min_index = i;
            for (int j = i+1; j < n; j++)
                if (nums[min_index] > nums[j]) 
                    min_index = j;
            
            int temp = nums[i];
            nums[i] = nums[min_index];
            nums[min_index] = temp;
        }

        
        System.out.print("\n After sorting: ");
        for ( int i : nums) {
            System.out.print(i + " ");
        }
    }
}