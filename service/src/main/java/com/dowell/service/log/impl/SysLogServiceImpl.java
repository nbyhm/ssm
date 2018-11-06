package com.dowell.service.log.impl;

import com.dowell.dal.model.SysLog;
import com.dowell.service.log.SysLogService;
import org.springframework.stereotype.Service;

/**
 * @author nanbo
 * @description 系统日志
 * @create 2018-11-06
 **/
@Service
public class SysLogServiceImpl implements SysLogService {

	@Override
	public int save(SysLog sysLog) {
		return 0;
	}
}
