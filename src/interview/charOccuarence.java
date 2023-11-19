package interview;

public class charOccuarence {

	public static void main(String[] args) {

		String stringValue = "java is simple";
		String newString = null;

		if (stringValue.contains("a")) {

			newString = stringValue.replace("a", "");
		}
		System.out.println(newString);

	}

}
