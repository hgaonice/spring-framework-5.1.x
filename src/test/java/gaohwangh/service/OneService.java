package gaohwangh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: GH
 * @Date: 2019/12/3 23:07
 * @Version 1.0
 */
@Service
public class OneService {

	@Autowired
	private TowService towService;

	public OneService() {
		System.out.println("OneService...");
	}
}
