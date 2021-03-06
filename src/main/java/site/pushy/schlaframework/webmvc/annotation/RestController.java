package site.pushy.schlaframework.webmvc.annotation;

import site.pushy.schlaframework.webmvc.enums.ContentType;

import java.lang.annotation.*;

/**
 * @author Pushy
 * @since 2019/3/12 19:04
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestController {

    String value() default "";

    ContentType contentType() default ContentType.JSON;

}
