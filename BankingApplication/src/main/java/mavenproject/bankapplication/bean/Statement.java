package mavenproject.bankapplication.bean;

import java.util.Date;


public class Statement{
private Date date;
private String content;
/**
 * @return the date
 */
public Date getDate() {
	return date;
}
/**
 * @param date the date to set
 */
public void setDate(Date date) {
	this.date = date;
}
/**
 * @return the content
 */
public String getContent() {
	return content;
}
/**
 * @param content the content to set
 */
public void setContent(String content) {
	this.content = content;
}
public Statement(Date date, String content) {
	super();
	this.date = date;
	this.content = content;
}
public Statement() {
	super();
	// TODO Auto-generated constructor stub
}




}