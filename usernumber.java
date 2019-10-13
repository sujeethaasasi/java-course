//Write a program to get phone number(string) from user & use substring to remove first 3 digits & convert to integer & print

import java.util.Scanner;

class usernumber{
	public static void main(String args[]){

		String uphno, rphno; //Initialing variable

		System.out.println("Please enter the mobile number");

		Scanner obj =new Scanner(System.in); // Taking input from the user

			uphno=obj.nextLine();

			rphno=uphno.substring(3);//Removing first 3 numbers

			System.out.println("Phno after removing 3 digits "+rphno);


			int iphno=Integer.parseInt(rphno);	//Conversion of string to integer

			// int iphno = (int)rphno

			System.out.println("integer "+iphno);

	}
}


// E:\Program>javac usernumber.java
// usernumber.java:23: error: incompatible types: String cannot be converted to int
//                         int iphno = (int)rphno;
//                                          ^
// 1 error

// E:\Program>javac usernumber.java
// usernumber.java:14: error: incompatible types: String cannot be converted to double
//                         uphno=obj.nextLine();
//                                           ^
// usernumber.java:16: error: double cannot be dereferenced
//                         rphno=uphno.substring(3);//Removing first 3 numbers
//                                    ^
// 2 errors

// E:\Program>javac usernumber.java
// usernumber.java:14: error: cannot find symbol
//                         uphno=obj.nextLength();
//                                  ^
//   symbol:   method nextLength()
//   location: variable obj of type Scanner
// usernumber.java:16: error: double cannot be dereferenced
//                         rphno=uphno.substring(3);//Removing first 3 numbers
//                                    ^
// 2 errors

// E:\Program>javac usernumber.java

// E:\Program>java usernumber
// Please enter the mobile number
// +919387462890
// Phno after removing 3 digits 9387462890
// Exception in thread "main" java.lang.NumberFormatException: For input string: "9387462890"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
//         at java.base/java.lang.Integer.parseInt(Integer.java:658)
//         at java.base/java.lang.Integer.parseInt(Integer.java:776)
//         at usernumber.main(usernumber.java:21)

// E:\Program>javac usernumber.java

// E:\Program>java usernumber
// Please enter the mobile number
// +911234567890
// Phno after removing 3 digits 1234567890
// integer 1234567890
