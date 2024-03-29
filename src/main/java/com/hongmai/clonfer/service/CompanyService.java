package com.hongmai.clonfer.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hongmai.clonfer.model.domain.Company;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/**
 * @author JiaweiWang
 * @date 2021/9/4
 * @description
 */
public interface CompanyService extends IService<Company> {
    /**
     * 根据用户id获取公司id
     * @param userId 用户id
     * @return 该用户的公司id集合
     */
    Set<Long> getIdsByUserId(Long userId);

    /**
     * 根据用户id删除该用户的所有公司
     * @param userId 用户id
     */
    void removeByUserId(Serializable userId);
    /**
     * 根据用户id批量增加公司
     * @param userId 用户id
     * @param companyIds 公司id集合
     */
    void insertCompanyByUserId(Long userId, Collection<Long> companyIds);
}
