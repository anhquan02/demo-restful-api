package com.example.demorestfulapi.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;
import java.util.Optional;


@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAll();
    }

    @GetMapping(path = "/students/{studentId}")
    public Optional<Student> findById(@PathVariable String studentId){
        return studentService.selectPersonByID(studentId);
    }

    @PostMapping("/students")
    public void addNewStudent(@RequestBody @Valid Student student) {
        studentService.addStudent(student);
    }

    @PutMapping(path = "/students/{studentId}")
    public void updateStudent(@PathVariable("studentId") String studentId,
                              @RequestBody Student student) {
        studentService.updateStudentById(studentId, student);
    }

    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable("studentId") String studentId) {
        studentService.deleteStudent(studentId);
    }

}
