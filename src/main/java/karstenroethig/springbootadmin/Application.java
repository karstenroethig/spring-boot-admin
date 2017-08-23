package karstenroethig.springbootadmin;

import de.codecentric.boot.admin.config.EnableAdminServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAdminServer
@EnableAutoConfiguration
public class Application
{
	public static void main( String[] args )
	{
		SpringApplication.run( Application.class, args );
	}
}
