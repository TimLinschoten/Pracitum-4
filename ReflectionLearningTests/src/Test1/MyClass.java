package Test1;

public class MyClass implements IMyClass {
	public void testMyMethod1(){
	 System.out.println("method1");
	}
	
	public void testMyMethod2(){
		System.out.println("method2");
	}
	
	public void printName(){
		System.out.println(this.getClass().getName());
	}
	
	private void TestMyMethod3(){
		System.out.println("method3");
	}
	
	public void TestMyMethod4(String s){
		System.out.println(s);
	}
	
	public void TestMyMethod5(String[] s){
		String returnString = "";
		for(String string : s){
			returnString += string;
		}
		System.out.println(returnString);
	}
}
