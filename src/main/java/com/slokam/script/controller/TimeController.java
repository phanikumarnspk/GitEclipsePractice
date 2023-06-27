package com.slokam.script.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.script.dto.TimeDto.TimeDto;
import com.slokam.script.service.impl.TimeServiceImpl;


@RestController
@RequestMapping("Time")
public class TimeController 
{

	private static final Logger LOGGER = LoggerFactory.getLogger(TimeController.class);
	
	@Autowired
	private TimeServiceImpl timesrvcImpl;
	
	
	@PostMapping("/savetimedata")
	public ResponseEntity<TimeDto> savetimedata(@RequestBody TimeDto tdto)
	{
		
		LOGGER.info("entered into the method");
		TimeDto timedto = timesrvcImpl.save(tdto);
		
		LOGGER.info("exitfrom the method");
		
		return ResponseEntity.ok(timedto);
		
	}
}
