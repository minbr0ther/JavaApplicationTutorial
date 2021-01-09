package se.hs.ac.vo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Work {

	private int id;
    private String date;
	private String content;
	int status; //0: TODO, 1: DOING, 2:DONE
	
	public Work(int id, String c) { //addWork
		this.id = id;
		date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		content = c;
		status = 0;
	}
	
	public Work(int id, String d, String c, int s) { //init
		this.id = id;
		this.date = d;
		this.content = c;
		this.status = s;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return id + "\t" + date + "\t" + content;
	}
}
