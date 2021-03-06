package com.prakash.busi.model;
// default package
// Generated Jul 1, 2017 3:33:47 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TImages generated by hbm2java
 */
@Entity
@Table(name = "t_images", catalog = "business")
public class TImages implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long imageid;
	private TProductinfo TProductinfo;
	private String imagename;
	private String imageurl;
	private String color;
	private byte[] specification;
	private Date createddate;
	private Date updateddate;
	private String createdby;
	private String updatedby;

	public TImages() {
	}

	public TImages(Long imageid) {
		this.imageid = imageid;
	}

	public TImages(Long imageid, TProductinfo TProductinfo, String imagename,
			String imageurl, String color, byte[] specification,
			Date createddate, Date updateddate, String createdby,
			String updatedby) {
		this.imageid = imageid;
		this.TProductinfo = TProductinfo;
		this.imagename = imagename;
		this.imageurl = imageurl;
		this.color = color;
		this.specification = specification;
		this.createddate = createddate;
		this.updateddate = updateddate;
		this.createdby = createdby;
		this.updatedby = updatedby;
	}

	@Id
	@Column(name = "imageid", unique = true, nullable = false)
	public Long getImageid() {
		return this.imageid;
	}

	public void setImageid(Long imageid) {
		this.imageid = imageid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "productid")
	public TProductinfo getTProductinfo() {
		return this.TProductinfo;
	}

	public void setTProductinfo(TProductinfo TProductinfo) {
		this.TProductinfo = TProductinfo;
	}

	@Column(name = "imagename", length = 50)
	public String getImagename() {
		return this.imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	@Column(name = "imageurl", length = 50)
	public String getImageurl() {
		return this.imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	@Column(name = "color", length = 50)
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Column(name = "specification")
	public byte[] getSpecification() {
		return this.specification;
	}

	public void setSpecification(byte[] specification) {
		this.specification = specification;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createddate", length = 19)
	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateddate", length = 19)
	public Date getUpdateddate() {
		return this.updateddate;
	}

	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}

	@Column(name = "createdby", length = 50)
	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@Column(name = "updatedby", length = 50)
	public String getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

}
