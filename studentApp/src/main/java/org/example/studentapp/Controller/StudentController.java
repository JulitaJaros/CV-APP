package org.example.studentapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class StudentController {
    @GetMapping(value = "/students")
    public String getStudentsList(){
        return "person/personList";
    }
    @GetMapping(value = "/students/add")
    public String addStrudent(){
        return "person/addNewPerson";
    }
    @PostMapping(value = "/students/add")
    public RedirectView postAddStrudent(){
        return new RedirectView("/students");
    }
    @GetMapping(value = "/students/edit")
    public String getEditStudent(){
        return "person/editPerson";
    }
}
