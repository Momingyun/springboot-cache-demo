package com.cache.dao;

import com.cache.entity.Person;

import java.util.List;

/**
 * @Description
 * @data 2019/9/9
 * @Author: LiuBin
 * @Modified By:
 */
public interface PersonDao {

    Person getPerson(Long id);

    int insert(Person person);

    List<Person> queryAll(Person person);
}
