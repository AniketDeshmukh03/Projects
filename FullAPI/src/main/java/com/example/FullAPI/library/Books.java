package com.example.FullAPI.library;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Books_In_Libraray")

public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Sr_No ; 

	@Column(name = "Name_Of_Book")
	private String name;

	@Column(name = "Author_Name")
	private String authorName;

	@Column(name = "Availabilty_Count")
	private int available;

	@Column(name = "Department_Name")
	private String departmet;

	public Books() {

	}


	public Books(int sr_No, String name, String authorName, int available, String departmet) {

		Sr_No = sr_No;
		this.name = name;
		this.authorName = authorName;
		this.available = available;
		this.departmet = departmet;
	}


	public int getSr_No() {
		return Sr_No;
	}


	public void setSr_No(int sr_No) {
		Sr_No = sr_No;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getAvailable() {
		return available;
	}


	public void setAvailable(int available) {
		this.available = available;
	}


	public String getDepartmet() {
		return departmet;
	}


	public void setDepartmet(String departmet) {
		this.departmet = departmet;
	}



}
