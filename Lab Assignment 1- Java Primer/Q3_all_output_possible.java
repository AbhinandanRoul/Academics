

public class Q3_all_output_possible {

	public static void main(String[] args) {
		int i,j,k,l,m,n;
		int c=0;
		char[]s= {'c','a','r','b','o','n'};
		for( i=0;i<s.length;i++)
		{
			for(j=0;j<s.length;j++)
			{
				for(k=0;k<s.length;k++)
				{
					for(l=0;l<s.length;l++)
					{
						for(m=0;m<s.length;m++)
						{
							for( n=0;n<s.length;n++)
							{
								if(i!=j&&i!=k&&i!=l&&i!=m&&i!=n&&j!=k&&j!=l&&j!=m&&j!=n&&k!=l&&k!=m&&k!=n&&l!=m&&l!=n&&m!=n)
								{
									System.out.println(s[i]+""+s[j]+""+s[k]+""+s[l]+""+s[m]+""+s[n]);
								
								c++;
								}
							}
					     }
			    }
		     }
			
		  }
		}
		System.out.println(c);
	}
}



