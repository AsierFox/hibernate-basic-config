package com.devdream.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Persistent class for hibernate using POJO.
 */
@Entity
@Table(name="pokemons")
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="name", nullable=false, length=80)
	private String name;
	
	@Column(name="power", nullable=false)
	private float power;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPower() {
		return power;
	}
	public void setPower(float power) {
		this.power = power;
	}

}
