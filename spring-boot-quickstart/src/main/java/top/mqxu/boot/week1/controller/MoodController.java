package top.mqxu.boot.week1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @description: 心情控制器
 * @author: qzq
 **/
@RestController
public class MoodController {
    @Value("${server.my.mood.today}")
    private String today;

    @Value("${server.my.mood.content}")
    private String content;

    @Value("${server.my.mood.author}")
    private String author;

    @GetMapping("/mood")
    public String getmood() {
        return "今天是" + today + "，心情是" + content + "，作者是" + author;
    }
}
