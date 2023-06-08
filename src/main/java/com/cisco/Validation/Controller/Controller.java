package com.cisco.Validation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.Validation.Entity.NewStudent;
import com.cisco.Validation.Repo.INewStudent;

@RestController
@RequestMapping("Student")
public class Controller {

	@Autowired
	private INewStudent nstd;
	
	@PostMapping
	public ResponseEntity<NewStudent> studentdataAll(@RequestBody NewStudent std)
	{
		System.out.println(std);
		
		nstd.save(std);
		return ResponseEntity.ok(std);
	}
	
}
