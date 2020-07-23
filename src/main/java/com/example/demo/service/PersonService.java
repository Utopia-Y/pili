package com.example.demo.service;


import com.example.demo.dao.PersonDao;
import com.example.demo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired(required = false)
    PersonMapper personmapper;

    public List<PersonDao> personDaoList(){
        return personmapper.getAllPerson();
    }

    public int insert(PersonDao personDao){
        return personmapper.InsertPerson(personDao);
    }

    public int delete(int id){
        return personmapper.delPersonById(id);
    }

    public int update(PersonDao personDao){
        return personmapper.UpdatePerson(personDao);
    }

    public PersonDao getById(int id){
        return personmapper.getPersonById(id);
    }

}
