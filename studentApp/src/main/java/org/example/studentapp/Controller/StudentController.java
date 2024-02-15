package org.example.studentapp.Controller;

import lombok.RequiredArgsConstructor;
import org.example.studentapp.Model.StudentModel;
import org.example.studentapp.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
    @GetMapping(value = "/students")
    public String getStudentsList(){
        return "person/personList";
    }
    @GetMapping(value = "/students/add")
    public String addStrudent(){
        return "person/addNewPerson";
    }
    @PostMapping(value = "/students/add")
    public RedirectView postAddStudent(StudentModel studentModel){
        studentService.addStudent(studentModel);
        return new RedirectView("/students");
    }
    @GetMapping(value = "/students/edit")
    public String getEditStudent(){
        return "person/editPerson";
    }
}
