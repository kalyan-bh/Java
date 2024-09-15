package basic;

public class MethodConcep {
	// Static Method
    static int getValue() {
        return 42;
    }
    
    
    /*
	 * //method overloading
	 * in case of mehtod overloading with different parameters the method
	 * with the input argument type will be called.
	 */
	public static void a(int c) {
		System.out.println("int");
	}
	public static void a(byte c) {  
		System.out.println("byte");
	}
	public static void main(String[] args){
		// Calling static method
        int result = MethodConcep.getValue();
        System.out.println("Result from static method: " + result);
		
		byte s;
		a(s=2);//we can also give values while calling in a mehtod
		
	
	}
}
