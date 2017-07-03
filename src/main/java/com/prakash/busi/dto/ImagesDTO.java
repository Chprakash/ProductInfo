package com.prakash.busi.dto;
// default package
// Generated Jul 1, 2017 3:33:47 PM by Hibernate Tools 3.4.0.CR1



public class ImagesDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long imageid;
	private Long TProductinfoId;
	private String imagename;
	private String imageurl;
	private String color;
	private byte[] specification;
	public Long getImageid() {
		return imageid;
	}
	public void setImageid(Long imageid) {
		this.imageid = imageid;
	}
	public Long getTProductinfoId() {
		return TProductinfoId;
	}
	public void setTProductinfoId(Long tProductinfoId) {
		TProductinfoId = tProductinfoId;
	}
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public byte[] getSpecification() {
		return specification;
	}
	public void setSpecification(byte[] specification) {
		this.specification = specification;
	}

}
