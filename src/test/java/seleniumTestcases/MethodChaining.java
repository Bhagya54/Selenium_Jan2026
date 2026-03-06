package seleniumTestcases;

public class MethodChaining {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(str);
		String replaceStr = str.replace("e","o");
		System.out.println(replaceStr);
		String lowerCaseString=replaceStr.toLowerCase();
		System.out.println(lowerCaseString);
		
		
		System.out.println(str.replace("e","o").toLowerCase());
	}

}
