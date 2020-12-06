package com.matthew.model.annotation;

import java.lang.annotation.*;

/**
 * @author Matthew
 * @date 2020/10/24 9:31
 * 日期类型转换注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface DateConvert
{
	String value() default "";
}
