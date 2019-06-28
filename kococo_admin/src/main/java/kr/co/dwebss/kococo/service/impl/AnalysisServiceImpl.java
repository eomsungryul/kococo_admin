package kr.co.dwebss.kococo.service.impl;

import kr.co.dwebss.kococo.dao.AnalysisMapper;
import kr.co.dwebss.kococo.model.Analysis;
import kr.co.dwebss.kococo.service.AnalysisService;
import kr.co.dwebss.kococo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2019/06/27.
 */
@Service
@Transactional
public class AnalysisServiceImpl extends AbstractService<Analysis> implements AnalysisService {
    @Resource
    private AnalysisMapper analysisMapper;

}
