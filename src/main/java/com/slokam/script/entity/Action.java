package com.slokam.script.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Action {

	@Id
	@GeneratedValue
	private Long id;
	private String description;
	@ManyToOne()
	@JoinColumn(name="sceneId")
	private Scene scene;
	@OneToOne
	@JoinColumn(name="sceSeqId")
	private SceneOrder sceneOrder;
	
	
}
