package kr.co.dwebss.kococo.service.impl;

import kr.co.dwebss.kococo.dao.CodeMapper;
import kr.co.dwebss.kococo.model.Code;
import kr.co.dwebss.kococo.service.CodeService;
import kr.co.dwebss.kococo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2019/06/27.
 */
@Service
@Transactional
public class CodeServiceImpl extends AbstractService<Code> implements CodeService {
    @Resource
    private CodeMapper codeMapper;

}
