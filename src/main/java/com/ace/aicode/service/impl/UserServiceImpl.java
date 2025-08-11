package com.ace.aicode.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.ace.aicode.entity.User;
import com.ace.aicode.mapper.UserMapper;
import com.ace.aicode.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户 服务层实现。
 *
 * @author <a href="https://github.com/Ace6688">翘楚</a>
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements UserService{

}
