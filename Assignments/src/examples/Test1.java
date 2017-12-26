package examples;

public class Test1 {

	public static void main(String[] args) {

		MethodChaining mc = new MethodChaining();
		String v = mc.getValue();
		int l = v.length();
		System.out.println(l);
		System.out.println(v);
		
		int l1 = mc.getValue().length();
		System.out.println(l1);
	}

}
