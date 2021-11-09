package com.example.demorestfulapi.responsitory;

import com.example.demorestfulapi.student.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface StudentResponsitory extends MongoRepository<Student,String> {
    Optional<Student> findStudentByEmail(String email);

}
