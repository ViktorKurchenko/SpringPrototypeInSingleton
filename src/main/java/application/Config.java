package application;

import beans.PrototypeBean;
import beans.SingletonBean;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(basePackages = {"beans"})
public class Config {

	@Bean(name = "singletonBean")
	public SingletonBean createSingleton() {
		return new SingletonBean() {

			@Override
			public PrototypeBean getPrototype() {
				return createPrototype();
			}
		};
	}

	@Bean(name = "prototypeBean")
	@Scope("prototype")
	public PrototypeBean createPrototype() {
		return new PrototypeBean();
	}

}
