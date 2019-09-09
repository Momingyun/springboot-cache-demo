package com.cache.service;

import com.cache.dao.PersonDao;
import com.cache.entity.Person;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ramostear
 * @create-time 2019/4/7 0007-0:51
 * @modify by :
 * @since:
 */
@Service(value = "personService")
public class PersonService {
    @Resource
    private PersonDao personDao;

    @Cacheable(cacheNames = "person", key = "#id")
    public Person getPerson(Long id) {
        return this.personDao.getPerson(id);
    }

    public void insert() {
        Person person = null;
        for (int i = 0; i < 1000; i++) {
            person = new Person();
            person.setUserName("测试" + i);
            person.setEmail(i + "测试@qq.com");
            personDao.insert(person);
        }
    }

    @Cacheable(value = "persons")
    public List<Person> query() {
        Person person = new Person();
        List<Person> people = this.personDao.queryAll(person);
        return people;
    }
}
