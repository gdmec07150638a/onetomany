package com.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="adep")
public class Dep {
	private int id;
	private String name;
	private Set<Emp> emps  = new HashSet<Emp>();
	
	@OneToMany(mappedBy="dep")
	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	public Dep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dep(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Id
	@GeneratedValue(generator="sseq_did")
	@GenericGenerator(name="sseq_did",strategy="native",parameters={@Parameter(value="sseq_dep_id",name="sequence")})
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
}
