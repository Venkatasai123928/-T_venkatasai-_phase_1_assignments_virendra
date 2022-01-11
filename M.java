package accessModifiers;

public class M {
	private int i=10;
	long l=577658l;
	protected float f;
	private void methodPrivateM() {
		System.out.println("ClassM : methodprivate");
		
	}

	void methodDefaultM() {
		System.out.println("ClassM: methodDefault");
		
	}
	protected void methodProtectedM() {
		System.out.println("classM: method protected");
		
	}


}

