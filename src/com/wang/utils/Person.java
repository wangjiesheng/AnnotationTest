/**
 * 
 */
package com.wang.utils;

import com.wang.annotation.isNotNull;
import com.wang.exception.BaseException;

/**
 * @author wang
 *
 */
public class Person {

	@isNotNull(clz = BaseException.class, errorCode = "1000")
	public String name;
	
	@isNotNull(clz = BaseException.class)
	public int age;
	
	@isNotNull(clz = BaseException.class)
	public String remark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", remark=" + remark
				+ "]";
	}
	
}
