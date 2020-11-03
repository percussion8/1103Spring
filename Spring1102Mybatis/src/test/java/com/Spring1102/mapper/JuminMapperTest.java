package com.Spring1102.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.Spring1102.domain.JuminVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class JuminMapperTest {
	@Setter(onMethod_=@Autowired)
	private JuminMapper mapper;
	
	@Test
	public void testSelectList() {
		mapper.selectList().forEach(i->log.info(i));
	}
	
	@Test
	public void testInsert() {
		JuminVO jumin = new JuminVO();
		jumin.setPno(10);
		jumin.setPname("Monica");
		jumin.setPersonid("960310-2222334");
		jumin.setPadderess("경기도 용인시");
		jumin.setPtelephone("010-9988-7766");
		jumin.setPfamily(3);
		jumin.setPparent("Mania");
		mapper.insert(jumin);
	}
	
	@Test
	public void testSelectOne() {
		int r = (int)(Math.random()*10);
		log.info("r번 선택");
		JuminVO vo = mapper.selectOne(r);
		System.out.println("번호로 가져온 주민정보: " +vo);
	}
	
	@Test
	public void testDelete() {
		int r = (int)(Math.random()*10);
		mapper.delete(r);
	}
	
	@Test
	public void testUpdate() {
		int r = (int)(Math.random()*10);
		JuminVO jumin = new JuminVO();
		jumin.setPno(r);
		jumin.setPname("박성연");
	}
	
	

}
