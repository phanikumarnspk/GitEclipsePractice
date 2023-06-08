package com.cisco.Validation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cisco.Validation.Entity.NewStudent;

@Repository
public interface INewStudent extends JpaRepository<NewStudent, Integer> {

	
	
}
