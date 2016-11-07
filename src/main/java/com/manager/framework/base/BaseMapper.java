package com.manager.framework.base;

import java.io.Serializable;

/**
 * 
 * <br>创建日期：2016年11月7日
 * <br><b>Copyright 2016 SHITOU All Rights Reserved</b>
 * @author LIUYUHUI
 * @since 1.0
 * @version 1.0
 */
public interface BaseMapper<T, ID extends Serializable> {

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(ID id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);
}
