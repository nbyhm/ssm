package com.dowell.service.log;

import com.dowell.dal.model.SysLog;

/**
 * @author nanbo
 * @description 系统日志
 * @create 2018-11-06
 **/
public interface SysLogService {

	/**
	 * 保存
	 * @param sysLog
	 * @return
	 */
	int save(SysLog sysLog);
}
