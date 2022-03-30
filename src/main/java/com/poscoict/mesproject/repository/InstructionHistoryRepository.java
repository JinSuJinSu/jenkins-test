package com.poscoict.mesproject.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.vo.InstructionHistoryVo;
import com.poscoict.mesproject.vo.WorkHistoryVo;

@Service
public class InstructionHistoryRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<InstructionHistoryVo> findAll() {
		List<InstructionHistoryVo> list = sqlSession.selectList("instructionHistory.findAll");
		return list;
	}
	
	

}
