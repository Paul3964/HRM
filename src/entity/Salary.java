package entity;

import java.util.Date;

public class Salary {
private int number;
private String post;
private float count;
private String markes;
private String registrant;
private String time;
private float standard;
private float travel;
private float message;
private float drift;
private float common;
private float lunch;
private float traffic;
private float car;
private String states;
private String review;
public Salary() {
	super();
}
public Salary(int number,String post,String markes,String registrant,String time){
	this.number = number;
	this.post = post;
	this.markes = markes;
	this.registrant = registrant;
	this.time = time;
}
public Salary(int number,String post,String markes,String registrant){
	this.number = number;
	this.post = post;
	this.markes = markes;
	this.registrant = registrant;
}
public Salary(int number, String post, float count, String markes, String registrant, String time,
		float standard, float travel, float message, float drift, float common, float lunch, float traffic, float car,
		String states,String review) {
	super();
	this.number = number;
	this.post = post;
	this.count = count;
	this.markes = markes;
	this.registrant = registrant;
	this.time = time;
	this.standard = standard;
	this.travel = travel;
	this.message = message;
	this.drift = drift;
	this.common = common;
	this.lunch = lunch;
	this.traffic = traffic;
	this.car = car;
	this.states = states;
	this.review = review;
}
public Salary( int number,String post, float count, String markes, String registrant,String time,
		float standard, float travel, float message, float drift, float common, float lunch, float traffic, float car) {
	super();
	this.number = number;
	this.post = post;
	this.count = count;
	this.markes = markes;
	this.registrant = registrant;
	this.time = time;

	this.standard = standard;
	this.travel = travel;
	this.message = message;
	this.drift = drift;
	this.common = common;
	this.lunch = lunch;
	this.traffic = traffic;
	this.car = car;
}

public String getReview() {
	return review;
}
public void setReview(String review) {
	this.review = review;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getPost() {
	return post;
}
public void setPost(String post) {
	this.post = post;
}
public float getCount() {
	return count;
}
public void setCount(float count) {
	this.count = count;
}
public String getMarkes() {
	return markes;
}
public void setMarkes(String markes) {
	this.markes = markes;
}
public String getRegistrant() {
	return registrant;
}
public void setRegistrant(String registrant) {
	this.registrant = registrant;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}

public float getStandard() {
	return standard;
}
public void setStandard(float standard) {
	this.standard = standard;
}
public float getTravel() {
	return travel;
}
public void setTravel(float travel) {
	this.travel = travel;
}
public float getMessage() {
	return message;
}
public void setMessage(float message) {
	this.message = message;
}
public float getDrift() {
	return drift;
}
public void setDrift(float drift) {
	this.drift = drift;
}
public float getCommon() {
	return common;
}
public void setCommon(float common) {
	this.common = common;
}
public float getLunch() {
	return lunch;
}
public void setLunch(float lunch) {
	this.lunch = lunch;
}
public float getTraffic() {
	return traffic;
}
public void setTraffic(float traffic) {
	this.traffic = traffic;
}
public float getCar() {
	return car;
}
public void setCar(float car) {
	this.car = car;
}
public String getStates() {
	return states;
}
public void setStates(String states) {
	this.states = states;
}

}

