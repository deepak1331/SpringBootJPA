package com.deepakEdu.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

	@Id
	private String alienId;
	private String alienName;
	private String alienTech;

	
	
	public Alien(String alienId, String alienName, String alienTech) {
		super();
		this.alienId = alienId;
		this.alienName = alienName;
		this.alienTech = alienTech;
	}

	public String getAlienTech() {
		return alienTech;
	}

	public void setAlienTech(String alienTech) {
		this.alienTech = alienTech;
	}

	public Alien() {
	}

	public String getAlienId() {
		return alienId;
	}

	public void setAlienId(String alienId) {
		this.alienId = alienId;
	}

	public String getAlienName() {
		return alienName;
	}

	public void setAlienName(String alienName) {
		this.alienName = alienName;
	}

//	@Override
//	public String toString() {
//		return "AlienId : " + alienId + " belongs to " + alienName + " and he/she is master of " + alienTech;
//	}

	
}
