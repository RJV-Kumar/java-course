class LargestElement
{
    public static void main(String s[])
    {
        int nums[] ={ 3, 2, 10, 11, -1, 29};
        
        int largest = nums[0];
        for(int i=1; i < nums.length; i++)
        {
            if (nums[i] > largest)
                largest = nums[i];
        }
        System.out.println("Largest element is: " + largest);
    }
}