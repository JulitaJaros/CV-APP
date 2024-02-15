package org.example.studentapp.Service;

import lombok.RequiredArgsConstructor;
import org.example.studentapp.Model.StudentModel;
import org.example.studentapp.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public List<StudentModel> getStudentList(){
        return studentRepository.findAll();
    }

    public void addStudent(StudentModel studentModel){
        studentRepository.save(studentModel);
    }
}
