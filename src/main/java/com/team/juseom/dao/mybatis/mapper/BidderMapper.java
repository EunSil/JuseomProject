package com.team.juseom.dao.mybatis.mapper;

import java.util.List;
import com.team.juseom.domain.Bidder;

public interface BidderMapper {
	//mapper xml���� ������
	List<Bidder> getBidderListByautionId(String auctionId);
	
	//mapper xml���� ������
	void insertBidder(Bidder bidder);
	
}
