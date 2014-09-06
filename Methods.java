public class Methods
{
	public static void main (String [] args)
	{
		String str1 = "Hello";
		String str2 = "Bye";
		String str3 = "    H   I  ";
		int compare = str1.compareTo(str2); //1
		System.out.println(compare);
		boolean truth1 = str1.endsWith("o"); //2
		System.out.println(truth1);
		boolean truth2 = str2.equalsIgnoreCase("BYE"); //3
		System.out.println(truth2);
		int hash = str1.hashCode(); //4
		System.out.println(hash);
		boolean match = str2.matches("Bye\n"); //5
		System.out.println(match);
		int codePoint = str1.codePointAt(3); //6
		System.out.println(codePoint);
		String trim = str3.trim(); //7
		System.out.println("Hi " + trim);
		int length = str1.length() + str2.length(); //8
		System.out.println(length);
		String replace = str1.replace("ell", "ipp"); //9
		System.out.println(replace);
		char[] chararray = str2.toCharArray(); //10
		System.out.println(chararray);
		String intern = str1.intern(); //11
		intern = str2.intern();
		System.out.println(intern);
		
	}
}		