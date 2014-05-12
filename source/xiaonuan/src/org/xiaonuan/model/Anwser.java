package org.xiaonuan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="anwser")
public class Anwser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String anwser;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnwser() {
		return anwser;
	}
	public void setAnwser(String anwser) {
		this.anwser = anwser;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
