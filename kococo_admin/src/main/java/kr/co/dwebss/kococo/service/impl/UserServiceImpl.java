package kr.co.dwebss.kococo.service.impl;

import kr.co.dwebss.kococo.dao.UserMapper;
import kr.co.dwebss.kococo.model.User;
import kr.co.dwebss.kococo.service.UserService;
import kr.co.dwebss.kococo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2019/06/27.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
