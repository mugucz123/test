package Test;


import dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class SpringTest {
    @Test
    public void demo() {
        //初始化Spring容器ApplicationContext，加载配置文件
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取testDao实例
        TestDao testDao = (TestDao) application.getBean("testDao");
        testDao.sayHello();
    }
}
