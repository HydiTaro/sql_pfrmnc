package com.example.pfrmnc.service;

import org.springframework.stereotype.Service;

import com.example.pfrmnc.dto.A101RequestDto;
import com.example.pfrmnc.dto.A101ResponseDto;

@Service
public class A100Service {
	
	public A101ResponseDto a101service(A101RequestDto request) {
		A101ResponseDto response = new A101ResponseDto(); 
		return response;
	}
}
