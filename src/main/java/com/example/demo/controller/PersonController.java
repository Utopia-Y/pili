package com.example.demo.controller;


import com.example.demo.dao.PersonDao;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

    @Autowired(required = false)
    PersonService personService;

    //展示
    @RequestMapping("/list")
    public String personDaoList(Model model){
        model.addAttribute("personDaoList", personService.personDaoList());
        return "redirect:personDaoList";
    }

    //删除
    @RequestMapping("/delete")
    public String deletePerson(int id){
        personService.delete(id);
        return "redierct:personDaoList";
    }

    //插入
    @RequestMapping("/add")
    public String addPerson(ModelMap map){
        map.addAttribute("personDaoList", new PersonDao());
        return "redirect:personDaoList";
    }


    @RequestMapping("/update")
    public String updatePerson(ModelMap map){
        map.addAttribute("personDaoList",new PersonDao());
        return "Modify";
    }

    @RequestMapping("/save")
    public String savePerson(@ModelAttribute PersonDao personDao){
        personService.update(personDao);
        return "personDapList";
    }

}













