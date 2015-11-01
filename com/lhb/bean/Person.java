/**
 * Project Name: SpringMysqlDemo
 * File Name: Person.java
 * Package Name: com.lhb.bean
 * Date: 2015年11月1日 下午5:28:52
 * Copyright (c) 2015, liuhongbo@58ganji.com All Rights Reserved.
 *
 */
package com.lhb.bean;

/**
 * @ClassName: Person
 * @Description: TODO
 * @author liuhongbo@58ganji.com
 * @Date 2015年11月1日 下午5:28:52
 */
public class Person {
	private String name;
	private int age;
	private String sex;
	private int id;

	/**
	 * Creates a new instance of Person.
	 *
	 */
	public Person(int id, String name, int age, String sex) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Person() {
	}

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
