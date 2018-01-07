package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="aemp")
public class Emp {
	private int id;
	private String name;
	private String gender;
	private Dep dep;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int id, String name, String gender, Dep dep) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dep = dep;
	}
	@Id
	@GeneratedValue(generator="sseq_eid")
	@GenericGenerator(name="sseq_eid",strategy="native",parameters={@Parameter(value="sseq_emp_id",name="sequence")})
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	@ManyToOne
	@JoinColumn(name="depid")
	public Dep getDep() {
		return dep;
	}

	public void setDep(Dep dep) {
		this.dep = dep;
	}
}
