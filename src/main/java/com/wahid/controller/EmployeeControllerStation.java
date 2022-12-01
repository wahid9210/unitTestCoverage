package com.wahid.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wahid.entity.Employee;
import com.wahid.service.EmpService;

@Controller
public class EmployeeControllerStation {

	@Autowired
	private EmpService empService;

	@GetMapping("/login")
	public String home(Model m) {
		return "index";
	}
	@GetMapping("/home")
	public String homPage()
	{
		return "landing";
	}
	{
		
	}

	@RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	public String loginValidation(@RequestParam("username") String name, @RequestParam("password") String pass,
			Model m) {
		List<String> ls = new ArrayList<>();
		ls.add("Wahid");
		ls.add("Tariq");
		ls.add("Zohaib");
		ls.add("X");
		for (String s : ls) {
			if ((name.equals(s) && pass.length() > 0)) {

				List<Employee> emp = empService.getAllEmployee();
				m.addAttribute("emp", emp);
				return "landing";

			}
		}

		return "error";
	}

	@GetMapping("/addEmp")
	public String addEmployee() {
		return "addEmp";
	}
	@GetMapping("/showEmp")
	public String showEmployee(Model m)
	{
		List<Employee> emp=empService.getAllEmployee();
		System.out.println(emp);
		m.addAttribute("emp",emp);
		
		return "showEmp";
	}

	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e, HttpSession session,Model m) {
		System.out.print(e);
		empService.addEmployee(e);
		session.setAttribute("msg", "The Employee added successfull.....");
		List<Employee> emp = empService.getAllEmployee();
		m.addAttribute("emp", emp);
		return "landing";
	}

}
