package com.marlabs.bala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marlabs.bala.Repository.InstructorRepository;
import com.marlabs.bala.entity.Instructor;
import com.marlabs.bala.entity.InstructorDetail;

@SpringBootApplication
public class SpringbootOne2OneMappingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOne2OneMappingApplication.class, args);
	}
	
	@Autowired
    private InstructorRepository instructorRepository;

    @Override
    public void run(String...args) throws Exception 
    {

        Instructor instructor = new Instructor("Bala", "yasarapu", "Bala@gmail.com");

        InstructorDetail instructorDetail = new InstructorDetail("Study", "VolleyBall Playing");

        // associate the objects
        instructor.setInstructorDetail(instructorDetail);

        instructorRepository.save(instructor);
    }

}
