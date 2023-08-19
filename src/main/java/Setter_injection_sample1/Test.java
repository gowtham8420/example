package Setter_injection_sample1;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test{
public static void main(String[]args){
	 
    Resource r=new ClassPathResource("sample1.xml");        
	BeanDefinitionRegistry bean=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(bean);
	reader.loadBeanDefinitions(r); 
	 Employee s=(Employee)((DefaultListableBeanFactory)bean).getBean("obj");  
	 s.display(); 
}
}
