package com.poc.email;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.poc.email.envio.Mailer;
import com.poc.email.envio.Mensagem;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class EmailSendApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
			EmailSendApplication.class.getPackage().getName()
		);
		Mailer mailer = applicationContext.getBean(Mailer.class);
		mailer.enviar(new Mensagem("Emerson Teste <mersoabreu@gmail.com>", Arrays.asList("Teste Merso <mersosoftware@gmail.com>"), "Envio Email", "Chupa Alesandro!"));
		applicationContext.close();

		System.out.println("Fim");
	}

}
