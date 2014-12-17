package res;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(int i = 10; i < 1024; i++){
			long sum = i;
			long old = (sum % 100);
			long ny =  ((sum % 10)*10) + sum%100/10;
			sum += (ny - old);
			String a = new Long(sum).toString();
			char aa = a.charAt(a.length()-1);
			char ab = a.charAt(a.length()-2);
			String b = a;
//			.substring(0,a.length()-2) + aa + ab;
			if(b.equals(a)){
				System.out.println(a + " " + b);
			}
		}
		
		
		
//		System.out.println(old);
//		System.out.println(ny);
//		System.out.println(ny - old);
//		System.out.println(old - ny);
//		System.out.println(sum);
		
//		System.out.println(sum%100/10);
	}

}
