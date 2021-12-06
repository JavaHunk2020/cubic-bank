package com.rab3tech.vo;

public class CreditCardDTO {
	private int id;
	private String name;
	private String type;
	private String code;
	private String imageUri;
	private String description;
	
	
	public CreditCardDTO() {
		
	}

	
	public CreditCardDTO(int id, String name,String type, String code, String imageUri, String description) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.code = code;
		this.imageUri = imageUri;
		this.description = description;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getImageUri() {
		return imageUri;
	}


	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
}