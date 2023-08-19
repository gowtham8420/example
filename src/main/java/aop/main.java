package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(config.class);
		text n=con.getBean(text.class);
		n.run();
	}

}
