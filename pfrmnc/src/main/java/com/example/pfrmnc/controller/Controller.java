package com.example.pfrmnc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pfrmnc.dto.A101RequestDto;
import com.example.pfrmnc.dto.A101ResponseDto;
import com.example.pfrmnc.service.A100Service;

@RestController
public class Controller {
	
	@Autowired
	private A100Service a100Service;
	
	@PostMapping
	@RequestMapping("/v1/a101")
	public A101ResponseDto a101control(@RequestBody A101RequestDto request) {
		
		return a100Service.a101service(request);
	}
}
