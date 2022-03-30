package com.poscoict.mesproject.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.vo.ShipmentMgmVo;
import com.poscoict.mesproject.vo.UserInfoVo;

@Service
public class ShipmentMgmRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<ShipmentMgmVo> findAll() {
		List<ShipmentMgmVo> list = sqlSession.selectList("shipmentMgm.findAll");
		return list;
	}

}
