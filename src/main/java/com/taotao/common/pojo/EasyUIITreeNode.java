package com.taotao.common.pojo;
/**
 *  返回给EasyUI的TreeNode
 * @author lw
 *
 */
public class EasyUIITreeNode {

	private long id ;
	private String text ;
	private String state ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
