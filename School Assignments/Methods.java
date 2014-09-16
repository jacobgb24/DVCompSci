public class Methods
{
	public static void main (String [] args)
	{
		String str1 = "Hello";
		String str2 = "Bye";
		String str3 = "    H   I  ";
		int compare = str1.compareTo(str2); //1 compare
		System.out.println(compare);
		boolean truth1 = str1.endsWith("o"); //2 endsWith
		System.out.println(truth1);
		boolean truth2 = str2.equalsIgnoreCase("BYE"); //3 equalsIgnoreCase
		System.out.println(truth2);
		int hash = str1.hashCode(); //4 hashCode
		System.out.println(hash);
		boolean match = str2.matches("Bye\n"); //5 matches
		System.out.println(match);
		int codePoint = str1.codePointAt(3); //6 codePointAt
		System.out.println(codePoint);
		String trim = str3.trim(); //7 trim
		System.out.println("Hi " + trim);
		int length = str1.length() + str2.length(); //8 length
		System.out.println(length);
		String replace = str1.replace("ell", "ipp"); //9 replace
		System.out.println(replace);
		char[] chararray = str2.toCharArray(); //10 toCharArray
		System.out.println(chararray);
		String intern = str1.intern(); //11 intern
		intern = str2.intern();
		System.out.println(intern);
		String concat = str1.concat(str2); //12 concat
		System.out.println(concat);
		String upper = str1.toUpperCase(); //14 toUpperCase
		System.out.println(upper);
		String subString = str1.substring(2, 4); substring
		System.out.println(subString);
		
		
		
	}
}		