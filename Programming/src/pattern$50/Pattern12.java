
/*
		 * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    *         * 
   * *       * * 
  * * *     * * * 
 * * * *   * * * * 
* * * * * * * * * * 

*/
package pattern$50;

class Pattern12 
{
	static	int space =5;
	static	int star= 0;
	static	int space1 =5;
	static	int star1= 0;
	
	public static void main(String[] args) 
	{


		for (int i=1;i<=5 ;i++ )
		{
			star++;
			space--;
			for (int a=1; a<=5 ;a++ )
			{
				System.out.print(" ");
			}
			for (int b=1;b<=space ;b++ )
			{
				System.out.print(" ");
			}

			for (int c=1;c<=star ;c++ )
			{
				System.out.print("* ");
			}
			System.out.println();
						
		}

		for (int i=1;i<=5 ;i++ )
		{
			star1++;
			space1--;

			for (int k=1;k<=space1 ;k++ )
			{
				System.out.print(" ");
			}

			for (int l=1;l<=star1 ;l++ )
			{
				System.out.print("* ");
			}

			for (int k=1;k<=space1 ;k++ )
			{
				System.out.print("  ");
			}
			for (int l=1;l<=star1 ;l++ )
			{
				System.out.print("* ");
			}
			System.out.println();
						
		}		

	}

}

	//public static void space2()
	//{
		//int space=5;
		//for (int i=1;i<=5 ;i++ )
		//{
			//space--;
			//for (int j=1;j<=space ;j++ )
			//{
				//System.out.print(" ");
			//}
			//System.out.println();
			
		//}
	//}
	
	//public static void star()
	//{
		//int star=0;
			//for (int i=1;i<=5 ;i++ )
			//{
				//star++;
				//for (int k=1;k<=star ;k++ )
				//{
					//System.out.print("* ");
				//}
				//System.out.println();
			//}	
	//}

//}
