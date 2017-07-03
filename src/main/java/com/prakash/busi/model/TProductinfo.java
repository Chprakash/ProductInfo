package com.prakash.busi.model;
// default package
// Generated Jul 1, 2017 3:33:47 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * TProductinfo generated by hbm2java
 */
@Entity
@Table(name = "t_productinfo", catalog = "business")
public class TProductinfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long productid;
	private Integer version;
	private TBusinesssrc TBusinesssrc;
	private LBrand LBrand;
	private LCategory LCategory;
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
	private Set<TImages> TImageses = new HashSet<TImages>(0);

	public TProductinfo() {
	}

	public TProductinfo(Long productid) {
		this.productid = productid;
	}

	public TProductinfo(Long productid, TBusinesssrc TBusinesssrc,
			LBrand LBrand, LCategory LCategory, String productname,
			Integer quantity, Integer price, String summery, Integer discount,
			Date expLastSaleDate, Date ceateddate, Date updateddae,
			String createdby, String updatedby, Integer popularity,
			Set<TImages> TImageses) {
		this.productid = productid;
		this.TBusinesssrc = TBusinesssrc;
		this.LBrand = LBrand;
		this.LCategory = LCategory;
		this.productname = productname;
		this.quantity = quantity;
		this.price = price;
		this.summery = summery;
		this.discount = discount;
		this.expLastSaleDate = expLastSaleDate;
		this.ceateddate = ceateddate;
		this.updateddae = updateddae;
		this.createdby = createdby;
		this.updatedby = updatedby;
		this.popularity = popularity;
		this.TImageses = TImageses;
	}

	@Id
	@Column(name = "productid", unique = true, nullable = false)
	public Long getProductid() {
		return this.productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "busisrcid")
	public TBusinesssrc getTBusinesssrc() {
		return this.TBusinesssrc;
	}

	public void setTBusinesssrc(TBusinesssrc TBusinesssrc) {
		this.TBusinesssrc = TBusinesssrc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "brandid")
	public LBrand getLBrand() {
		return this.LBrand;
	}

	public void setLBrand(LBrand LBrand) {
		this.LBrand = LBrand;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category")
	public LCategory getLCategory() {
		return this.LCategory;
	}

	public void setLCategory(LCategory LCategory) {
		this.LCategory = LCategory;
	}

	@Column(name = "productname", length = 50)
	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	@Column(name = "quantity")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "price")
	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Column(name = "summery", length = 65535)
	public String getSummery() {
		return this.summery;
	}

	public void setSummery(String summery) {
		this.summery = summery;
	}

	@Column(name = "discount")
	public Integer getDiscount() {
		return this.discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expLastSaleDate", length = 19)
	public Date getExpLastSaleDate() {
		return this.expLastSaleDate;
	}

	public void setExpLastSaleDate(Date expLastSaleDate) {
		this.expLastSaleDate = expLastSaleDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ceateddate", length = 19)
	public Date getCeateddate() {
		return this.ceateddate;
	}

	public void setCeateddate(Date ceateddate) {
		this.ceateddate = ceateddate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateddae", length = 19)
	public Date getUpdateddae() {
		return this.updateddae;
	}

	public void setUpdateddae(Date updateddae) {
		this.updateddae = updateddae;
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

	@Column(name = "popularity")
	public Integer getPopularity() {
		return this.popularity;
	}

	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TProductinfo")
	public Set<TImages> getTImageses() {
		return this.TImageses;
	}

	public void setTImageses(Set<TImages> TImageses) {
		this.TImageses = TImageses;
	}

}