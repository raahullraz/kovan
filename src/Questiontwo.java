
public class Questiontwo {
	public static void main(String[] args) {

		System.out.println(findLen("((()"));
		System.out.println(findLen(")()())"));
		System.out.println(findLen("()(()))))"));
	}

	private static int findLen(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				count++;
			} else

				count--;
		}
		if (count < 0) {
			count = -(count);
		}
		int result = str.length() - count;

		return result;
	}

}
