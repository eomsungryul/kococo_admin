package kr.co.dwebss.kococo.web;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dwebss.kococo.model.Record;
import kr.co.dwebss.kococo.service.RecordService;

/**
* Created by 엄성렬 on 2019/06/27.
*/
@RestController
public class ConsultController {
	
    @Resource
    private RecordService recordService;


	/**
	 * 상담 관리 목록
	 *
	 * @param Class vo
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping("/admin/consult/list")
	public ModelAndView list(@ModelAttribute("record") Record vo
			) throws Exception {
		
    	vo.setFirstIndex((vo.getPageIndex() - 1 ) * vo.getPageUnit());
		List<Record> resultList = recordService.selectConsultList(vo);
		int totalCnt = recordService.selectConsultListCnt(vo);
		
		vo.setTotalRecordCount(totalCnt);
		vo.setTotalPage();
		
		ModelAndView mav = new ModelAndView("admin/consult/list");
		mav.addObject("resultList", resultList);
		mav.addObject("totalCnt", totalCnt);
		mav.addObject("pni", vo);
		return mav;
	}
	
	

    /**
	 * 상담 관리 글쓰기
	 *
	 * @param ModelMap model
	 * @return String
	 * @throws Exception
	 */
    @RequestMapping("/admin/consult/detail")
	public ModelAndView regist(
			HttpServletRequest request,
			@ModelAttribute("record") Record vo
			) throws Exception {
		ModelAndView mav = new ModelAndView("admin/consult/regist");

		Record result = recordService.findById(vo.getRecordId());

		//유저 아이디와 불러온 날짜 
		List<Record> resultList = recordService.selectUserConsultList(result);
		
		mav.addObject("result", result);
		mav.addObject("resultList", resultList);
		mav.addObject("searchVO", vo);
		return mav;
	}
    
	/**
	 * 상담 등록
	 *
	 * @param HttpServletRequest request
	 * @param Map<String, Object> codeMap
	 * @param ModelMap model
	 * @return String
	 * @throws Exception
	 */
//	@RequestMapping(value = "/admin/consult/insert")
//	public ModelAndView insert(
//			@ModelAttribute("record") Record vo,
//			ModelMap model) throws Exception {
//		ModelAndView mav = new ModelAndView("forward:/admin/consult/list");
//		recordService.save(vo);
//
//		return mav;
//	}
	
	/**
	 * 상담 수정
	 *
	 * @param HttpServletRequest request
	 * @param Map<String, Object> codeMap
	 * @param ModelMap model
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value = "/admin/consult/update")
	public ModelAndView update(
			@ModelAttribute("record") Record vo
			) throws Exception {

		ModelAndView mav = new ModelAndView("forward:/admin/consult/list");
		recordService.update(vo);
		
		return mav;
	}

	/**
	 * 상담 삭제
	 *
	 * @param HttpServletRequest request
	 * @param Class vo
	 * @param ModelMap model
	 * @return String
	 * @throws Exception
	 */
//	@RequestMapping(value = "/admin/consult/delete")
//	public ModelAndView delete(
//			@ModelAttribute("record") Record vo,
//			ModelMap model) throws Exception {
//	  ModelAndView mav = new ModelAndView("forward:/admin/consult/list");
//      recordService.deleteById(vo.getRecordId());
//      
//	  return mav;
//	}
}
