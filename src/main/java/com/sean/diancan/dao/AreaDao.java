package com.sean.diancan.dao;

import com.sean.diancan.pojo.Corp;
import com.sean.diancan.pojo.CorpArea;
import com.sean.diancan.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AreaDao {
    /**
     * 获取所有公司
     * @return
     */
    public List<Corp> getAllCorp();

    /**
     * 获取公司所有送餐点
     * @param corpNo
     * @return
     */
    public List<CorpArea> getAllCorpArea(Integer corpNo);

    /**
     * 添加公司
     * @param corp
     */
    public void addCorp(Corp corp);

    /**
     * 添加公司送餐点
     * @param corpArea
     */
    public void addCorpArea(CorpArea corpArea);
}
