package com.mm.service;

import java.util.List;

import com.mm.bean.Message;
import com.mm.dao.MessageDao;

/**
 * 列表相关的业务功能
 * @author Operations
 *
 */
public class ListService {
	public List<Message> queryMessageList(String command,String description){
		MessageDao messageDao = new MessageDao();
		return messageDao.queryMessageList(command, description);
	}
}
