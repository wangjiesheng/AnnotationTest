/**
 * 
 */
package com.wang.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.wang.annotation.isNotNull;

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
		checkColumn(p);
	}

	private static void checkColumn(Object obj) throws InstantiationException, Exception {
		Class<? extends Object> c = obj.getClass();
		Field [] field =c.getFields();
		for (Field field2 : field) {
			boolean isExist = field2.isAnnotationPresent(isNotNull.class);
			//��������ע��
			if(isExist){
				//ȡ�ֶ�����
				String fieldName = field2.getName();
				//����������滹�ж���
				
				Object fieldValue = null;
				//ȡ�ֶ�ֵ
				try {
					Method m = c.getMethod("get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1));
					fieldValue = m.invoke(obj);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(fieldValue == null || (fieldValue instanceof Integer && (Integer)fieldValue == 0)){
					System.out.println("�ֶ�" + fieldName + "Ϊ��,���쳣!");
					
					//ȡע�����Զ���Ķ���
					fileAnno(field2);
				}
			}
		}
	}
	
	public static void fileAnno(Field field2) throws InstantiationException, IllegalAccessException, Exception{
		Annotation[] anno = field2.getDeclaredAnnotations();//��ȡ�ֶ��ϵĹ���ע��
		for (Annotation annotation : anno) {
			if(annotation.annotationType().equals(isNotNull.class)){
				isNotNull is = (isNotNull)annotation;
				Class<? extends Exception> clz = is.clz();
				Constructor<? extends Exception> cons = clz.getDeclaredConstructor(String.class, String.class);//�����вι�����
				throw cons.newInstance(is.errorCode(), "δ֪����");
			}
		}
	}

}
