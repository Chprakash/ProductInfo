package com.prakash.busi.service;

import com.prakash.busi.model.LBrand;

public interface BrandService {
	public LBrand getBrandByID(Long id);
	public LBrand saveBrand(LBrand brand);
	public LBrand updateBrand(LBrand brand);
}
