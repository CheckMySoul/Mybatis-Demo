package com.mm.bean;


public class CommandContent {

	/**
	 * 主键
	 */
	private int id;
	
	/**
	 * 指令内容
	 */
	private String content;
	
	/**
	 * 指令ID
	 */
	private String command_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCommand_id() {
		return command_id;
	}

	public void setCommand_id(String command_id) {
		this.command_id = command_id;
	}
	
	
}
