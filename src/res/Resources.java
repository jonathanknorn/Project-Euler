package res;

public class Resources {

	public static boolean isPalindrome(int n){
		return isPalindrome(new Integer(n).toString());
	}
	
	public static boolean isPalindrome(String s){
		char[] chars = s.toCharArray();
		for(int i = 0; i < chars.length/2; i++){
			if(chars[i] != chars[chars.length-1-i]){
				return false;
			}
		}
		return true;
	}

}
