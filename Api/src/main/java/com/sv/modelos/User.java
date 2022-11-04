package com.sv.modelos;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="user" , catalog="usuarios", schema="")
public class User {

	@Id
	@Column
	private Integer idStudent;
	@Column 
	private String lastName;
	@Column 
	private String name;
	@Column 
	private Date birthday;
	@Column
	private String phone;
    @OneToMany(mappedBy = "matters")
    @JsonIgnore
    private List<Matter> matters;
    
    public User() {
    	matters = new ArrayList<>();
    }
    
    public User(Integer idStudent, String lastName, String name, Date birthday, String phone) {
    	this();
    	this.idStudent=idStudent;
   		this.lastName=lastName;
   		this.name=name;
   		this.birthday=birthday;
   		this.phone=phone;
    }

	public Integer getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Matter> getMatters() {
		return matters;
	}

	public void setMatters(List<Matter> matters) {
		this.matters = matters;
	}
	
	public void addMatter( Matter matter) {
		matters.add(matter);
	}
	
	
}
