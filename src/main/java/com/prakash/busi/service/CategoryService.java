package com.prakash.busi.service;

import com.prakash.busi.model.LCategory;

public interface CategoryService {
	public LCategory getCategoryByID(Long id);
	public LCategory saveCategory(LCategory category);
	public LCategory updateCategory(LCategory category);
}
