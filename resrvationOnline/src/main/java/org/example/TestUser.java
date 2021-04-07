package org.example;

import org.example.DAO.RoleDaoImpl;
import org.example.DAO.UserDaoImpl;
import org.example.Entity.RoleEntity;
import org.example.Entity.UseradminEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author kamal
 *
 */
public class TestUser {




    @Before
    public void setUp() throws Exception {
        UserDaoImpl userDao=new UserDaoImpl();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testaddUser() {
        UserDaoImpl userDao=new UserDaoImpl();
        RoleDaoImpl roleDao=new RoleDaoImpl();
        RoleEntity azert=roleDao.getRoleById(3);
        UseradminEntity user=new UseradminEntity("kamal","chokrane","kamal@gmail.com","kamal123",1234411,azert);


        userDao.addUser(user);
        System.out.print(user.toString());

    }



}
