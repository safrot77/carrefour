package com.intellemodules.carrefour.web.beans;


public class Promotion {

	//is it always int or have to be string?
	private String id;
	private String name;
	private String name_ar;
	private String description;
	private String description_ar;
	private String image;
	private String image_ar;
	private String from;
	private String to;
	//this is a boolean right? what are true or false values
	private int isadv;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName_ar() {
		return name_ar;
	}
	public void setName_ar(String name_ar) {
		this.name_ar = name_ar;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription_ar() {
		return description_ar;
	}
	public void setDescription_ar(String description_ar) {
		this.description_ar = description_ar;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getImage_ar() {
		return image_ar;
	}
	public void setImage_ar(String image_ar) {
		this.image_ar = image_ar;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getIsadv() {
		return isadv;
	}
	public void setIsadv(int isadv) {
		this.isadv = isadv;
	}

	public String toString() {
		return String.format("id:%s,name:%s ", id, name);
	}

}
