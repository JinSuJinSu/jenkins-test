package com.poscoict.mesproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poscoict.mesproject.dto.JsonResult;
import com.poscoict.mesproject.service.InstructionHistoryService;
import com.poscoict.mesproject.vo.InstructionHistoryVo;

@RestController
@RequestMapping("/api/instruction/history")
public class InstructionHistoryController {
	
	@Autowired
	private InstructionHistoryService instructionHistoryService;
	

	
	// 게시판 글 전체 보기
	@GetMapping("")
	public ResponseEntity<JsonResult> viewList(){
		List<InstructionHistoryVo> list = instructionHistoryService.getAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(JsonResult.success(list));
	}
}
