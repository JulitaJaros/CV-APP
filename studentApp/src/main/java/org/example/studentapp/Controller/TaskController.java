package org.example.studentapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    @GetMapping(value = "/tasks")
    public String getAllTasks(){
        return "tasks/tasks";
    }

    @GetMapping(value = "/addTask")
    public String getAddTask(){
        return "tasks/addTask";
    }
}
