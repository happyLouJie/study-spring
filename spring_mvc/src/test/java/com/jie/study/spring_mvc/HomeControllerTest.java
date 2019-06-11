package com.jie.study.spring_mvc;

import com.jie.study.spring_mvc.controller.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @ClassName: HomeControllerTest
 * @author: HackerLou
 * @date: 2019/6/11
 * @Description:
 */

public class HomeControllerTest {

    @Test
    public void homePage() throws Exception{
        HomeController homeController = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/home/jie")).
                andExpect(MockMvcResultMatchers.view().name("home"));

    }
}
