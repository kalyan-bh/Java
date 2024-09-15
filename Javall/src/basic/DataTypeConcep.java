package basic;

public class DataTypeConcep {
	public DataTypeConcep() {

	}
	
	public void ckInt() {
		Integer v1=3;
		Integer v2=3;
		System.out.println(v1==v2);
		/*
		 * wrapper class objects are stored in heap memory
		 */
		
		Integer n1=new Integer(4);
		Integer n2=new Integer(4);
		System.out.println(n1==n2);
		/*
		 * n1 and n2 are stored at different locations with different reference numbers
		 */
	}
	
	public void ckEquals() {
		String s1=new String("welcome back");
		String s2=new String("welcome back");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		/*
		 * "==" is a operator which compares reference or memory location/address
		 *  of the objects in heap,whether the point to same location or not
		 * "equals()" is a method which compares values/contents of the object
		 */
	}
	
	public void ix1() {
		int x=5;
		x*=3+7; // x*=3+7 --> x=x*(3+7)
		System.out.println(x);
		x=5;
		x=x*3+7; // x*3+7 --> x*3 + 7
		System.out.println(x);
		
	}
	
	public void sx1() {
		String s="myworkisgood";
		String c="sgo";
		boolean b=s.contains(c); //checks the substring 
		System.out.println(b);
	}
	
	public void sx2() {
		char c='a';
		String str=""+c; // converting char to string
		System.out.println(str);
	}
	
	public void ix2(){
		int x=4;
		System.out.println(x>>>1);  // unsigned right shift operator
		int y=6;
		System.out.println(y>>>1);  // unsigned right shift operator
	}
	
	public void sx3() {
		String s="java";
		s.concat(" with me"); //does not store anywhere
		s.replace('a', 'b'); //does not store anywhere
		System.out.println(s);  // for this print fun it shows without changing
		s=s.concat(" now it is stored");
		s=s.replace('o','e');
		System.out.println(s); //changes shown as it is stored
		System.out.println(s.concat(" python")); //can also print without storing
	}
	
	public void arr1() {
		int array1[]= {1,2,3,4,5,7};
		int array2[]= {1,2};
		array2=array1; // array 2 will become equals to array 1
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]+ " ");
		}
	}

	public static void main(String[] args) {
		DataTypeConcep d= new DataTypeConcep();
		//d.ckInt();
		//d.ckEquals();
		//d.ix1();
		d.ix2();
		//d.sx1();
		//d.sx2();
		//d.sx3();
		//d.arr1();
	}
}
