package com.example.web;

import com.example.domain.Person;
import com.example.domain.PersonDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wzy on 2017/2/13.
 */
@RestController
@Slf4j
public class ObjectRedisController {
    @Autowired
    PersonDao personDao;

    @RequestMapping("/setPerson")
    public void set(String id, String name, Integer age) {
        log.info("访问setPerson:id={},name={},age={}", id, name, age);
        Person person = new Person(id, name, age);
        personDao.save(person);
    }

    @RequestMapping("/getPerson")
    public Person getPerson(String id) {
        return personDao.getPerson(id);
    }
}
