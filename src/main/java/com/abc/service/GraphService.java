package com.abc.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class GraphService {

	public Map<String, Integer> getGraphDetails() {
		Map<String, Integer> surveyMap = new LinkedHashMap<>();
		surveyMap.put("Java", 40);
		surveyMap.put("Dev oops", 25);
		surveyMap.put("Python", 20);
		surveyMap.put(".Net", 15);
		return surveyMap;
	}

}
