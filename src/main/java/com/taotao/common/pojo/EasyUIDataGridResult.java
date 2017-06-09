package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;
/**
 *  返回给EasyUI的分页POJO
 * @author lw
 *
 */
public class EasyUIDataGridResult {

	private long total ;
	private List<?> rows;
	
	public EasyUIDataGridResult() {
		super();
	}
	public EasyUIDataGridResult(long total, List<?> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	public long gestTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "EasyUIDataGridResult [total=" + total + ", rows=" + rows + "]";
	} 
	
}
