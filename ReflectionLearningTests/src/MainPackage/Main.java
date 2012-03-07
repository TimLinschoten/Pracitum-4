package MainPackage;

import java.lang.reflect.*;

import Test1.*;

public class Main {

	public static void main(String[] args) {
		//test 1
		Method[] methods = MyClass.class.getDeclaredMethods();
		for(Method m : methods){
			if(m.getName().startsWith("test")){
				try{
					MyClass myClass = new MyClass();
					m.invoke(myClass, null);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
		//test 2
		MyClass myClass = new MyClass();
		myClass.printName();
		
		//test 3
		try {
			Method method = myClass.getClass().getMethod("printName", null);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		//test 4
		try {
			Method method = myClass.getClass().getDeclaredMethod("TestMyMethod3", null);
			System.out.println(method.toString());
		} catch (Exception e){
			e.printStackTrace();
		}
		
		//test 5
		try{
			Method method = myClass.getClass().getMethod("TestMyMethod4", new Class[]{String.class});
			method.invoke(myClass, "test 5");
		} catch(Exception e){
			e.printStackTrace();
		}
		
		/*//test 6
		try{
			Method method = myClass.getClass().getMethod("TestMyMethod5", new Class[]{String[].class});
			String[] s = new String[]{"test", " 6"};
			method.invoke(myClass, s);
		} catch(Exception e){
			e.printStackTrace();
		}*/
		
		//test 7
		try{
			Method method = myClass.getClass().getMethod("hashCode", null);
			int code = ((Integer) method.invoke(myClass, null)).intValue();
			System.out.println(code);
		}catch(Exception e){
			e.printStackTrace();
		}
		//test 8
		System.out.println(MyClass.class.getSuperclass());
	
		//test 9
		System.out.println(MyClass.class.isInstance(myClass));
		
		//test 10
		System.out.println(MyClass.class.isInterface());
		System.out.println(IMyClass.class.isInterface());
		
		//test 11
		System.out.println(Object.class.isAssignableFrom(String.class));
		System.out.println(Object.class.isAssignableFrom(double.class));
	}
}
