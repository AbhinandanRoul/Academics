
public class Q12_recursive_binary_search {
public static boolean binarysearch(int a[],int first, int last,int n)
{
	int mid;
	if(first>last)
		return false;
	else
	{
		mid=(first+last)/2;
		if(a[mid]==n)
			return true;
		else if(a[mid]<n)
			return binarysearch(a,mid+1,last,n);
		else
			return binarysearch(a,first,mid-1,n);
	}
}
	public static void main(String[] args) {
		int a[]= {1,5,7,69,455,1236,1238,3025,10147};
		boolean res= binarysearch(a,0,a.length-1,69);
		if(res==true)
			System.out.println("ITEM is PRESENT");
		else
			System.out.println("NOT FOUND");

	}

}
