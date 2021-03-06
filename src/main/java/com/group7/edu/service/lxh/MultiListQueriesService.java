package com.group7.edu.service.lxh;

import com.group7.edu.entity.lxh.*;

import java.util.List;

/**
 * @author default
 * @date 2019/4/11
 */
public interface MultiListQueriesService {
    List<MultiListQueries> multiListQueries(MultiListQueries multiListQueries);

    List<SysCourse> courseList(SysCourse course);
    List<SysNews> newsList(SysNews news);
    List<SysIndustryInfo> infoList(SysIndustryInfo info);
    List<SysSubject> subjectList(SysSubject subject);
}
