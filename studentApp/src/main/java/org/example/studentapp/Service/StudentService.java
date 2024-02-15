package org.example.studentapp.Service;

import lombok.RequiredArgsConstructor;
import org.example.studentapp.Model.StudentModel;
import org.example.studentapp.Repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public void addStudent(StudentModel studentModel){
        studentRepository.save(studentModel);
    }
}
