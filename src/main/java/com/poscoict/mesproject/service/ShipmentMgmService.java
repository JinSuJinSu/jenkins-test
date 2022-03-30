package com.poscoict.mesproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.repository.ShipmentMgmRepository;
import com.poscoict.mesproject.vo.ShipmentMgmVo;
import com.poscoict.mesproject.vo.UserInfoVo;

@Service
public class ShipmentMgmService {
	
	@Autowired
	private ShipmentMgmRepository shipmentMgmRepository;
	
	public List<ShipmentMgmVo> getAll() {
		List<ShipmentMgmVo> list = shipmentMgmRepository.findAll();
		return list;
	}

}
