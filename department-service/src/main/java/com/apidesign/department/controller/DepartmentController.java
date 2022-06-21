package com.apidesign.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apidesign.department.entity.Department;
import com.apidesign.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	// private static final Logger log =
	// LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Calling saveDepartment API Endpoint.");
		return departmentService.saveDepartment(department);
	}

	@GetMapping("/list")
	public List<Department> departmentList(Long departmentId) {
		log.info("Calling departmentList API Endpoint.");
		return departmentService.departmentList();
	}

	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("Calling findDepartmentById service method.");
		return departmentService.findDepartmentById(departmentId);
	}
}