package basic;

public class ClassConcep {
	public ClassConcep() {
		System.out.println("constructor executed");
	}
	
	String str=new String("ka");
	String str2="ka";
	
	/*
	 * Instance Initializer Block
	 * Instance initializer block got more preference over constructor
	 */
	
	{   // block-start
		if(str==str2)
			System.out.println("equal");
		else
			System.out.println("not equal");
	}  // block-end while declaring directly in class we should use blocks
	
	
	
	/*
	 *  Static Initializer Block
	 *  Static block executes when the class is first loaded
	 *  static block got more preference over other blocks and it only executes once. 
	 */
    static {
        System.out.println("Static Initializer Block executed.");
    }


	public static void main(String[] args) {
		ClassConcep c= new ClassConcep();
	}
}
