/**
 * 
 */
/**
 * @author wang
 *
 */
package com.wang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface isNotNull{
	
	String value() default "";
	
	String errorCode() default "99";
	
	Class<? extends Exception> clz();
}