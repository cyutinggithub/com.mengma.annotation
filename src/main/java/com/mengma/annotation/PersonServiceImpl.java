package com.mengma.annotation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Resource(name = "personDao")
    private PersonDao personDao;

    public PersonDao getPersonDao(){
        return personDao;
    }

    @Override
    public void add(){
        personDao.add();
        System.out.println("Service层的add()方法执行了...");
    }
}