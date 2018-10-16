package personalValidation;

public class regexoractuce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "TWani";
		String regex = "^[A-Z][a-z]{0,29}";
		boolean answer = name.matches(regex);
		System.out.println(answer);
	}

}
