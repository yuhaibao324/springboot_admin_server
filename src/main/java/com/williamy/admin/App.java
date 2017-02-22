package com.williamy.admin;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import de.codecentric.boot.admin.config.EnableAdminServer;
@EnableAdminServer
@Controller
@SpringBootApplication
public class App {
	@RequestMapping("/hello")
	@ResponseBody
	String home() {
		return "Hello spring boot server!";
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
		LogCore.RPC.info("app started{}", Arrays.toString(args));
	}
}
