package net.javaguides.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;


@Entity
@Table(name = "habits")
public class habit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="habit_name" )
	private String habitName;
	
	public habit() {
		
	}
	
	public habit(String name) {
		super();
		habitName = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String gethabitName() {
		return habitName;
	}
	public void setName(String name) {
		habitName = name;
	}
	
	

}
