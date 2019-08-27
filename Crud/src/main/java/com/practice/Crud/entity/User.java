package com.practice.Crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int userId;
	
	@Column
	private String name;
	
	@Column
	private String state;
	
	@Column
	private String city;

}
