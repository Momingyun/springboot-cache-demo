package com.cache.cntroller;

import com.cache.entity.Person;
import com.cache.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ramostear
 * @create-time 2019/4/7 0007-0:54
 * @modify by :
 * @since:
 */
@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public ResponseEntity<Person> person(@PathVariable(value = "id") Long id) {
        return new ResponseEntity<>(personService.getPerson(id), HttpStatus.OK);
    }

    @GetMapping("/add")
    public int insert() {
        this.personService.insert();
        return 1;
    }

    @GetMapping("/all")
    public List<Person> all() {
        List<Person> query = this.personService.query();
        return query;
    }
}
