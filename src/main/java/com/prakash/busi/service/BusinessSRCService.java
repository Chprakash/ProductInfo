package com.prakash.busi.service;

import com.prakash.busi.model.TBusinesssrc;

public interface BusinessSRCService {
	public  TBusinesssrc getBusinessSrcByID(Long id);
	public  TBusinesssrc saveBusinessSrc(TBusinesssrc businesssrc);
	public  TBusinesssrc updateBusinessSrc(TBusinesssrc businesssrc);
}
