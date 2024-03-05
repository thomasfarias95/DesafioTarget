package QuintoDesafio;

public class Reverso {

	public static void main(String[] args) {
		
		String original = "Hello, world!";
        String reverso = reverterString(original);
        System.out.println("String original: " + original);
        System.out.println("String ao contrário: " + reverso);
    }
	public static String reverterString(String str) {
       
        if (str == null || str.isEmpty()) {
            return str;
        }
        String reverso = "";
        
       
        for (int i = str.length() - 1; i >= 0; i--) {
            
            reverso += str.charAt(i);
        }
        
        return reverso;
	}
}
