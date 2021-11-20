package javapgms;

public class Another {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String d="am learning java";
		System.out.println(d.length());// starting from 1
		System.out.println(d.charAt(4));// to find character at particular index
		System.out.println(d.toLowerCase());// to convert string to small letters
		System.out.println(d.toUpperCase());// to convert entire string to capital letter
		System.out.println(d);// to check string value not changing
		System.out.println(d.indexOf('j'));//starting from 0 to calculate index
		System.out.println(d.concat("today"));// to append something
		System.out.println(d.equals("sanio"));// to check string and passed values are equal or not (true/false)
		System.out.println(d.equalsIgnoreCase("AM LEARNING JAVA"));// initially convert string to upper case, then perform comparison
		System.out.println(d.replace("ng", "ee"));// replace with other 
		System.out.println(d.compareTo("am learning java"));// if equal returns 0, compares each character by character of the string(unicode)
	d.split("ar");
		System.out.println(d.isEmpty());// check empty or not
		System.out.println(d.toCharArray());// to convert to char array
		System.out.println(d.trim());// eliminates leading and trailing spaces
		// to change value of string there by change original value
		String n="nathan is walking is";
		System.out.println(n);
		 n =n.concat("and listening music");// here actual string object changes as we referred changed string to same variable
		 System.out.println(n);
		 System.out.println(n.substring(5));// substring begins with character at the specified index 
		 // here with n
		 System.out.println(n.replaceAll("is","was"));// will replace all matching is value with was in string
		 System.out.println(n.replaceFirst("is", "was"));// replce only first match is with was 
		 
		 
		 String h="sanio is watching TV";
		 char ch;
		 String rev = "";
		 for (int i=0;i<h.length();i++)
		 {
			ch=h.charAt(i);
			rev=ch+rev;
		 }
		 
		 System.out.println(rev);
		 
		 
		 System.out.println(d.split("s"));
		
	}

}
