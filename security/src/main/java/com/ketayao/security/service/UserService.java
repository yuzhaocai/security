/**
 * <pre>
 * Copyright:		Copyright(C) 2011-2012, ketayao.com
 * Filename:		com.ygsoft.security.service.UserService.java
 * Class:			UserService
 * Date:			2012-8-7
 * Author:			<a href="mailto:ketayao@gmail.com">ketayao</a>
 * Version          1.1.0
 * Description:		
 *
 * </pre>
 **/
 
package com.ketayao.security.service;

import java.util.List;

import com.ketayao.security.entity.main.User;
import com.ketayao.util.dwz.Page;

/** 
 * 	
 * @author 	<a href="mailto:ketayao@gmail.com">ketayao</a>
 * Version  1.1.0
 * @since   2012-8-7 下午3:03:59 
 */

public interface UserService extends BaseService<User, Long>{
	
	User get(String username);
	
	List<User> find(Page page, String name);
}
