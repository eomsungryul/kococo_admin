package kr.co.dwebss.kococo.web;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommonController {

	/**
	 * Header
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/inc/incHeader")
	public String incHeader(
			@RequestParam HashMap<String, String> paramMap,
			HttpServletRequest request,
			HttpSession session,
			ModelMap model)
			throws Exception {

		return "inc/incHeader";
	}


	/**
	 * Left
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/inc/incLeft")
	public String incLeft(
			HttpServletRequest request,
			@RequestParam HashMap<String, String> paramMap,
			HttpSession session,
			ModelMap model)
			throws Exception {


		return "inc/incLeft";
	}

	
	@RequestMapping(value="/")
	public String index2(
			HttpServletRequest request,
			@RequestParam HashMap<String, String> paramMap,
			HttpSession session,
			ModelMap model)
			throws Exception {
		return "login";
	}
	
	@RequestMapping(value="/login")
	public String index(
			HttpServletRequest request,
			@RequestParam HashMap<String, String> paramMap,
			HttpSession session,
			ModelMap model)
			throws Exception {
		return "login";
	}
	
	@RequestMapping(value="/join")
	public String join(
			HttpServletRequest request,
			@RequestParam HashMap<String, String> paramMap,
			HttpSession session,
			ModelMap model)
			throws Exception {
		return "join";
	}
	
	

	

}
