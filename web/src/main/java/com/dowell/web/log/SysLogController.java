package com.dowell.web.log;

import com.dowell.service.log.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nanbo
 * @description 系统日志
 * @create 2018-11-06
 **/
@RestController
public class SysLogController {

	@Autowired
	SysLogService sysLogService;

}
