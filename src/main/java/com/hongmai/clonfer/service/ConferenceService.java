package com.hongmai.clonfer.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hongmai.clonfer.model.domain.CpConferenceRecord;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hongmai.clonfer.model.param.conference.ConferenceParam;
import com.hongmai.clonfer.model.vo.ConferencePageVO;
import com.hongmai.clonfer.model.vo.ConferenceVO;

/**
 * @author JiaweiWang
 * @date 2021/9/4
 * @description
 */
public interface ConferenceService extends IService<CpConferenceRecord> {
    /**
     *
     * @param param
     */
    void createConference(ConferenceParam param);

    /**
     *
     * @param param
     */
    void updateConference(ConferenceParam param);

    /**
     *
     * @param page
     * @return
     */
    IPage<ConferencePageVO> queryConferencePage(Page<CpConferenceRecord> page);

    /**
     *
     * @param conferenceId
     * @return
     */
    ConferenceVO queryConferenceDetail(String conferenceId);

}
