package com.dcx.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dcx.dto.NoticeDto;
import com.dcx.vo.DataGridView;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import com.dcx.domain.Notice;
import com.dcx.mapper.NoticeMapper;
import com.dcx.service.NoticeService;

/**
 * @Author: 董承轩
 */

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public DataGridView listNoticePage(NoticeDto noticeDto) {
        Page<Notice> page = new Page<>(noticeDto.getPageNum(), noticeDto.getPageSize());
        QueryWrapper<Notice> qw = new QueryWrapper<>();
        qw.like(StringUtils.isNotBlank(noticeDto.getNoticeTitle()), Notice.COL_NOTICE_TITLE, noticeDto.getNoticeTitle());
        qw.like(StringUtils.isNotBlank(noticeDto.getCreateBy()), Notice.COL_CREATE_BY, noticeDto.getCreateBy());
        qw.eq(StringUtils.isNotBlank(noticeDto.getNoticeType()), Notice.COL_NOTICE_TYPE, noticeDto.getNoticeType());
        qw.eq(StringUtils.isNotBlank(noticeDto.getStatus()), Notice.COL_STATUS, noticeDto.getStatus());
        qw.orderByDesc(Notice.COL_CREATE_TIME);
        this.noticeMapper.selectPage(page, qw);
        return new DataGridView(page.getTotal(), page.getRecords());
    }

    @Override
    public Notice getOne(Long noticeId) {
        return this.noticeMapper.selectById(noticeId);
    }

    @Override
    public int addNotice(NoticeDto noticeDto) {
        Notice notice = new Notice();
        BeanUtil.copyProperties(noticeDto, notice);
        notice.setCreateTime(DateUtil.date());
        notice.setCreateBy(noticeDto.getSimpleUser().getUserName());
        return this.noticeMapper.insert(notice);
    }

    @Override
    public int updateNotice(NoticeDto noticeDto) {
        Notice notice = new Notice();
        BeanUtil.copyProperties(noticeDto, notice);
        notice.setUpdateBy(noticeDto.getSimpleUser().getUserName());
        return this.noticeMapper.updateById(notice);
    }

    @Override
    public int deleteNoticeByIds(Long[] noticeIds) {
        List<Long> ids = Arrays.asList(noticeIds);
        if (ids.size() > 0) {
            return this.noticeMapper.deleteBatchIds(ids);
        }
        return 0;
    }
}
