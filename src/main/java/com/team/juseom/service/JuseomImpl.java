package com.team.juseom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team.juseom.dao.BookDao;
import com.team.juseom.domain.Auction;
import com.team.juseom.domain.Book;
import com.team.juseom.domain.Sale;
import com.team.juseom.domain.Share;
import com.team.juseom.domain.User;

@Service
@Transactional
public class JuseomImpl implements JuseomFacade {
	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<Sale> getBookListBySale() {
		return bookDao.getBookListBySale();
	}

	@Override
	public List<Auction> getBookListByAuction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Share> getBookListByShare() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sale getSale(String bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Share getShare(String bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Auction getAuction(String bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getUserIdList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchBookList(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBookListByTradeType(String tradeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBook(Book book) {
		// TODO Auto-generated method stub
		bookDao.insertBook(book);
	}

	@Override
	public void insertSale(Sale sale) {
		bookDao.insertBook(sale.getBook());
		bookDao.insertSale(sale);
	}

	@Override
	public void insertAuction(Auction auction) {
		bookDao.insertBook(auction.getBook());
		bookDao.insertAuction(auction);
	}

	@Override
	public void insertShare(Share share) {
		bookDao.insertBook(share.getBook());
		bookDao.insertShare(share);
	}

}
