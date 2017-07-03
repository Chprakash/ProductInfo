package com.prakash.busi.service;

import com.prakash.busi.model.TImages;

public interface ImageService {
	public TImages getImageByID(Long id);
	public TImages saveImage(TImages image);
	public TImages updateImage(TImages image);
}
