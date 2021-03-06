package com.knox.aurora.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.knox.aurora.model.entity.BmsTag;
import com.knox.aurora.model.entity.BmsTopicTag;

import java.util.List;
import java.util.Set;

/**
 * Topic Tag 接口
 *
 * @author Knox 2020/11/7
 */
public interface IBmsTopicTagService extends IService<BmsTopicTag> {

    /**
     * 获取Topic Tag 关联记录
     *
     * @param topicId TopicId
     * @return
     */
    List<BmsTopicTag> selectByTopicId(String topicId);

    /**
     * 获取标签换脸话题ID集合
     *
     * @param id
     * @return
     */
    Set<String> selectTopicIdsByTagId(String id);

    /**
     * 创建中间关系
     *
     * @param id
     * @param tags
     * @return
     */
    void createTopicTag(String id, List<BmsTag> tags);
}
