package com.marcdev.rental_app;

import com.marcdev.rental_app.service.serviceImplement.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class RentalAppApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	UserService userService;

	@Test
	void contextLoads() throws Exception {
		mockMvc.perform(get("/api/signin")).andExpect(status().isOk());
	}

}
