/**
 * Project Name: SpringMysqlDemo
 * File Name: PersonService.java
 * Package Name: com.lhb.service
 * Date: 2015年11月1日 下午5:30:48
 * Copyright (c) 2015, liuhongbo@58ganji.com All Rights Reserved.
 *
 */
package com.lhb.service;

import java.util.List;

import com.lhb.bean.Person;

/**
 * @ClassName: PersonService
 * @Description: TODO
 * @author liuhongbo@58ganji.com
 * @Date 2015年11月1日 下午5:30:48
 */
public interface PersonService {

	/**
	 * 保存Person
	 * 
	 * @param person
	*/
	public abstract void save(Person person);

	/**
	 * 更新Person
	 * 
	 * @param person
	*/
	public abstract void update(Person person);

	/**
	 * 获取Person
	 * 
	 * @param id
	 * @return
	*/
	public abstract Person getPerson(Integer id);

	/**
	 * 获取所有Person
	 * 
	 * @return
	*/
	public abstract List<Person> getPerson();

	/**
	 * 删除指定id的Person
	 * 
	 * @param id
	*/
	public abstract void delete(Integer id);

}
