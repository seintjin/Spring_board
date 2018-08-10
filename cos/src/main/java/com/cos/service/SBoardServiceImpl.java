package com.cos.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.domain.SBoardVO;
import com.cos.persistence.SBoardDAO;

@Service
public class SBoardServiceImpl implements SBoardService{
	@Inject
	private SBoardDAO dao;
	
	@Transactional
	@Override
	public SBoardVO contentView(String bid) {
		dao.uphit(bid);
		return dao.view(bid);
	}
}
