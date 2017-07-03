package com.prakash.busi.dao;

import com.prakash.busi.model.LBrand;

public interface BrandDAO {
	public LBrand getBrandByID(Long id);
	public LBrand saveBrand(LBrand brand);
	public LBrand updateBrand(LBrand brand);
}
