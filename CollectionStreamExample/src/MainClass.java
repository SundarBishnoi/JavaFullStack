import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainClass {
	private static void method1() {
		Pattern pattern = Pattern.compile("H[efg]");
		Matcher matcher = pattern.matcher("Hello World How are you");
		System.out.println("From Method1");
		while (matcher.find()) {	
			System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());			
		}
	}
	private static void method2() {
		Pattern pattern = Pattern.compile("\\s");
		Matcher matcher = pattern.matcher("Hello World How are you");
		System.out.println("From Method2");
		while (matcher.find()) {	
			System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());			
		}
	}
	private static void method3() {
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher("Hello World8 How9 are you");
		System.out.println("From Method3");
		while (matcher.find()) {	
			System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());			
		}
	}
	private static void method4() {
		Pattern pattern = Pattern.compile("H[a-x]*");
		Matcher matcher = pattern.matcher("Hello World How are you");
		System.out.println("From Method4");
		while (matcher.find()) {	
			System.out.println(matcher.start()+" "+matcher.end()+" "+matcher.group());			
		}
	}
	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();

	}

}
