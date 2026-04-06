package com.test.dao;

import java.util.List;

import com.test.model.Book;

public class BookDao {
 	
	private jdbcTemplate jdbcTemplate;
	
	public bookDao(DtaSource datasource)
	{
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	private final String insert_sql = "insert into books(b_id,b_name,b_author,b_price)values(?,?,?,?,)";
	
	private final String update_sql ="update books set b_name = ?, b_author = ?,b_author = ?,b_price = ?, ";
	
	private final String delete_sql = "delete from books where b_id = ?";
	
	private final String select_sql = "select * from books";
	
	public boolean saveBooks(Book obj)
	{
		return jdbcTemplate.update(inseet_sql,obj.getB_id(),obj.getB_name(),obj.getB_author(),obj.getB_price() )>0;
	}
	
	public boolean updateBooks(Book obj)
	{
		return jdbcTemplate.update(update_sql,obj.getB_author(),obj.getB_price())
	}
	
	public boolean deleteBook(Book obj)
	{
		return jdbcTemplate.update(delete_sql,obj.getB_id())>0;
	}
	
	public List<Book> listAllBooks()
	{
		return jdbcTemplate.query(select)
	}
	
}

