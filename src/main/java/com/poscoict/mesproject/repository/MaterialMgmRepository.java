package com.poscoict.mesproject.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.vo.MaterialMgmVo;
import com.poscoict.mesproject.vo.WorkHistoryVo;

@Service
public class MaterialMgmRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<MaterialMgmVo> findAll() {
		List<MaterialMgmVo> list = sqlSession.selectList("materialMgm.findAll");
		System.out.println(list);
		return list;
	}

}
