package entity;

import java.util.Date;

public class Test {
	private int id;
	private int id2;
	private String question;
	public Test(String question, String a, String b, String c, String d,
			String e) {
		super();
		this.question = question;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	private String a;
	private String b;
	private String c;
	private String d;
	private String e;
	private String resume;
	private String filing_time;
	private String source;
	private String fname;
	private String sname;
	private String answer;
	private String filing_time2;
	
	public Test(int id, int id2, String a, String b) {
		super();
		this.id = id;
		this.id2 = id2;
		this.a = a;
		this.b = b;
	}
	public int getId2() {
		return id2;
	}
	public void setId2(int id2) {
		this.id2 = id2;
	}
	public Test(int id, String question, String a, String resume,
			String filing_time, String source, String fname, String sname,
			String answer, String filing_time2) {
		super();
		this.id = id;
		this.question = question;
		this.a = a;
		this.resume = resume;
		this.filing_time = filing_time;
		this.source = source;
		this.fname = fname;
		this.sname = sname;
		this.answer = answer;
		this.filing_time2 = filing_time2;
	}
	public String getFiling_time2() {
		return filing_time2;
	}
	public void setFiling_time2(String filing_time2) {
		this.filing_time2 = filing_time2;
	}
	public Test(int id, String question, String a, String b, String c,
			String d, String e, String resume, String filing_time2, String source,
			String fname, String sname, String answer) {
		super();
		this.id = id;
		this.question = question;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.resume = resume;
		this.filing_time = filing_time2;
		this.source = source;
		this.fname = fname;
		this.sname = sname;
		this.answer = answer;
	}
	public String getE() {
		return e;
	}
	public void setE(String e) {
		this.e = e;
	}
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getFiling_time() {
		return filing_time;
	}
	public void setFiling_time(String filing_time) {
		this.filing_time = filing_time;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
}
