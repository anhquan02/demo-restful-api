package com.example.demorestfulapi;

import com.example.demorestfulapi.student.Address;
import com.example.demorestfulapi.student.Gender;
import com.example.demorestfulapi.student.Student;
import com.example.demorestfulapi.responsitory.StudentResponsitory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DemoRestfulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestfulApiApplication.class, args);
	}


//	@Bean
//	CommandLineRunner runner(StudentResponsitory responsitory, MongoTemplate mongoTemplate){
//		return args -> {
//			Address address = new Address(
//					"VietNam",
//					"HaNoi",
//					"VN"
//			);
//			Student student = new Student(
//					"Quan",
//					"quan.leanh.02@gmail.com",
//					Gender.MALE,
//					address,
//					List.of("Computer sience","Math"),
//					BigDecimal.TEN,
//					LocalDateTime.now()
//			);
//			String email = "quan.leanh.02@gmail.com";
////			usingMongoTemplateAndQuery(responsitory, mongoTemplate, student, email);
//			responsitory.findStudentByEmail(email)
//					.ifPresentOrElse(student1 -> {
//						System.out.println(student1+" already exists");
//					},()->{
//						System.out.println("Inserting student: "+ student);
//						responsitory.insert(student);
//					});
//
//		};
//	}
//
//	private void usingMongoTemplateAndQuery(StudentResponsitory responsitory, MongoTemplate mongoTemplate, Student student, String email) throws IllegalAccessException {
//		Query query = new Query();
//		query.addCriteria(Criteria.where("email").is(email));
//
//		List<Student> students = mongoTemplate.find(query, Student.class);
//		if(students.size()>1){
//			throw new IllegalAccessException("found many students with email"+ email);
//		}
//		if(students.isEmpty()) {
//			System.out.println("Inserting student: "+ student);
//			responsitory.insert(student);
//		}else{
//			System.out.println(students+" already exists");
//		}
//	}
}
