package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	@Value("$(value.name)")
            @GetMapping("/")
            public String homepage() {
            	return "Welcome to student list";
            }
            @GetMapping("/list")
            public List<Student> getList(){
            	List<Student> detailsList=new ArrayList<>();
            	detailsList.add(new Student(1,"xxxx",4));
            	detailsList.add(new Student(2,"yyyy",3));
            	detailsList.add(new Student(3,"zzzz",5));
            	return detailsList;
            }
}