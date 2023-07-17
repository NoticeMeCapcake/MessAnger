package com.messanger.chat.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController()
@Slf4j
@RequestMapping("/chat")
public class SendMessageController {
    @PostMapping("/send")
    public Map sendMessage(@RequestBody String message) {

        return null;
    }

}
