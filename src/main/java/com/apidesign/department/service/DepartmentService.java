package com.apidesign.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apidesign.department.entity.Department;
import com.apidesign.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	//private static final Logger log = LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Calling saveDepartment service method.");
		return departmentRepository.save(department);
	}

	public List<Department> departmentList() {
		log.info("Calling departmentList service method.");
		return departmentRepository.findAll();
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Calling findDepartmentById service method.");
		return departmentRepository.findByDepartmentId(departmentId);
	}
	
}