package org.xiaonuan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.xiaonuan.dao.AnwserDao;
import org.xiaonuan.model.Anwser;
import org.xiaonuan.service.AnwserService;
@Service("anwserService")
public class AnwserServiceImpl implements AnwserService{
	
	@Resource
	private AnwserDao anwserDao;
	@Override
	public void saveAnwser(Anwser anwser) throws Exception {
		// TODO Auto-generated method stub
		anwserDao.saveAnwser(anwser);
		
	}

}
