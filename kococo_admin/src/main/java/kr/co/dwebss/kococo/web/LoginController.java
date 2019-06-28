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

/**
* Created by 엄성렬 on 2018/07/20.
*/
@RestController
public class LoginController {

   @Resource
   private ScrtyUtil scrtyUtil;
   

   @Value("${adminId}") 
   String adminId;
   
   @Value("${adminPw}") 
   String adminPw;

   /** 로그인 */
   @RequestMapping("/loginAction") 
   public Result loginAction(
   		HttpServletRequest request
//   		,User vo
   		) throws Exception {  
	   
//  	 	User login  = userService.selectUser(vo);
  	 	Map<String, Object> res = new HashMap<>();
  	 	
  	 	String id = request.getParameter("id");
  	 	String pw = request.getParameter("pw");
  	 	
	   	if( adminId.equals(id)&&ScrtyUtil.LockPassword(adminPw).equals(pw) ){
	   		// 조회성공
	   		res.put("authId",id);
	   		res.put("state",true);
			HttpSession session = request.getSession();
			session.setAttribute("authId",id);
	   	}else{ 
	       	//실패
	   		res.put("state",false);
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
