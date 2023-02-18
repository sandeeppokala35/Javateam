package Reflection;

import java.lang.reflect.Method;

// Reflection of API run Behavior  of class and Testing used
public class ReflectionDemo {
	// To call the private method
	public static void main(String[] args) throws Exception {

		Class c = Class.forName("Reflection");
		TestingReflect t = (TestingReflect) c.newInstance();

		Method m = c.getDeclaredMethod("JAVA TEAM", null);
		m.setAccessible(true);
		m.invoke(t, null);

	}

}
