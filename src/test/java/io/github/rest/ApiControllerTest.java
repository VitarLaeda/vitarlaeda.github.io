package io.github.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ApiControllerTest {
	@Autowired
	private ApiController controller;

	@Test
	void testGetAllTasks() {
		assertTrue(controller.getAllTasks().size() > 0);
	}

	@Test
	void testGetAllSkills() {
		assertTrue(controller.getAllSkills().size() > 0);
	}

	@Test
	void testGetSummaries() {
		assertTrue(controller.getSummaries().size() > 0);
	}
}