package com.prakash.busi.daoImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.BrandDAO;
import com.prakash.busi.model.LBrand;

public class BrandDAOImpl extends AbstractDao<Long, LBrand>  implements BrandDAO{

	static final Logger logger = LoggerFactory.getLogger(BrandDAOImpl.class);
	@Override
	public LBrand getBrandByID(Long id) {
		logger.info("BrandDAOImpl.getBrandByID(...)");
		LBrand brand = getByKey(id);
		if(brand!=null){
			return brand;
		}
		return null;
	}

	@Override
	public LBrand saveBrand(LBrand brand) {
		logger.info("BrandDAOImpl.saveBrand(...)");
		save(brand);
		return brand;
	}

	@Override
	public LBrand updateBrand(LBrand brand) {
		logger.info("BrandDAOImpl.updateBrand(...)");
		update(brand);
		return brand;
	}

}
