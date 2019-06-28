package kr.co.dwebss.kococo.web;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.co.dwebss.kococo.cmmn.ScrtyUtil;
import kr.co.dwebss.kococo.core.Result;
import kr.co.dwebss.kococo.core.ResultGenerator;
import kr.co.dwebss.kococo.model.Admin;
import kr.co.dwebss.kococo.service.AdminService;

/**
* Created by 엄성렬 on 2018/07/20.
*/
@RestController
public class LoginController {

   @Resource
   private ScrtyUtil scrtyUtil;
   
   @Resource
   private AdminService adminService;

//   @Value("${adminId}") 
//   String adminId;
//   
//   @Value("${adminPw}") 
//   String adminPw;

   /** 로그인 */
   @RequestMapping("/loginAction") 
   public Result loginAction(
   		HttpServletRequest request
   		,Admin vo
   		) throws Exception {  
	   
  	 	Admin login  = adminService.selectAdmin(vo);
  	 	Map<String, Object> res = new HashMap<>();
  	 	
  	   	if( login == null ){
	       	//실패
	   		res.put("state",false);
	   	}else{ 
	   		// 조회성공
	   		res.put("authId",login.getAdminId());
	   		res.put("state",true);
			HttpSession session = request.getSession();
			session.setAttribute("authId",login.getAdminId());
	   	}

      return ResultGenerator.genSuccessResult(res);
   }

    @RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request, ModelMap model){
    	ModelAndView mav = new ModelAndView("/login");
		HttpSession session = request.getSession();
		session.invalidate();
		return mav;
	}
    
}
