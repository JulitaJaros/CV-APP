package org.example.studentapp.Controller;

import lombok.RequiredArgsConstructor;
import org.example.studentapp.Model.TaskModel;
import org.example.studentapp.Service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping(value = "/tasks")
    public String getAllTasks(){
        return "tasks/tasks";
    }
    @GetMapping(value = "/tasks/add")
    public String getAddTask(){
        return "tasks/addTask";
    }

    @PostMapping(value = "/tasks/add")
    public RedirectView postAddTask(TaskModel taskModel){
        taskService.addTask(taskModel);
        return new RedirectView("/tasks");
    }
    @GetMapping(value = "/tasks/edit")
    public String getEditTask(){
        return "tasks/editTask";
    }
}
