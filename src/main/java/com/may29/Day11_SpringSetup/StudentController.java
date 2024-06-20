package com.may29.Day11_SpringSetup;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("firstTask")
	public String m1() {
		return "Shree Ganesh Traders";
	}
	
	@GetMapping("secondtask")
	ArrayList<String> m2(){
		
	   ArrayList<String> al = new ArrayList<>();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Barshi");
		al.add("Solapur");
		al.add("Nashik");
		al.add("Nagpur");		
		al.add("Aurangabad");		
		al.add("Kolhapur");		
		al.add("Sangli");		
		al.add("Ratnagiri");		
		al.add("Colaba");		
		return al;
	}
	
	
	
	@GetMapping("thirdtask")
	ArrayList<FacSub> m3(){
		
		ArrayList<FacSub> all = new ArrayList<>();
		all.add(new FacSub(1, "Java"));
		all.add(new FacSub(2, "Golang"));
		all.add(new FacSub(3, "Mean"));
		all.add(new FacSub(4, "Python"));
		all.add(new FacSub(5, "Mern"));
		return all;
	}
}
