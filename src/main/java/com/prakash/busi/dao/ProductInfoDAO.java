package com.prakash.busi.dao;

import java.util.List;

import com.prakash.busi.model.TProductinfo;

public interface ProductInfoDAO {
	public  TProductinfo getProductInfoByID(Long id);
	public  List<TProductinfo> getAllProductInfoByBusinessSRCID(Long id);
	public  TProductinfo saveProductInfo(TProductinfo productinfo);
	public  TProductinfo updateProductInfo(TProductinfo productinfo);
}
