package org.xiaonuan.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Repository;
import org.xiaonuan.dao.AnwserDao;
import org.xiaonuan.model.Anwser;

@Repository("anwserDao")
public class AnwserDaoIpml implements AnwserDao{

//	@Resource
//	private HibernateTemplate hibernateTemplate;

	@Override
	public void saveAnwser(/*final*/ Anwser anwser) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("日期"+anwser.getDate()+"  回答是"+anwser.getAnwser());
		Configuration cfg = new Configuration();
		cfg.configure();// 读取配置文件
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory factory = cfg.configure().buildSessionFactory(
				serviceRegistry);
		Session session = factory.openSession();
		session.beginTransaction();
		//存数据
		session.save(anwser);
		session.getTransaction().commit();
/*		hibernateTemplate.save(anwser);
		hibernateTemplate.execute(new HibernateCallback()
		{

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				session.save(anwser);
				return null;
			}}
		);*/
		System.out.print("123");
		
	}

//	public HibernateTemplate getHibernateTemplate() {
//		return hibernateTemplate;
//	}
//
//	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		this.hibernateTemplate = hibernateTemplate;
//	}
//	

}
