package gaohwangh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: GH
 * @Date: 2019/12/3 23:07
 * @Version 1.0
 */
@Service
public class TowService {

	@Autowired
	private OneService oneService;

	public TowService() {
		System.out.println("TowService...");
	}
}
