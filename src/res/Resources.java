package res;

import java.util.Arrays;


public class Resources {

	public static boolean isPalindrome(long n){
		return isPalindrome(new Long(n).toString());
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
	
	public static long reverse(long l){
		String s = Long.toString(l);
		long res = 0;
		for(int i = 0; i<s.length();i++){
			res += (s.charAt(i) - '0') * Math.pow(10, i);
		}
		return res;
	}

	public static boolean isPrime(long n) {
		if(n%2 == 0){
			return false;
		}
		for(int i = 3; i*i<=n; i+=2){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static String sort (long i){
		char[] c = Long.valueOf(i).toString().toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	public static int sum (long i){
		int sum = 0;
		while(i>0){
			sum += i%10;
			i = i / 10;
		}
		return sum;
	}
	
	public static boolean isNPandigital(long i){
		if(i > 987654321){
			return false;
		}
		int n = 0;
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		for (int j = (int)i; j > 0; j = j / 10){
			n++;
			a[j%10] = 0;
		}
		for(int j = 1; j <= n; j++){
			if(a[j] != 0){
				return false;
			}
		}
		return true;
	}

	public static long fac(long i) {
		long res = 1;
		for(int f = 1; f <= i; f++){
			res *= f;
		}
		return res;
	}
}
