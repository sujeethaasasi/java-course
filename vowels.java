// write a program to write the number of vowels & no of occurance if each vowels in a string.

import java.util.Scanner;
class vowels{

	public static void main(String args[]){

		String input;

		char c; //Doubt :- if declared in string showing

		int a=0,e=0,i=0,o=0,u=0,nt,len,n;

		Scanner obj=new Scanner(System.in);

		System.out.print("Enter the string ");

		input=obj.nextLine();

		len=input.length();

		System.out.println("Length of the given string " +len);

		for(n=0;n<len;n++)
		{
			c=input.charAt(n);

			if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.println("Vowel "+c);
			}

			// System.out.println(c);

			if(c=='a') // Why "" is not working out.
				{
				a=a+1;
				}else
					{
					if(c=='e')
					{
						e=e+1;
					}else
						{
							if(c=='i')
							{
								i=i+1;
							}else
								{
									if(c=='o')
									{
										o=o+1;
									}else
										{
											if(c=='u')
											{
												u=u+1;
											}
										}
								}
						}

					
					}
				}

System.out.println("Number of a "+a);
System.out.println("Number of e "+e);
System.out.println("Number of i "+i);
System.out.println("Number of o "+o);
System.out.println("Number of u "+u);
		}


	} 
