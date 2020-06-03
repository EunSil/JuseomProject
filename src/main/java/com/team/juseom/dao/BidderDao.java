package com.team.juseom.dao;

import java.util.List;

import com.team.juseom.domain.Bidder;

//��ſ� ������ ������� ����(id�� ������)�� ����.
public interface BidderDao {
	List<Bidder> getBidderListByautionId(String auctionId); //�� ��ſ� ���� ��ü ����ڵ� list�� ������
	void insertBidder(Bidder bidder); //��ſ� ������ ����� ���� insert
}