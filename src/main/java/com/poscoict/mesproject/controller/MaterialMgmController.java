package com.poscoict.mesproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poscoict.mesproject.dto.JsonResult;
import com.poscoict.mesproject.service.MaterialMgmService;
import com.poscoict.mesproject.vo.MaterialMgmVo;
import com.poscoict.mesproject.vo.UserInfoVo;

@RestController
@RequestMapping("/api/material/mgm")
public class MaterialMgmController {
	
	@Autowired
	private MaterialMgmService materialMgmService;
	
	// 게시판 글 전체 보기
	@GetMapping("")
	public ResponseEntity<JsonResult>viewList(){
		List<MaterialMgmVo> list = materialMgmService.getAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(JsonResult.success(list));
	}

}
