class ConstructorStaticTest {
	ConstructorStaticTest() {
		System.out.println(this.toString());
	}
	public static void main(String[] args) {
		new ConstructorStaticTest();
		new ConstructorStaticTest();
		new ConstructorStaticTest();
		new ConstructorStaticTest();
		new ConstructorStaticTest();
		new ConstructorStaticTest();
	}
}