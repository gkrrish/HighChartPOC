package com.abc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.abc.service.GraphService;

@Controller
/**
 * This is very Important :: In your GraphController, make sure the method that maps to the root URL ("/") returns the correct view name ("home"). This method should be annotated with @Controller instead of @RestController because you want to return a view, not a JSON response.
 **/
public class GraphController {

	@Autowired
	private GraphService graphService;

	@GetMapping("/bar-chart")
	@ResponseStatus(HttpStatus.OK)
	public String barGraph(Model model) {
		
		Map<String, Integer> surveyMap = graphService.getGraphDetails();
		model.addAttribute("surveyMap", surveyMap);
		
		return "barGraph";
	}
	
	@GetMapping("/pie-chart")
	public String pieChart(Model model) {
		model.addAttribute("pass", 50);
		model.addAttribute("fail", 50);
		return "pieChart";
	}

	
	
	
	
	 @GetMapping("/")
	  public String showHomePage(Model model) {
	    model.addAttribute("message", "Welcome Understanding of High Charts Graphs!");
	    return "home"; 
	  }

}
