package com.slokam.script.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.script.entity.Script;
@Repository
public interface IScriptDAO extends JpaRepository<Script, Long>{

	
}
