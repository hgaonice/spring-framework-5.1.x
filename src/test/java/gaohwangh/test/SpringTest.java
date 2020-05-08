package gaohwangh.test;

import gaohwangh.config.Config;
import gaohwangh.model.GaohWanghModel;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: GH
 * @Date: 2019/12/2 1:11
 * @Version 1.0
 */
public class SpringTest {

	@Test
	public void test() {
			AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();
		context.register(Config.class);
		context.setAllowCircularReferences(false);
		context.refresh();
		GaohWanghModel gaohWanghModel = context.getBean(GaohWanghModel.class);
		System.out.println(gaohWanghModel);

	}
}
