package com.rakesh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Image_Data")

@Builder
public class ImageData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	private String type;
	@Lob
	
	private byte[] imageDate;
	
	
	public ImageData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ImageData( int id, String name,  String type, byte[] imageDate) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.imageDate = imageDate;
	}
	 
	public int getId() {
		return id;
	}
	public ImageData setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public ImageData setName(String name) {
		this.name = name;
		return this;
	}
	public String getType() {
		return type;
	}
	public ImageData setType(String type) {
		this.type = type;
		return this;
	}
	public byte[] getImageDate() {
		return imageDate;
	}
	public ImageData setImageDate(byte[] imageDate) {
		this.imageDate = imageDate;
		return this;
	}
	 public ImageData build() {
	        return new ImageData( id,  name,   type,  imageDate);
	    }
	
	
}
