package com.mengma.annotation;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("personAction")
public class PersonAction {
    @Resource(name = "personService")
    private PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }

    public void add(){
        personService.add();
        System.out.println("Action层的add()方法执行了...");
    }
}
