package com.cos.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.cos.domain.SBoardVO;

@Repository
public class SBoardImpl implements SBoardDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "apiserver";

	@Override
	public SBoardVO view(String bid) {

		return session.selectOne(namespace + ".view",bid);
	}

	@Override
	public void uphit(String bid) {
		session.update(namespace + ".uphit",bid);
	}

	
}
