package HW_16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Throwable {
        CustomClass customClass = new CustomClass();

        Class classCustom = customClass.getClass();

        Field[] fields = classCustom.getFields();
        Method[] methods = classCustom.getMethods();
        Constructor[] constructors = classCustom.getConstructors();
        Class inst1 = classCustom.getNestHost();
        Class inst2 = classCustom.getNestHost();
        Method method = classCustom.getMethod("getName");
        Method method1 = classCustom.getMethod("tryTest", int.class);

        for (Field f : fields) {
            System.out.println(f);
        }
        for (Method m : methods) {
            System.out.println(m);
        }
        for (Constructor c : constructors) {
            System.out.println(c);
        }
        for (Field f : fields) {
            System.out.println(f);
        }

    }
}
