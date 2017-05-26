/**
 * 
 */
package com.wang.test;

import com.wang.entity.Person;
import com.wang.utils.AnnotationHandler;

/**
 * @author wang
 *
 */
public class TestAnn {

	/**
	 * @param args
	 * @throws BizException 
	 */
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		p.setAge(18);
		AnnotationHandler.checkMothod(p);
	}
}
