package com.prakash.busi.dao;

import com.prakash.busi.model.TImages;

public interface ImageDAO {
	public TImages getImageByID(Long id);
	public TImages saveImage(TImages image);
	public TImages updateImage(TImages image);
}
