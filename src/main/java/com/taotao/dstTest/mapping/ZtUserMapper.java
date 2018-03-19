package com.taotao.dstTest.mapping;

import com.taotao.dstTest.model.ZtUser;
import com.taotao.dstTest.model.ZtUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZtUserMapper {
    long countByExample(ZtUserExample example);

    int deleteByExample(ZtUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZtUser record);

    int insertSelective(ZtUser record);

    List<ZtUser> selectByExample(ZtUserExample example);

    ZtUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZtUser record, @Param("example") ZtUserExample example);

    int updateByExample(@Param("record") ZtUser record, @Param("example") ZtUserExample example);

    int updateByPrimaryKeySelective(ZtUser record);

    int updateByPrimaryKey(ZtUser record);
}