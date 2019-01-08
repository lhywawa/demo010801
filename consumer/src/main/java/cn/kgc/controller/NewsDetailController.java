package cn.kgc.controller;

import cn.kgc.service.NewsDetailService;
import cn.kgc.vo.NewsDetail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class NewsDetailController {
    @Resource
    NewsDetailService newsDetailService;
    @RequestMapping("findAll.do")
    public List<Map<String,Object>> findAll(@RequestParam(defaultValue = "")String title){
        return newsDetailService.findAll(title);
    }
}
