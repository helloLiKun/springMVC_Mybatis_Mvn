package com.mvn.cn.mapper.authorization;

import com.mvn.cn.anotation.MyMapper;
import com.mvn.cn.entity.authorization.RolePermission;
import com.mvn.cn.entity.authorization.RolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
@MyMapper
public interface RolePermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ROLE_PERMISSION
     *
     * @mbggenerated Fri Jan 12 10:33:53 CST 2018
     */
    int countByExample(RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ROLE_PERMISSION
     *
     * @mbggenerated Fri Jan 12 10:33:53 CST 2018
     */
    int deleteByExample(RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ROLE_PERMISSION
     *
     * @mbggenerated Fri Jan 12 10:33:53 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ROLE_PERMISSION
     *
     * @mbggenerated Fri Jan 12 10:33:53 CST 2018
     */
    int insert(RolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ROLE_PERMISSION
     *
     * @mbggenerated Fri Jan 12 10:33:53 CST 2018
     */
    int insertSelective(RolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ROLE_PERMISSION
     *
     * @mbggenerated Fri Jan 12 10:33:53 CST 2018
     */
    List<RolePermission> selectByExample(RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ROLE_PERMISSION
     *
     * @mbggenerated Fri Jan 12 10:33:53 CST 2018
     */
    RolePermission selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ROLE_PERMISSION
     *
     * @mbggenerated Fri Jan 12 10:33:53 CST 2018
     */
    int updateByExampleSelective(@Param("record") RolePermission record, @Param("example") RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ROLE_PERMISSION
     *
     * @mbggenerated Fri Jan 12 10:33:53 CST 2018
     */
    int updateByExample(@Param("record") RolePermission record, @Param("example") RolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ROLE_PERMISSION
     *
     * @mbggenerated Fri Jan 12 10:33:53 CST 2018
     */
    int updateByPrimaryKeySelective(RolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ROLE_PERMISSION
     *
     * @mbggenerated Fri Jan 12 10:33:53 CST 2018
     */
    int updateByPrimaryKey(RolePermission record);
}