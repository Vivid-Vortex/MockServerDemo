package com.demo.mockserver.MockServerDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockserver.integration.ClientAndServer.startClientAndServer;

@SpringBootTest
class MockServerDemoApplicationTests {
	private static ClientAndServer mockServer;

	@BeforeAll
	public static void startServer() {
		mockServer = startClientAndServer(1080);
		System.out.println("MockServer Started :"+ mockServer);
	}

	@Test
	void contextLoads() {
	}

	@AfterAll
	public static void stopServer() {
		mockServer.stop();
	}

}
