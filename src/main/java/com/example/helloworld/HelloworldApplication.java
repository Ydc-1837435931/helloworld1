package com.example.helloworld;

		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
//程序的主入口
//本身就是spring的主键
@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		//将springboot应用启动
		SpringApplication.run(HelloworldApplication.class, args);
		System.out.println("hello spring boot");
	}

}
