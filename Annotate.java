package Exam.Exam.pract;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Annotate 
{
	@Bean
	public Game G1()
	{
		Game g=new Game("ashraf","sreenu","jawharlal nehru stadium","5000");
		return g;
	}


}
