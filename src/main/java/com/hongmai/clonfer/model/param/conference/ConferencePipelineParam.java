package com.hongmai.clonfer.model.param.conference;

import com.hongmai.clonfer.model.param.SelectTemplateParam;
import com.hongmai.clonfer.model.param.UserPageParam;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author JiaweiWang
 * @date 2021/9/6
 * @description
 */
@Data
public class ConferencePipelineParam {

    @NotNull(message = "流程ID不能为空", groups = {ConferenceParam.CreateConference.class} )
    private Integer id;

    @NotNull(message = "流程名称不能为空", groups = {ConferenceParam.CreateConference.class} )
    private String name;

    @NotNull(message = "流程动作不能为空", groups = {ConferenceParam.CreateConference.class} )
    private SelectTemplateParam action;

    @NotNull(message = "流程所有者不能为空", groups = {ConferenceParam.CreateConference.class} )
    private UserPageParam owner;

    @NotEmpty(message = "流程人群不能为空", groups = {ConferenceParam.CreateConference.class} )
    private List<SelectTemplateParam> appliedPopulation;

}
