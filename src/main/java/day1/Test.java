package day1;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Test {  
    public static void main(String[] args) {  
//    	BeanFactory factory=new XmlBeanFactory(r);
//    	Resource res = new ClassPathResource("same.xml");
    	
    	
        Resource r=new ClassPathResource("NewFile.xml");        
		BeanDefinitionRegistry bean=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(bean);
		reader.loadBeanDefinitions(r);         
        Employeee s=(Employeee)((DefaultListableBeanFactory)bean).getBean("e");  
//        s.Employe(10);
        s.show();  
          
    }  
}  