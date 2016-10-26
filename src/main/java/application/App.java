package application;

import beans.SingletonBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Test Application class
 */
public class App {

	public static void main(String[] args) {
		SingletonBean singleton = new AnnotationConfigApplicationContext(Config.class).getBean(SingletonBean.class);
		for (int i = 0; i < 5; i++) {
			System.out.println(singleton.getPrototype());
		}

	}

}
