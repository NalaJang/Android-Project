package webServerDto;

import java.sql.Timestamp;

public class QnaVo {

	private int num;
	private String id;
	private String email;
	private String subject;
	private String title;
	private String content;
	private Timestamp indate;
	private String result;
	
	
	
	@Override
	public String toString() {
		return "QnaVo [num=" + num + ", id=" + id + ", email=" + email + ", subject=" + subject + ", title=" + title
				+ ", content=" + content + ", indate=" + indate + ", result=" + result + ", getNum()=" + getNum()
				+ ", getId()=" + getId() + ", getEmail()=" + getEmail() + ", getSubject()=" + getSubject()
				+ ", getTitle()=" + getTitle() + ", getContent()=" + getContent() + ", getIndate()=" + getIndate()
				+ ", getResult()=" + getResult() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public QnaVo(int num, String id, String email, String subject, String title, String content, Timestamp indate, String result) {
		super();
		this.num = num;
		this.id = id;
		this.email = email;
		this.subject = subject;
		this.title = title;
		this.content = content;
		this.indate = indate;
		this.result = result;
	}

	public QnaVo() {
	}

	public int getNum() {
		return num;
	}

	public QnaVo setNum(int num) {
		this.num = num;
		return this;
	}

	public String getId() {
		return id;
	}

	public QnaVo setId(String id) {
		this.id = id;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public QnaVo setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getSubject() {
		return subject;
	}

	public QnaVo setSubject(String subject) {
		this.subject = subject;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public QnaVo setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getContent() {
		return content;
	}

	public QnaVo setContent(String content) {
		this.content = content;
		return this;
	}

	public Timestamp getIndate() {
		return indate;
	}

	public QnaVo setIndate(Timestamp indate) {
		this.indate = indate;
		return this;
	}

	public String getResult() {
		return result;
	}

	public QnaVo setResult(String result) {
		this.result = result;
		return this;
	}
	
	
}
