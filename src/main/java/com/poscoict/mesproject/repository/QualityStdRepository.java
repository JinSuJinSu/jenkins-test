package com.poscoict.mesproject.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.vo.QualityStdVo;
import com.poscoict.mesproject.vo.WorkHistoryVo;

@Service
public class QualityStdRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<QualityStdVo> findAll() {
		List<QualityStdVo> list = sqlSession.selectList("qualityStd.findAll");
		return list;
	}

	
	

}
