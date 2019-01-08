package cn.kgc.service;

import cn.kgc.vo.NewsDetail;

import java.util.List;
import java.util.Map;

public interface NewsDetailService  {

    public List<Map<String,Object>> findAll(String title);
}
