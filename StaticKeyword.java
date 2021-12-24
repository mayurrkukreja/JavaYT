// Static Keyword in Java - 
// 1. variable
// 2. block 
// 3. methods
// 4. nested class (Inner class)

// - Memory management is efficiently done using static keyword. 
// non-access modifier 

class StaticKeyword {
	static int count = 0;

	StaticKeyword() {
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		StaticKeyword obj = new StaticKeyword();
		StaticKeyword obj2 = new StaticKeyword();
	}
}