package com.example.controller;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import com.example.UserAccReg.UserRegApplication;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserRegApplication.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRegControllerTest {
private MockMvc mockMvc;
	
	@Autowired
    private WebApplicationContext wac;

	@Before
	public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

	}
	@Test
	public void verifyAllUserReg() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/userReg").accept(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$", hasSize(1))).andDo(print());
	}
	
	@Test
	public void verifyUserRegById() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/userReg/1").accept(MediaType.APPLICATION_JSON))
//		.andExpect(jsonPath("$.fname").exists())
//		.andExpect(jsonPath("$.completed").exists())
//		.andExpect(jsonPath("$.id").value(1))
//		.andExpect(jsonPath("$.fname").value("Ram"))
//		.andExpect(jsonPath("$.completed").value(true))
		.andDo(print());
	}
	
	@Test
	public void verifyRemoveUserReg() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.delete("/userReg/1").accept(MediaType.APPLICATION_JSON))
//		.andExpect(jsonPath("$.status").value(200))
//		.andExpect(jsonPath("$.message").value("User has been deleted"))
		.andDo(print());
	}

}
