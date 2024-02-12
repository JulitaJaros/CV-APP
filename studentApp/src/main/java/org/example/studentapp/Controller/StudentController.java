package org.example.studentapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping(value = "/students")
    public String getStudentsList(){
        return "person/personList";
    }
    @GetMapping(value = "/addStrudent")
    public String addStrudent(){
        return "person/addNewPerson";
    }
    @GetMapping(value = "/editPerson")
    public String getEditStudent(){
        return "person/editPerson";
    }
}
