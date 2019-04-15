package com.group7.edu.service.impl;

import com.group7.edu.entity.SysServiceType;
import com.group7.edu.mapper.SysServiceTypeMapperDTO;
import com.group7.edu.service.SysServiceTypeService;
import com.group7.edu.utils.ResultData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysServiceTypeServiceImpl implements SysServiceTypeService {

    @Resource
    SysServiceTypeMapperDTO sysServiceTypeMapperDTO;

    @Override
    public ResultData selectServiceType() {
        List<SysServiceType> list = sysServiceTypeMapperDTO.selectAll();
        for (SysServiceType sysServiceType : list) {

            System.out.println(sysServiceType.getName());
        }
        return ResultData.isSuccess().put("sysServiceTypes",list);
    }
}
