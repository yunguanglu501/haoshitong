package com.wanbang.youyibang.mapper;


import com.wanbang.youyibang.po.BdyUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BdyUserMapper {
    /**
     * @mbggenerated 2020-01-04
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2020-01-04
     */
    int insert(BdyUser record);

    /**
     * @mbggenerated 2020-01-04
     */
    int insertSelective(BdyUser record);

    /**
     * @mbggenerated 2020-01-04
     */
    BdyUser selectByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2020-01-04
     */
    int updateByPrimaryKeySelective(BdyUser record);

    /**
     * @mbggenerated 2020-01-04
     */
    int updateByPrimaryKey(BdyUser record);
    @Select("SELECT\n" +
            "        user_tel\n" +
            "    FROM\n" +
            "        wbcms.`tp_bdy_user`\n" +
            "    WHERE\n" +
            "        id = 2")
    BdyUser selectUserTel();
    @Select("select  * from  wbcms.`tp_bdy_user`")
    List<BdyUser> selectAll();
}