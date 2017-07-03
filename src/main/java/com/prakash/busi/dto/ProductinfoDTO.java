package com.prakash.busi.dto;
// default package
// Generated Jul 1, 2017 3:33:47 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;


public class ProductinfoDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long productid;
	private Long businesssrcId;
	private Long brandId;
	private Long categoryId;
	private String productname;
	private Integer quantity;
	private Integer price;
	private String summery;
	private Integer discount;
	private Date expLastSaleDate;
	private Date ceateddate;
	private Date updateddae;
	private String createdby;
	private String updatedby;
	private Integer popularity;
	public Long getProductid() {
		return productid;
	}
	public void setProductid(Long productid) {
		this.productid = productid;
	}
	public Long getBusinesssrcId() {
		return businesssrcId;
	}
	public void setBusinesssrcId(Long businesssrcId) {
		this.businesssrcId = businesssrcId;
	}
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getSummery() {
		return summery;
	}
	public void setSummery(String summery) {
		this.summery = summery;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public Date getExpLastSaleDate() {
		return expLastSaleDate;
	}
	public void setExpLastSaleDate(Date expLastSaleDate) {
		this.expLastSaleDate = expLastSaleDate;
	}
	public Date getCeateddate() {
		return ceateddate;
	}
	public void setCeateddate(Date ceateddate) {
		this.ceateddate = ceateddate;
	}
	public Date getUpdateddae() {
		return updateddae;
	}
	public void setUpdateddae(Date updateddae) {
		this.updateddae = updateddae;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public Integer getPopularity() {
		return popularity;
	}
	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}

	
}