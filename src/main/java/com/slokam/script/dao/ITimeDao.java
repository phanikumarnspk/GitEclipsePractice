package com.slokam.script.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slokam.script.entity.Time;

public interface ITimeDao extends JpaRepository<Time, Integer> 
{

}
