package com.prueba.cardif.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Employee")
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;  
	private String empName;  
	private String password;  
	private String gender;
	private Date birthDay;
	private Integer depId;
	private Integer impRoleId;
	private Integer ranking;
	private String  tel;
	private String email;
	private String info;
	
	public Employee() {
		super();
	}
	
	public Employee(Integer id, String empName, String password, String gender, Date birthDay, Integer depId,
			Integer impRoleId, Integer ranking, String tel, String email, String info) {
		super();
		this.id = id;
		this.empName = empName;
		this.password = password;
		this.gender = gender;
		this.birthDay = birthDay;
		this.depId = depId;
		this.impRoleId = impRoleId;
		this.ranking = ranking;
		this.tel = tel;
		this.email = email;
		this.info = info;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public Integer getDepId() {
		return depId;
	}
	public void setDepId(Integer depId) {
		this.depId = depId;
	}
	public Integer getImpRoleId() {
		return impRoleId;
	}
	public void setImpRoleId(Integer impRoleId) {
		this.impRoleId = impRoleId;
	}
	public Integer getRanking() {
		return ranking;
	}
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	

}
