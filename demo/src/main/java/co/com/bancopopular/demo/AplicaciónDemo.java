package co.com.bancopopular.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AplicaciónDemo {

	public static void main(String[] args) {
		ApplicationContext contexto = SpringApplication.run(AplicaciónDemo.class, args);
		HolaMundo holaMundo = (HolaMundo)contexto.getBean("holaMundo");
		holaMundo.decirHola();
	}
}
