package com.prakash.busi.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.prakash.busi.dao.AbstractDao;
import com.prakash.busi.dao.ProductInfoDAO;
import com.prakash.busi.model.TProductinfo;

public class ProductInfoDAOImpl extends AbstractDao<Long, TProductinfo>  implements ProductInfoDAO{

	static final Logger logger = LoggerFactory.getLogger(ProductInfoDAOImpl.class);
	@Override
	public TProductinfo getProductInfoByID(Long id) {
		logger.info("ProductInfoDAOImpl.getProductInfoByID(...)");
		TProductinfo businessSRC = getByKey(id);
		if(businessSRC!=null){
			return businessSRC;
		}
		return null;
	}

	@Override
	public TProductinfo saveProductInfo(TProductinfo productinfo) {
		logger.info("ProductInfoDAOImpl.saveProductInfo(...)");
		save(productinfo);
		return productinfo;
	}

	@Override
	public TProductinfo updateProductInfo(TProductinfo productinfo) {
		logger.info("ProductInfoDAOImpl.saveProductInfo(...)");
		update(productinfo);
		return productinfo;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TProductinfo> getAllProductInfoByBusinessSRCID(Long id) {
		logger.info("ProductInfoDAOImpl.getAllProductInfoByBusinessSRCID(...)");
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.add(Restrictions.eq("TBusinesssrc.busiSrcId", id));
		List<TProductinfo> productinfoList = (List<TProductinfo>) criteria.list();
		return productinfoList;
	}

}
