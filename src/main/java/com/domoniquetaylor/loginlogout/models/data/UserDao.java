package com.domoniquetaylor.loginlogout.models.data;

import com.domoniquetaylor.loginlogout.models.User;

@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Integer>{

}
