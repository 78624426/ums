package ums.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Util {
    static SqlSessionFactory factory;
    static ThreadLocal<SqlSession>local=new ThreadLocal<SqlSession>();

    static{
        factory=new SqlSessionFactoryBuilder().build(Util.class.getClassLoader().getResourceAsStream("a.xml"));
    }

    public static SqlSession getSession(){
        SqlSession ss=local.get();
        if(ss==null){
            ss=factory.openSession();
            local.set(ss);
        }
        return ss;
    }

    public static void closeSession(){
        SqlSession ss=local.get();
        local.remove();
        if(ss!=null){
            ss.close();
        }
    }
}
