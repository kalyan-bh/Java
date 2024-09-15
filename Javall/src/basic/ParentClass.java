package basic;

public class ParentClass {

}
class Other{
}
class ChildClass extends ParentClass{
	
	public static void main(String[] args) {
		ParentClass p=new ChildClass();
		System.out.println(p instanceof ChildClass);
		System.out.println(p instanceof ParentClass);
		Other o=new Other();
		System.out.println(o instanceof Other);
		//ParentClass o1=new Other();
		//Other o2=new ParentClass();
		ChildClass c=(ChildClass) p;//p=new ChildClass();
		System.out.println(c instanceof ParentClass);
		System.out.println(c instanceof ChildClass);
		//ChildClass c2=new ParentClass();//compile time error
		//ChildClass c1=(ChildClass) new ParentClass();//gives runtime error
	}
	
}