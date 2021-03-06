package com.knox.aurora.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.knox.aurora.model.entity.BmsActivity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Knox 2020/11/21
 */
@Mapper
@Repository
public interface BmsEventMapper extends BaseMapper<BmsActivity> {
}
