package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
@Configuration
public class StudentSemesterRecordApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSemesterRecordApplication.class, args);
	}

}
