package com.bharath.training.sprngbt_strtrPrjct.service;

import org.springframework.stereotype.Component;

import com.bharath.training.sprngbt_strtrPrjct.ProductDao;

@Component
public class ProductService {
	private ProductDao dao;

	public ProductDao getDao() {
		return dao;
	}

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "ProductService [dao=" + dao + "]";
	}
	

}
