package kr.co.dwebss.kococo.dao;

import java.util.List;

import kr.co.dwebss.kococo.core.Mapper;
import kr.co.dwebss.kococo.model.Record;

public interface RecordMapper extends Mapper<Record> {

	List<Record> selectConsultList(Record vo);

	int selectConsultListCnt(Record vo);
	
}