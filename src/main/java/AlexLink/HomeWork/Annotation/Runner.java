package AlexLink.HomeWork.Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        inspectService(MyService.class);

    }
       public static void inspectService (Class<?> MyService) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
            if (MyService.getAnnotation(Version.class) != null && MyService.getAnnotation(Version.class).numberVersion() != 0) {
                MyService myService = new MyService();
                myService.setId(22345);
                myService.setName("Muuuuu");
                thisClassInfo(myService);
            }
            else {
                System.out.println("error");
            }
        }
    public static void thisClassInfo(MyService myService) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = myService.getClass().getDeclaredMethod("thisClassInfo");
        method.setAccessible(true);
        method.invoke(myService);
    }

}
