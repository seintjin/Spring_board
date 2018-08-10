package com.cos.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cos.domain.ApiVO;
import com.cos.persistence.ApiDAO;

@Service
public class ApiServiceImpl implements ApiService{
	
	@Inject
	private ApiDAO dao;
	
	@Override
	public List<ApiVO> list() {
		return dao.list();
	}
}
