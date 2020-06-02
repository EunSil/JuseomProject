package com.team.juseom.service;

import java.util.List;

import com.team.juseom.domain.Auction;
import com.team.juseom.domain.Book;
import com.team.juseom.domain.Sale;
import com.team.juseom.domain.Share;
import com.team.juseom.domain.User;

public interface JuseomFacade {
	List<Sale> getBookListBySale();
	List<Auction> getBookListByAuction();
	List<Share> getBookListByShare();
	Sale getSale(String bookId);
	Share getShare(String bookId);
	Auction getAuction(String bookId);
	
	User getUser(String userId);
	User getUser(String userId, String password);
	void insertUser(User user);
	void updateUser(User user);
	List<String> getUserIdList();
	
	List<Book> searchBookList(Book book);
	List<Book> getBookListByTradeType(String tradeType);
}