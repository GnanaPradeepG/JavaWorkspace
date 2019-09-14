/*
     1
   2 3 4
 5 6 7 8 9
10 11 12 13 14 15 16 

*/
package pattern$50;
class  Pattern8
{
	public static void main(String[] args) 
	{
		int space=4;
		int star=-1;
		int value=0;
		for (int i=1;i<=4;i++)
		{
			star+=2;
			space--;
			for (int j=1;j<=space ;j++ )
			{
				System.out.print(" ");
			}
			for (int k=1;k<=star ;k++ )
			{
				value++;
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
} 