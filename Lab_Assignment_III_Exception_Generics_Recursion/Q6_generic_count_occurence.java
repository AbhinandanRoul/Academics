
public class Q6_generic_count_occurence {
	
	public static <T> int count(T[] array, T item)
	{
		int c=0;
		for(int x=0;x<array.length;x++)
			if(array[x]==item)
				c++;
		return c;
	}

	public static void main(String[] args) {
		Integer[] a= {4,4,5,8,7,4,4,4,5,8,7,45,8,7,45,45,4};
		System.out.println(count(a,7));
		Object[] b= {78, "hello",'h',78,"hello",78,'h'};
		System.out.println(count(b,'h'));
		Double[]c= {1.1,5.3,1.1,1.1,1.1,5.3,66.33,66.33};
		System.out.println(count(c,1.1)); // Double value can't be counted as it checks for 16 places after decimal

	}

}	
