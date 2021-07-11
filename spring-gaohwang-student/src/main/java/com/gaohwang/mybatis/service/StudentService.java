package com.gaohwang.mybatis.service;

import com.gaohwang.mybatis.dao.StudentDao;
import com.gaohwang.mybatis.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: gaoh
 * @Date: 2021/3/28 22:57
 * @Version: 1.0
 */
@Component
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	public List<Map<String, Object>> list() {
		return studentDao.list();
	}


	public int insert(StudentModel student) {
		return studentDao.insert(student);
	}

	public int delete(Integer id) {
		return studentDao.delete(id);
	}
}
