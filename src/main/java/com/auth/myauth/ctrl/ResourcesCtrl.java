package com.auth.myauth.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.auth.common.ctrl.BaseCtrl;
import com.auth.common.utils.RV;
import com.auth.myauth.entity.Resources;
import com.auth.myauth.service.ResourcesService;

@Controller
@RequestMapping("resources")
public class ResourcesCtrl extends BaseCtrl<ResourcesService, Resources> {

	@Autowired
	ResourcesService resourcesService;

	@RequestMapping(value = "resourcesTree", method = RequestMethod.GET)
	@ResponseBody
	public RV resourcesTree() {

		return RV.ok(resourcesService.getResourcesTree());
	}
	// 添加资源

	// 删除资源

	// 更新资源

	// 返回所有的资源树

	// 根据ID资源树ID返回该资源下所有资源

}