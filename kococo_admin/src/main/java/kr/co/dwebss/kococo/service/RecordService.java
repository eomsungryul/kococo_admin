package kr.co.dwebss.kococo.service;
import kr.co.dwebss.kococo.model.Record;

import java.util.List;

import kr.co.dwebss.kococo.core.Service;


/**
 * Created by 엄성렬 on 2019/06/27.
 */
public interface RecordService extends Service<Record> {

	List<Record> selectConsultList(Record vo);
	int selectConsultListCnt(Record vo);

}
