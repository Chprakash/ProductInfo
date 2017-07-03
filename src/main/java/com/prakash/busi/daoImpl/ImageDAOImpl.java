package com.prakash.busi.daoImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.ImageDAO;
import com.prakash.busi.model.TImages;

public class ImageDAOImpl extends AbstractDao<Long, TImages> implements ImageDAO{

	static final Logger logger = LoggerFactory.getLogger(ImageDAOImpl.class);
	@Override
	public TImages getImageByID(Long id) {
		logger.info("ImageDAOImpl.getBusinessSrcByID(...)");
		TImages image = getByKey(id);
		if(image!=null){
			return image;
		}
		return null;
	}

	@Override
	public TImages saveImage(TImages image) {
		logger.info("ImageDAOImpl.saveBusinessSrc(...)");
		save(image);
		return image;
	}

	@Override
	public TImages updateImage(TImages image) {
		logger.info("ImageDAOImpl.updateImage(...)");
		update(image);
		return image;
	}

}
