
public class Q5_generic_array {
	
	public static <E> void printArray(E[]inputArray)
	{
		 for(int x=0;x<inputArray.length;x++)
			 System.out.print(inputArray[x]+"\t");
	}

	public static void main(String[] args) {
		Integer[] a= {1,2,44,98,45,46};
		printArray(a);
		Character[] b= {'v','p'};
		printArray(b);
		Float[] c= {45.66f,44.4f,87.36f};
		printArray(c);
		String[] d= {"fdf","fda","feaea"};
		printArray(d);

	}

}
