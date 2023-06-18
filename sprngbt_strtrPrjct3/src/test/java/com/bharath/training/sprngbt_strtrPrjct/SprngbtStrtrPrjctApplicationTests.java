package com.bharath.training.sprngbt_strtrPrjct;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bharath.training.sprngbt_strtrPrjct.service.ProductService;

@SpringBootTest
class SprngbtStrtrPrjctApplicationTests {
	@Autowired
	ApplicationContext context;

	@Test
	void createService() {
		ProductService bean = context.getBean(ProductService.class);
		ProductDao dao = new ProductDao();
		dao.setId(12);
		dao.setName("avidada");
		bean.setDao(dao);
		System.out.println(bean);
	}

}
