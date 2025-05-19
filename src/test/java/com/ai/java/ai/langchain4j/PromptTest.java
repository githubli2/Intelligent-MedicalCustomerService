package com.ai.java.ai.langchain4j;

import com.ai.java.ai.langchain4j.assistant.MemoryChatAssistant;
import com.ai.java.ai.langchain4j.assistant.SeparateChatAssistant;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PromptTest {

    @Autowired
    private SeparateChatAssistant separateChatAssistant;

    @Test
    public void testSystemMessage() {
        String answer = separateChatAssistant.chat(3, "今天几月几号");
        System.out.println(answer);
    }

    @Autowired
    private MemoryChatAssistant memoryChatAssistant;
    @Test
    public void testUserMessage() {
        String answer = memoryChatAssistant.chat("我是环环");
        System.out.println(answer);
        String answer2 = memoryChatAssistant.chat("我18");
        System.out.println(answer2);
        String answer3 = memoryChatAssistant.chat("我是谁");
        System.out.println(answer3);
    }

    @Test
    public void testV() {
        String answer1 = separateChatAssistant.chat2(11, "我是环环");
        System.out.println(answer1);
        String answer2 = separateChatAssistant.chat2(11, "我是谁");
        System.out.println(answer2);
    }

    @Test
    public void testUserInfo() {
        String answer = separateChatAssistant.chat3(1, "我是谁，我多大了", "翠花", 18);
        System.out.println(answer);
    }
}