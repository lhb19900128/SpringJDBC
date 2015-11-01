/**
 * Project Name: SpringMysqlDemo
 * File Name: SpringJDBCTest.java
 * Package Name: com.lhb.test
 * Date: 2015年11月1日 下午7:07:10
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
 * @ClassName: SpringJDBCTest
 * @Description: TODO
 * @author liuhongbo@58ganji.com
 * @Date 2015年11月1日 下午7:07:10
 */

public class SpringJDBCTest {

    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("bean.xml");

        PersonService personService = (PersonService) act
                .getBean("personService");

        Person person = new Person();
        person.setName("苏东坡");
        person.setAge(21);
        person.setSex("男");

        // 保存一条记录
        personService.save(person);

        List<Person> person1 = personService.getPerson();
        System.out.println("++++++++得到所有Person");
        for (Person person2 : person1) {
            System.out.println(person2.getId() + "  " + person2.getName()
                    + "   " + person2.getAge() + "  " + person2.getSex());
        }
        Person updatePerson = new Person();
        updatePerson.setName("Divide");
        updatePerson.setAge(20);
        updatePerson.setSex("男");
        updatePerson.setId(5);
        // 更新一条记录
        personService.update(updatePerson);
        System.out.println("******************");

        // 获取一条记录
        Person onePerson = personService.getPerson(2);
        System.out.println(onePerson.getId() + "  " + onePerson.getName()
                + "  " + onePerson.getAge() + "  " + onePerson.getSex());
        // 删除一条记录
        personService.delete(1);
    }
}
