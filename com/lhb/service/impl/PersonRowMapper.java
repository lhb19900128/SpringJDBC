/**
 * Project Name: SpringMysqlDemo
 * File Name: PersonRowMapper.java
 * Package Name: com.lhb.service.impl
 * Date: 2015年11月1日 下午6:26:39
 * Copyright (c) 2015, liuhongbo@58ganji.com All Rights Reserved.
 *
 */
package com.lhb.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lhb.bean.Person;

/**
 * @ClassName: PersonRowMapper
 * @Description: TODO
 * @author liuhongbo@58ganji.com
 * @Date 2015年11月1日 下午6:26:39
 */
public class PersonRowMapper implements RowMapper<Person> {

	/**
	 * @Description: TODO
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 * @param @param rs
	 * @param @param rowNum
	 * @param @return
	 * @param @throws SQLException
	 */
	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person(rs.getInt("id"), rs.getString("name"),
				rs.getInt("age"), rs.getString("sex"));
		return person;
	}

}
