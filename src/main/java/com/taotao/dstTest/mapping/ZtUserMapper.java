package com.taotao.dstTest.mapping;

import com.taotao.dstTest.model.ZtUser;
import com.taotao.dstTest.model.ZtUserExample;
import java.util.List;

public interface ZtUserMapper {
    long countByExample(ZtUserExample example);

    int deleteByExample(ZtUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZtUser record);

    int insertSelective(ZtUser record);

    List<ZtUser> selectByExample(ZtUserExample example);

    ZtUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective( ZtUser record,  ZtUserExample example);

    int updateByExample( ZtUser record, ZtUserExample example);

    int updateByPrimaryKeySelective(ZtUser record);

    int updateByPrimaryKey(ZtUser record);
}