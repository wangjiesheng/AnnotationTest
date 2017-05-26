/**
 * 
 */
package com.wang.entity;

import com.wang.annotation.isNotNull;
import com.wang.exception.BaseException;

/**
 * @author wang
 *
 */
public class Person {

	
	public String name;
	
	
	public int age;
	
	
	public String remark;

	@isNotNull(clz = BaseException.class, errorCode = "1001")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@isNotNull(clz = BaseException.class)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@isNotNull(clz = BaseException.class)
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
