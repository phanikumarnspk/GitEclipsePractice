package com.slokam.script.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.script.dao.ITimeDao;
import com.slokam.script.dto.TimeDto.TimeDto;
import com.slokam.script.entity.Time;
import com.slokam.script.service.ITimeServiec;

@Service
public class TimeServiceImpl implements ITimeServiec
{

	@Autowired
	private ITimeDao timeDao;
	@Override
	public TimeDto save(TimeDto timedto)
	{
		Time time = new Time();
		time.setDescription(timedto.getDescription());
		timeDao.save(time);
		timedto.setId(time.getId());
		
		return timedto;
	}

	
}
