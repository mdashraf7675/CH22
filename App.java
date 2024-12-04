package Exam.Exam.pract;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("configure.xml");
       
       // STUDENT CLASS
       Student a=context.getBean("s1",Student.class);
       Student b=context.getBean("s2",Student.class);
       System.out.println(a);
       System.out.println(b);
  
       System.out.println("---------------------------------------------------------------");
  
       //EMPLOYE CLASS
       System.out.println(context.getBean("e1",Employe.class));
       System.out.println(context.getBean("e2",Employe.class));
       
       System.out.println("---------------------------------------------------------------");
       
       //GAME CLASS
       ApplicationContext con=new AnnotationConfigApplicationContext(Annotate.class);
       Game game=con.getBean(Game.class);
       System.out.println(game);
       
    }
}
