package com.example.BPT.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BPT.domain.HealthRecords;
import com.example.BPT.domain.HealthRecordsRepository;

@RestController
public class HealthRecordsController {

	@Autowired
	private HealthRecordsRepository repository;

	@RequestMapping("/records")
	public Iterable<HealthRecords> getHealthRecords() {

		return repository.findAll();

	}

}
