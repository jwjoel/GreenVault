package com.hongmai.clonfer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hongmai.clonfer.model.domain.Company;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/**
 * @author JiaweiWang
 * @date 2021/9/4
 * @description
 */
@Repository
public interface CompanyMapper extends BaseMapper<Company> {
    /**
     * 根据用户id获取公司id
     * @param userId 用户id
     * @return 该用户的公司id集合
     */
    Set<Long> selectIdsByUserId(Long userId);
    /**
     * 根据用户id删除该用户的所有公司
     * @param userId 用户id
     * @return 受影响的行数
     */
    int deleteByUserId(Serializable userId);

    /**
     * 根据用户id批量新增公司
     * @param userId 用户id
     * @param companyIds 公司id集合
     * @return 受影响的行数
     */
    int insertCompanyByUserId(@Param("userId") Long userId, @Param("companyIds") Collection<Long> companyIds);
}
