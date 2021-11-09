package com.example.demorestfulapi.student;

import com.example.demorestfulapi.responsitory.StudentResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentResponsitory responsitory;

    @Autowired
    public StudentService(StudentResponsitory responsitory) {
        this.responsitory = responsitory;
    }

    public Optional<Student> selectPersonByID(@PathVariable String id) {
        return responsitory.findAll().stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    public Student addStudent(Student student) {
        return responsitory.insert(student);
    }

    public List<Student> getAll() {
        return responsitory.findAll();
    }

    public Optional<Student> getById(String id) {
        return responsitory.findStudentByEmail(id);
    }

    public int deleteStudent(String id) {
        responsitory.deleteById(id);
        return 0;
    }

    public int updateStudentById(String id, Student student) {
        responsitory.save(student);
        return 0;
    }
}
