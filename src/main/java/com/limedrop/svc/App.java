package com.limedrop.svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.prometheus.client.exporter.HTTPServer;
import java.io.IOException;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
                
                try {
                    HTTPServer server = new HTTPServer(8081);
                } catch (IOException e) {
                    e.printStackTrace();
                }
	}

}
