package com.zx.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model; 
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * 
1、mockMvc.perform执行一个请求；

2、MockMvcRequestBuilders.get("/user/1")构造一个请求

3、ResultActions.andExpect添加执行完成后的断言

4、ResultActions.andDo添加一个结果处理器，表示要对结果做点什么事情，比如此处使用MockMvcResultHandlers.print()输出整个响应结果信息。

5、ResultActions.andReturn表示执行完成后返回相应的结果。
 * */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:applicationContext-mvc.xml")
//@ContextConfiguration(classes = {TestContext.class, WebAppContext.class})
public class AccountTests {

    @Autowired
    private WebApplicationContext wac;
    
    @Autowired MockHttpServletRequest request;


    private MockMvc mockMvc;
    
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }


   @Test
   public void test1()
   {
	   System.out.println(wac);
	   System.out.println(mockMvc);
	   System.out.println(request);
   }
   
   //@Test
   public void getAccount() throws Exception {
       this.mockMvc.perform(get("/accounts/1").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
           .andExpect(status().isOk())
           .andExpect(content().contentType("application/json"))
           .andExpect(jsonPath("$.name").value("Lee"));
   }
   
   @Test
   public void controllerExceptionHandler() throws Exception {
	   ResultActions ra = this.mockMvc.perform(get("/testMvc.do?name=controllerExceptionHandler")).andExpect(status().isOk());
	   
	   System.out.println(ra);
	   //ra.andDo(MockMvcResultHandlers.print());
    
   }


}