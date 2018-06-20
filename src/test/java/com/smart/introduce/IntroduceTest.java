/**
 * @author:Leo
 * @create 2018/6/20
 * @desc
 */
package com.smart.introduce;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntroduceTest {
    @Test
    public void introduce() {
        String configPath = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        ForumService forumService = (ForumService)ctx.getBean("forumService");

        forumService.removeForum(10);
    }
}
