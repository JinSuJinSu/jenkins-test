package com.poscoict.mesproject.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.vo.UserInfoVo;
import com.poscoict.mesproject.vo.WorkHistoryVo;

@Service
public class WorkHistoryRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<WorkHistoryVo> findAll() {
		List<WorkHistoryVo> list = sqlSession.selectList("workHistory.findAll");
		return list;
	}

}
