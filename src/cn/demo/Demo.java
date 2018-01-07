package cn.demo;

import org.hibernate.Session;
import org.junit.Test;

import com.entity.Dep;
import com.entity.Emp;
import com.util.HibernateUtil;

public class Demo {
	
	@Test
	public void test1(){
		Dep dep = new Dep(1,"a dep");
		Emp emp = new Emp(1,"a emp","male",dep);
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		session.save(dep);
		session.save(emp);
		session.getTransaction().commit();
		session.close();
	}
}
