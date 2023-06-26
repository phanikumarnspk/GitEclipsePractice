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
public class Dialogue {

	@Id
	@GeneratedValue
	private Long dialogue;
	private String content;
	@ManyToOne
	@JoinColumn(name="scchId")
	private ScriptCharector scriptCharector;
	@ManyToOne
	@JoinColumn(name="sceId")
	private Scene scene;
	private String parantical;
	@OneToOne
	@JoinColumn(name="sceSeqId") 
	private SceneOrder sceneOrder;
	
	
	
	
}
