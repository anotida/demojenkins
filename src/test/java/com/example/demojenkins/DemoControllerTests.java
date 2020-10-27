package com.example.demojenkins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(DemoController.class)
public class DemoControllerTests {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testMethod() throws Exception {

        mockMvc.perform(get("/test"))
                .andExpect(status().isOk())
                .andExpect(content().string("TEST"));
    }

}
