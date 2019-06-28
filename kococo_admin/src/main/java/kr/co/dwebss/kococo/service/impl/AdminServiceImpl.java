package kr.co.dwebss.kococo.service.impl;

import kr.co.dwebss.kococo.dao.AdminMapper;
import kr.co.dwebss.kococo.model.Admin;
import kr.co.dwebss.kococo.service.AdminService;
import kr.co.dwebss.kococo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2019/06/27.
 */
@Service
@Transactional
public class AdminServiceImpl extends AbstractService<Admin> implements AdminService {
    @Resource
    private AdminMapper adminMapper;

}
