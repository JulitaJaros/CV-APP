package org.example.studentapp.Service;

import lombok.RequiredArgsConstructor;
import org.example.studentapp.Model.TaskModel;
import org.example.studentapp.Repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

   private final TaskRepository taskRepository;

   public void addTask(TaskModel taskModel){
       taskRepository.save(taskModel);
   }

}
