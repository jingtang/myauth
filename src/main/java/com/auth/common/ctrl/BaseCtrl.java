package com.auth.common.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.auth.common.context.BaseContextHandler;
import com.auth.common.sevice.BaseService;
import com.auth.common.utils.RV;

public abstract class BaseCtrl<T extends BaseService<E>,E> {

	@Autowired
    protected T baseService;
	
	@RequestMapping(value = "save",method = RequestMethod.POST)
    @ResponseBody
    public RV add(@RequestBody E entity){
		baseService.insertSelective(entity);
        return  RV.ok();
    }

    @RequestMapping(value = "get/{id}",method = RequestMethod.GET)
    @ResponseBody
    public RV get(@PathVariable String id){
          
        return RV.ok(baseService.selectById(id));
    }

    @RequestMapping(value = "update/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public RV update(@RequestBody E entity){
    	baseService.updateSelectiveById(entity);
        return RV.ok();
    }
    @RequestMapping(value = "delete/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public RV remove(@PathVariable String id){
        baseService.deleteById(id);
        return RV.ok();
    }
    
    
    @RequestMapping(value = "list",method = RequestMethod.GET)
    @ResponseBody
    public RV list(){
        
        return RV.ok(baseService.selectListAll());
    }
    
    public String getCurrentUserName(){
        return BaseContextHandler.getUsername();
    }

}
