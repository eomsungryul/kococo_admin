package kr.co.dwebss.kococo.service.impl;

import kr.co.dwebss.kococo.dao.RecordMapper;
import kr.co.dwebss.kococo.model.Record;
import kr.co.dwebss.kococo.service.RecordService;
import kr.co.dwebss.kococo.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;


/**
 * Created by 엄성렬 on 2019/06/27.
 */
@Service
@Transactional
public class RecordServiceImpl extends AbstractService<Record> implements RecordService {
    @Resource
    private RecordMapper recordMapper;

	@Override
	public List<Record> selectConsultList(Record vo) {
		return recordMapper.selectConsultList(vo);
	}

	@Override
	public int selectConsultListCnt(Record vo) {
		return recordMapper.selectConsultListCnt(vo);
	}

}
