package AOP_sample1;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test {
	 public static void main(String[] args) {  
         
	        Resource r=new ClassPathResource("sample1.xml");        
			BeanDefinitionRegistry bean=new DefaultListableBeanFactory();
			XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(bean);
			reader.loadBeanDefinitions(r); 
			 Operation e=(Operation)((DefaultListableBeanFactory)bean).getBean("opBean",Operation.class);  
//			 s.m();
//			   ApplicationContext context = new ClassPathXmlApplicationContext("sample1.xml");  
//		        Operation e = (Operation) context.getBean("opBean");  
		        System.out.println("calling msg...");  
		        e.msg();  
		        System.out.println("calling m...");  
		        e.m();  
		        System.out.println("calling k...");  
		        e.k();
}

}
