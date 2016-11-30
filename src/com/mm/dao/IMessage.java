package com.mm.dao;

import java.util.List;

import com.mm.bean.Message;

/**
 * 与Message配置文件对应的接口
 */
public interface IMessage {
	public List<Message> queryMessageList(Message message);
}
