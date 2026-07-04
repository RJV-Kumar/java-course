import java.util.List;
import java.util.HashMap;
import java.util.Comparator;


class CollectionSample
{
	public static void main(String[] s)
	{
		List<Integer> nums = new ArrayList<>();
		nums.add(31);
		nums.add(29);
		nums.add(24);
		nums.add(47);
		System.out.println(nums);
		
		
		Map<String, Integer> students = new HashMap<>();
		students.put("A", 10);
		students.put("b", 50);
		students.put("C", 70);
		students.put("D", 30);
		System.out.println(students);
		
		// Comparator
		Comparator<Integer> com = new Comparator<Integer> ()
		{
			public int compare(Integer i, Integer j)
			{
				if(i%10 > j%10)
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(nums, com);
		System.out.println(nums);
		
	}
}