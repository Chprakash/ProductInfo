package com.prakash.busi.daoImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.CategoryDAO;
import com.prakash.busi.model.LCategory;

public class CategoryDAOImpl extends AbstractDao<Long, LCategory>  implements CategoryDAO{

	static final Logger logger = LoggerFactory.getLogger(CategoryDAOImpl.class);
	@Override
	public LCategory getCategoryByID(Long id) {
		logger.info("LCategory.getCategoryByID(...)");
		LCategory category = getByKey(id);
		if(category!=null){
			return category;
		}
		return null;
	}

	@Override
	public LCategory saveCategory(LCategory category) {
		logger.info("LCategory.saveCategory(...)");
		save(category);
		return category;
	}

	@Override
	public LCategory updateCategory(LCategory category) {
		logger.info("LCategory.updateCategory(...)");
		update(category);
		return category;
	}

}
