package com.team.juseom.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.team.juseom.domain.Bidder;

public interface BidderMapper {

	List<Bidder> getBidderListByauctionId(String auctionId);	
	void insertBidder(Bidder bidder);
	int getBidderCount(String auctionId);
	String getBid(int auctionId);
	void removeBidder(String userId, String auctionId);
}
