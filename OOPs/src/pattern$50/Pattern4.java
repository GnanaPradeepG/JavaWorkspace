


//	15 
//	14 13 
//	12 11 10 
//	9 8 7 6 
//	5 4 3 2 1 



package pattern$50;
class  Pattern4
{
	public static void main(String[] args) 
	{
		
		int value=16;
		int length=0;
		for (int i=1;i<=5 ;i++ )
		{
			length++;
			for (int j=1;j<=length ;j++ )
			{
				value--;
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}
