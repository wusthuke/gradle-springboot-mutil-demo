package org.huke.demo.springboot.sample.controller;

import org.hamcrest.Matchers;
import org.huke.demo.springboot.api.UserService;
import org.huke.demo.springboot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author huke
 * @create 17/7/2017
 *
 * @see <link>https://spring.io/guides/gs/testing-web/</link>
 */
@RunWith(SpringRunner.class)
// @SpringBootTest(classes = DemoBootApplication.class)
@WebMvcTest(UserController.class)
public class UserControllerMockMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void testGetUser() throws Exception {
        User mockUser = new User();
        mockUser.setUserId(100L);
        mockUser.setUsername("wusthuke");
        Mockito.when(userService.getUser(100L)).thenReturn(mockUser);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/user/100"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("wusthuke")));
    }
}
