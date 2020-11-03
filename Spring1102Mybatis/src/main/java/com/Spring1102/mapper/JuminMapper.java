package com.Spring1102.mapper;

import java.util.List;

import com.Spring1102.domain.JuminVO;


public interface JuminMapper {
	public List<JuminVO> selectList();
	
	public int insert (JuminVO jumin);
	
	public JuminVO selectOne(int no);
	
	public int delete (int no);
	
	public int update(JuminVO jumin);

}
