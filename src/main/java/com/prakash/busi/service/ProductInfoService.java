package com.prakash.busi.service;

import com.prakash.busi.dto.ProductinfoDTO;
import com.prakash.busi.model.TProductinfo;

public interface ProductInfoService {
	public  ProductinfoDTO getProductInfoByID(Long id);
	public  TProductinfo saveProductInfo(TProductinfo productinfo);
	public  TProductinfo updateProductInfo(TProductinfo productinfo);
}
