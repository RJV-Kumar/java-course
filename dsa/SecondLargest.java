public class SecondLargest {

    public int findSecondLargest(int[] nums)
    {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > largest)
            {
                second = largest;
                largest = nums[i];
            }
            else if(nums[i] > second && nums[i] != largest)
            {
                second = nums[i];
            }
        }

        return second;
    }
    public static void main(String[] args) {
        int[] nums = {55, 32, 97, -55, 45, 32, 88, 21};

        System.out.print("Input Array: ");
        for(int n : nums)
        {
            System.out.print(n + " ");
        }


        SecondLargest obj = new SecondLargest();
        System.out.println("\nSecond largest Element is: " + obj.findSecondLargest(nums));
    }
    
}
