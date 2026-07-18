public class MergeSort {

    public int[] mergeToSortedArray(int[] leftArr, int[] rightArr)
    {
        int i = 0; 
        int j = 0;
        int totalLen = leftArr.length + rightArr.length;
        int[] merged = new int[totalLen];
        int z = 0;
        while( i < leftArr.length && j < rightArr.length)
        {
            if(leftArr[i] <= rightArr[j])
            {
                merged[z] = leftArr[i];
                i++;
            }
            else 
            {
                merged[z] = rightArr[j];
                j++;
            }
            z++;
        }
        while(i < leftArr.length && z < totalLen)
        {
            merged[z] = leftArr[i];
            i++;
            z++;
        }
        while(j < rightArr.length && z < totalLen)
        {
            merged[z] = rightArr[j];
            j++;
            z++;
        }
        return merged;

    }

    public int[] divide(int[] arr, int start, int end)
    {
        int[] result = new int[end - start + 1];
        int j = 0;
        while(start <= end)
        {
            result[j] = arr[start];
            start++;
            j++;
        }
        return result;
    }

     

    public int[] merge_sort(int[] arr)
    {   
        if(arr.length <= 1)
            return arr;

        int mid = arr.length/2;

        int[] leftArr = divide(arr, 0, mid - 1);
        int[] rightArr = divide(arr, mid, arr.length - 1);

        leftArr = merge_sort(leftArr);
        rightArr = merge_sort(rightArr);
        return mergeToSortedArray(leftArr, rightArr);
    }
    public static void main(String[] args) {
     
        int[] nums = {3,1,6,2,4,8,7};
        System.out.print("Merge Sort, Before Sorting:  ");
        for(int n : nums)
        {
            System.out.print(n + " ");
        }

        MergeSort sort = new MergeSort();
        nums = sort.merge_sort(nums);

        System.out.print("\nAfter Sorting:  ");
        for(int n : nums)
        {
            System.out.print(n + " ");
        }
    }
}
