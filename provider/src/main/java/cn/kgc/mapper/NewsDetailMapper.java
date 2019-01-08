package cn.kgc.mapper;

import cn.kgc.vo.NewsDetail;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface NewsDetailMapper {

    public List<Map<String,Object>> findAll(@Param("title") String title);
}
