package leetcodeEasy;

public class ReverseStringBeck {

	public static String reverseStringOne(char[] s) {

		StringBuilder sb = new StringBuilder();

		for (int i = s.length - 1; i >= 0; i--) {

			sb.append(s[i]);
		}
		return sb.toString();
	}

	public static String reverseStringTwo(char[] s) {

		int i = 0;
		int j = s.length - 1;

		while (i <= j) {

			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j++;
		}
		return s.toString();
	}

	public static void main(String[] args) {

		char[] inputOne = { 'h', 'e', 'l', 'l', 'o' };

		System.out.println("First One " + ReverseStringBeck.reverseStringOne(inputOne));

		char[] inputTwo = { 'H', 'a', 'n', 'n', 'a', 'h' };

		System.out.println("Second One " + ReverseStringBeck.reverseStringTwo(inputTwo));
	}

}