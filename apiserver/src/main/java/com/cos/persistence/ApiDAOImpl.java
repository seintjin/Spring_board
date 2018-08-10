package com.cos.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.cos.domain.ApiVO;

@Repository
public class ApiDAOImpl implements ApiDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "apiserver";
	
	@Override
	public List<ApiVO> list() {
		return session.selectList(namespace+".list");
	}
}
