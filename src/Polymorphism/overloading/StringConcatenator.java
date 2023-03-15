package Polymorphism.overloading;

public class StringConcatenator {

	/*Create a class called StringConcatenator.
Inside the class, create four different methods for concatenating strings:
A method called concatenate that takes two strings as parameters and returns their concatenation.
A method that takes three strings as parameters and returns their concatenation.
A method that takes four strings as parameters and returns their concatenation.
A method called concatenate that takes an array of strings as a parameter and returns their concatenation.
	 */
	// Concatenate two strings
	public String concatenate(String str1, String str2) {
		return str1 + str2;
	}

	// Concatenate three strings
	public String concatenate(String str1, String str2, String str3) {
		return str1 + str2 + str3;
	}

	// Concatenate four strings
	public String concatenate(String str1, String str2, String str3, String str4) {
		return str1 + str2 + str3 + str4;
	}
	
	// Concatenate an array of strings
	public String concatenate(String[] strArr) {
		String result = "";
		for (String str : strArr) {
			result += str;
		}
		return result;
	}


	// Main method to test the StringConcatenator class
	public static void main(String[] args) {
		StringConcatenator concatenator = new StringConcatenator();

		String str1 = "Hello, ";
		String str2 = "Tech Circle!";
		String str3 = " You are the best school in DMV.";
		String str4 = " I am happy to be part of it.";
		String[] strArr = { "Hello, ", "world!", " How are you?", " I am fine." };

		String result1 = concatenator.concatenate(str1, str2);
		System.out.println(result1);

		String result2 = concatenator.concatenate(str1, str2, str3);
		System.out.println(result2);

		String result3 = concatenator.concatenate(strArr);
		System.out.println(result3);

		String result4 = concatenator.concatenate(str1, str2, str3, str4);
		System.out.println(result4);
	}

}
