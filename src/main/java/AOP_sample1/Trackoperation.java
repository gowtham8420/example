package AOP_sample1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

public class Trackoperation {
	@Aspect
	public class TrackOperation{
		@Pointcut("execution(* Operation.*(..))")
		public void k(){}//pointcut name
		
		@Pointcut("execution(* Operation.k*(..))")
		public void ok(){}//pointcut name
		
		@After("k()")//applying pointcut on after advice
		public void myadvice(JoinPoint jp)//it is advice (after advice)
		{
			System.out.println("additional concern");
			//System.out.println("Method Signature: "  + jp.getSignature());
		}
	}

//	@Aspect 
//	
//	public class TrackOperation{  
////	    @Pointcut("execution(public * *(..))")  
////	    public void k(){}//pointcut name  
//	      
//	    @Before("execution(public int m())")//applying pointcut on before advice  
//	    public void myadvice()//it is advice (before advice)  
//	    {  
//	        System.out.println("additional concern");  
//	        //System.out.println("Method Signature: "  + jp.getSignature());  
//	    }  
	}


