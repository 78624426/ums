package ums.service.impl;

import ums.dao.UserDao;
import ums.entity.User;
import ums.service.UserService;
import ums.util.Util;
import ums.vo.UserVo;

public class UserServiceImpl implements UserService {
    UserDao dao;
    public void regist(UserVo vo) {
        dao= Util.getSession().getMapper(UserDao.class);
        User u=new User(vo.getName(),vo.getPass());
        try{
            dao.insert(u);
            Util.getSession().commit();
        }catch(Exception e){
            Util.getSession().rollback();
            e.printStackTrace();
        }finally{
            Util.closeSession();
        }
    }
}
