/**
 * Project Name: SpringMysqlDemo
 * File Name: PersonServiceBean.java
 * Package Name: com.lhb.service.impl
 * Date: 2015年11月1日 下午5:32:30
 * Copyright (c) 2015, liuhongbo@58ganji.com All Rights Reserved.
 *
 */
package com.lhb.service.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.lhb.bean.Person;
import com.lhb.service.PersonService;

/**
 * @ClassName: PersonServiceBean
 * @Description: TODO
 * @author liuhongbo@58ganji.com
 * @Date 2015年11月1日 下午5:32:30
 */
public class PersonServiceBean implements PersonService {

	private DataSource dataSource;
	private JdbcTemplate template;

	/**
	 * @Description: TODO
	 * @see com.lhb.service.PersonService#save(com.lhb.bean.Person)
	 * @param @param person
	 */
	@Override
	public void save(Person person) {
		template.update(
				"insert into person(name,age,sex) value(?,?,?)",
				new Object[] { person.getName(), person.getAge(),
						person.getSex() }, new int[] { java.sql.Types.VARCHAR,
						java.sql.Types.INTEGER, java.sql.Types.VARCHAR });
	}

	/**
	 * @Description: TODO
	 * @see com.lhb.service.PersonService#update(com.lhb.bean.Person)
	 * @param @param person
	 */
	@Override
	public void update(Person person) {
		template.update(
				"update person set name=?,age=?,sex=? where id=?",
				new Object[] { person.getName(), person.getAge(),
						person.getSex(), person.getId() }, new int[] {
						java.sql.Types.VARCHAR, java.sql.Types.INTEGER,
						java.sql.Types.VARCHAR, java.sql.Types.INTEGER });
		// template.update(
		// "update person set name=?,age=?,sex=? where id=?",
		// new Object[] { person.getName(), person.getAge(),
		// person.getSex(), person.getId() }, new int[] {
		// java.sql.Types.VARCHAR, java.sql.Types.INTEGER,
		// java.sql.Types.VARCHAR, java.sql.Types.INTEGER });
	}

	/**
	 * @Description: TODO
	 * @see com.lhb.service.PersonService#getPerson(java.lang.Integer)
	 * @param @param id
	 * @param @return
	 */
	@Override
	public Person getPerson(Integer id) {
		return template.queryForObject("select * from person where id=?",
				new Object[] { id }, new int[] { java.sql.Types.INTEGER },
				new PersonRowMapper());
	}

	/**
	 * @Description: TODO
	 * @see com.lhb.service.PersonService#getPerson()
	 * @param @return
	 */
	@Override
	public List<Person> getPerson() {
		List<Person> list = template.query("select * from person",
				new PersonRowMapper());
		return list;
	}

	/**
	 * @Description: TODO
	 * @see com.lhb.service.PersonService#delete(java.lang.Integer)
	 * @param @param id
	 */
	@Override
	public void delete(Integer id) {
		template.update("delete from person where id = ?", new Object[] { id },
				new int[] { java.sql.Types.INTEGER });
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}

}
