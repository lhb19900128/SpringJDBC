/**
 * Project Name: SpringMysqlDemo
 * File Name: Main.java
 * Package Name: com.lhb.test
 * Date: 2015年11月1日 下午7:15:39
 * Copyright (c) 2015, liuhongbo@58ganji.com All Rights Reserved.
 *
 */
package com.lhb.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lhb.bean.Person;
import com.lhb.service.PersonService;

/**
 * @ClassName: Main
 * @Description: TODO
 * @author liuhongbo@58ganji.com
 * @Date 2015年11月1日 下午7:15:39
 */
public class Main {

	/** 
	 * @Title: main 
	 * @Description: TODO
	 * @param @param args 
	 * @return void 
	 * @throws 
	 */
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("bean.xml");

        PersonService personService = (PersonService) act
                .getBean("personService");

        Person person = new Person();
        person.setName("超级天才刘小波");
        person.setAge(25);
        person.setSex("男");
//
//        // 保存一条记录
        personService.save(person);

        List<Person> person1 = personService.getPerson();
        System.out.println("++++++++得到所有Person");
        for (Person person2 : person1) {
            System.out.println(person2.getId() + "  " + person2.getName()
                    + "   " + person2.getAge() + "  " + person2.getSex());
        }
//        Person updatePerson = new Person();
//        updatePerson.setName("Divide");
//        updatePerson.setAge(23);
//        updatePerson.setSex("男");
//        updatePerson.setId(2);
        // 更新一条记录
//        personService.update(updatePerson);
//        System.out.println("******************");
//
//        // 获取一条记录
//        Person onePerson = personService.getPerson(2);
//        System.out.println(onePerson.getId() + "  " + onePerson.getName()
//                + "  " + onePerson.getAge() + "  " + onePerson.getSex());
        // 删除一条记录
//        personService.delete(1);
	}

}
