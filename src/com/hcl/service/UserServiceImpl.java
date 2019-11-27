

package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.Userdao;
import com.hcl.model.User;

/**
 * @author mohdasad.ansari
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    Userdao userdao;
	@Override
	public void register(User user) {
		userdao.register(user);
	}

}
