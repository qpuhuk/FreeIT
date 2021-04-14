package AlexLink.HomeWork.Annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Version {
    double numberVersion();
    String secretName() default "";

}
