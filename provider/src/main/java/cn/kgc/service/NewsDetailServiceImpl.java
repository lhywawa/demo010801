package cn.kgc.service;

import cn.kgc.mapper.NewsDetailMapper;
import cn.kgc.vo.NewsDetail;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class NewsDetailServiceImpl implements NewsDetailService{
    @Resource
    public NewsDetailMapper newsDetailMapper;

    @Override
    public List<Map<String, Object>> findAll(String title) {
        return newsDetailMapper.findAll(title);
    }



}
