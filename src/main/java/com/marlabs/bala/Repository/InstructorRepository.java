package com.marlabs.bala.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marlabs.bala.entity.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long>{
	

}
