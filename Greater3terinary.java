//find greatest of 3 numbers using terinary operator

class Greater3terinary{
	public static void main(String args[]){
		int a,b,c;
		String result;
		a=8;
		b=7;
		c=9;

		// result= ((a>b)&&(a>c))?"A is >":((b>c)?"b is greater":"c is greater");

		//result=(a>b)?((a>c)?"A is >":((c>b)?"C is >":"b is >")):((b>c)?"b is >":"C is >");
		
		result=(a>b)?((a>c)?"A is >":"C is >"):((b>c)?"b is >":"C is >");


		/*if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is >");
			}
			else
			{
				if(c>b)
				{
					System.out.println("c is >");
				}
				else
				{
					System.out.println("B is >");
				}
			}
		}else{
			if(b>c)
			{
				System.out.println("b is >");
			}
			else
			{
				System.out.println("C is >");
			}
		}*/

		/*if (a > b){
			if (a > c) {
				System.out.println("A is >");
			} else {
				System.out.println("C is >");
			}
		} else {
			if (b > c) {
				System.out.println("B is >");
			} else {
				System.out.println("C is >");
			}
		}*/

		System.out.print(result);

	}
}