package kr.co.dwebss.kococo.service.impl;

import kr.co.dwebss.kococo.dao.AnalysisDetailsMapper;
import kr.co.dwebss.kococo.model.AnalysisDetails;
import kr.co.dwebss.kococo.service.AnalysisDetailsService;
import kr.co.dwebss.kococo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2019/06/27.
 */
@Service
@Transactional
public class AnalysisDetailsServiceImpl extends AbstractService<AnalysisDetails> implements AnalysisDetailsService {
    @Resource
    private AnalysisDetailsMapper analysisDetailsMapper;

}
