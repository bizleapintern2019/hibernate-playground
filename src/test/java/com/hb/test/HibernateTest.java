package com.hb.test;

import com.hb.bizleap.entity.Department;
import com.hb.bizleap.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateTest extends ServiceTest {
    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void hibernateTest() {
        Department department = new Department();
        department.setName("Department 1");

        Employee employee = new Employee();
        employee.setName("Employee 1");

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(department);
        session.save(employee);

        session.getTransaction().commit();
        session.close();
    }
}
