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
public abstract class AbstractService<T, ID extends Serializable> implements BaseService<T, ID> {

	public abstract BaseMapper<T, ID> getBaseMapper();

	@Override
	public int insertSelective(T record) {
		return getBaseMapper().insertSelective(record);
	}

	@Override
	public T selectByPrimaryKey(ID id) {
		return getBaseMapper().selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(T record) {
		return getBaseMapper().updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(T record) {
		return getBaseMapper().updateByPrimaryKey(record);
	}

	@Override
	public int insert(T record) {
		return getBaseMapper().insert(record);
	}
}
