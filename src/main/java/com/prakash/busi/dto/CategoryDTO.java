package com.prakash.busi.dto;
// default package
// Generated Jul 1, 2017 3:33:47 PM by Hibernate Tools 3.4.0.CR1



public class CategoryDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long categoryid;
	private Long busitypeid;
	private String categoryname;
	private String description;
	private Long parentid;
	public Long getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}
	public Long getBusitypeid() {
		return busitypeid;
	}
	public void setBusitypeid(Long busitypeid) {
		this.busitypeid = busitypeid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getParentid() {
		return parentid;
	}
	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}

}
