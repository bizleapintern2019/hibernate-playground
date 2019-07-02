package com.hb.test;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=CoreConfig.class)
@ContextConfiguration(locations= {"classpath:/applicationContext.xml","classpath:/hibernateContext.xml"})
@PropertySource({"classpath:log4j.properties"})
public class ServiceTest {
}
