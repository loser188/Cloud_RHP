package com.rhp.yygh.order.mapper;

import com.rhp.yygh.model.order.OrderInfo;
import com.rhp.yygh.vo.order.OrderCountQueryVo;
import com.rhp.yygh.vo.order.OrderCountVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper extends BaseMapper<OrderInfo> {

    //查询预约统计数据的方法
    List<OrderCountVo> selectOrderCount(@Param("vo") OrderCountQueryVo orderCountQueryVo);
}
