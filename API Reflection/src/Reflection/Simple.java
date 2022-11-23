package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Simple {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		String str = "methodA"; // String test call this method

		Method s = Simple.class.getMethod(str);

		s.invoke(s);
	}

	public static void methodA() {
		System.out.println(" start to end");
	}

	public static void methodlogin(Integer a, Integer b) {
		System.out.println(a * b);
	}
}