package com.prakash.busi.dao;

import com.prakash.busi.model.LCategory;

public interface CategoryDAO {
	public LCategory getCategoryByID(Long id);
	public LCategory saveCategory(LCategory category);
	public LCategory updateCategory(LCategory category);
}
