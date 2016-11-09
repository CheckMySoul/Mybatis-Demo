package com.mm.service;

import java.util.List;
import java.util.Random;

import com.mm.bean.Command;
import com.mm.bean.CommandContent;
import com.mm.bean.Message;
import com.mm.dao.CommandDao;
import com.mm.dao.MessageDao;
import com.mm.util.Iconst;

/**
 * 查询相关的业务功能
 * @author Operations
 *
 */
public class QueryService {
	/**
	 * 列表查询信息
	 * @param command
	 * @param description
	 * @return
	 */
	public List<Message> queryMessageList(String command,String description){
		MessageDao messageDao = new MessageDao();
		return messageDao.queryMessageList(command, description);
	}
	
	/**
	 * 通过指令查询自动回复的内容
	 */
	public String queryByCommand(String command) {
		CommandDao commandDao = new CommandDao();
		List<Command> commandList;
		if(Iconst.HELP_COMMAND.equals(command)){
			commandList = commandDao.queryCommandList(null, null);
			StringBuilder result = new StringBuilder();
			for(int  i=0;i<commandList.size();i++){
				if(i!=0){
					result.append("<br/>");
				}
				result.append("回复["+commandList.get(i).getName()+"]可以查看"+commandList.get(i).getDescription());
			}
			return result.toString();
		}
		commandList = commandDao.queryCommandList(command, null);
		if(commandList.size()>0){
			List<CommandContent> commandContentList = commandList.get(0).getContentList();
			int i = new Random().nextInt(commandContentList.size());
			return commandContentList.get(i).getContent();
		}
		return Iconst.NO_MATCHING_CONTENT;
	}
}
