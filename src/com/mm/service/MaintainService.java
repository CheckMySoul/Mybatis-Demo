package com.mm.service;

import java.util.ArrayList;
import java.util.List;

import com.mm.dao.impl.MessageDao;

/**
 * 维护相关的业务功能
 * @author Operations
 *
 */
public class MaintainService {
	
	/**
	 * 单条删除
	 */
	public void deleteOne(String id){
		if(id != null && !"".equals(id.trim())){
			MessageDao messageDao = new MessageDao();
			messageDao.deleteOne(Integer.valueOf(id));
		}
	}
	
	/**
	 * 批量删除
	 */
	public void deleteBatch(String[] ids){
		List<Integer> idList = new ArrayList<Integer>();
		MessageDao messageDao = new MessageDao();
		for(String id:ids){
			idList.add(Integer.valueOf(id));
		}
		messageDao.deleteBatch(idList);
	}   
}
