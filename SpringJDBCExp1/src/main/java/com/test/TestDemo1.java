package com.test;

import org.springframework.context.ApplicationContext;

import com.test.dao.PlayerDao1;

public class TestDemo1 {

	 public static void main(String[] args) {
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(DBCongig.class);
		 
		 PlayerDao1 dao = ctx.getBean(PlayerDao1.class);
		 
		 List<Playes> list = dao.listAllPLayers();
		 
		 
	 }
}
