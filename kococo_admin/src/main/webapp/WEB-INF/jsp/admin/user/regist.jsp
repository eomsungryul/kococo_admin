<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<c:set value="${pageContext.request.contextPath}" var="contextPath" />
<c:set value="${ requestScope['javax.servlet.forward.servlet_path'] }" var="requestUri" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
  String contextPath = (String)request.getContextPath();
%>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Dashcode Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=contextPath%>/resources/bootstrap-4.1.1/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<%=contextPath%>/resources/bootstrap-4.1.1/dashboard.css" rel="stylesheet">
    <link href="<%=contextPath%>/resources/bootstrap-4.1.1/parsley.css" rel="stylesheet">
    
</head>
  <body>
  	
	<c:import charEncoding="utf-8" url="/inc/incHeader">
		<c:param name="path" value="${requestUri}" />
	</c:import>

    <div class="container-fluid">
      <div class="row">
        
        <!-- aside start -->
 		<c:import charEncoding="utf-8" url="/inc/incLeft">
 			<c:param name="path" value="${requestUri}" />
 		</c:import>
		<!-- aside end -->	    
		
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4"><div class="chartjs-size-monitor" style="position: absolute; left: 0px; top: 0px; right: 0px; bottom: 0px; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;"><div class="chartjs-size-monitor-expand" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:1000000px;height:1000000px;left:0;top:0"></div></div><div class="chartjs-size-monitor-shrink" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;"><div style="position:absolute;width:200%;height:200%;left:0; top:0"></div></div></div>
         <h2 class="mt-3">회원 정보 등록</h2>
          <div class="row mt-3">
	        <div class="col-md-8 order-md-1">
	        
          	<form:form modelAttribute="vo" id="registFrm" name="registFrm" enctype="multipart/form-data" data-parsley-validate="">
       		<input type="hidden" name="searchCondition" id="searchCondition" value="${ searchVO.searchCondition}" />
       		<input type="hidden" name="searchKeyword" id="searchKeyword" value="${ searchVO.searchKeyword}" />
       		<input type="hidden" name="pageIndex" id="pageIndex" value="${ searchVO.pageIndex }"/>  
      		<c:if test="${flag=='U'}">
	       		<input type="hidden" name="userId" id="userId" value="${ result.userId }"/>
      		</c:if>
				  <div class="form-group row">
				    <label for="userLoginId" class="col-sm-2 col-form-label">사용자ID</label>
				    <div class="col-sm-10">
				      ${result.userLoginId }
				    </div>
				  </div>
				  <div class="form-group row">
				    <label for="userNm" class="col-sm-2 col-form-label">사용자 이름</label>
				    <div class="col-sm-10">
<%-- 				      <input type="text" class="form-control" id="user_nm" name="user_nm" placeholder="" value="${result.user_nm }" required="" maxlength="20"> --%>
				      ${result.userNm }
				    </div>
				  </div>
				  <div class="form-group row">
				    <label for="userPhone" class="col-sm-2 col-form-label">사용자 연락처</label>
				    <div class="col-sm-10">
<%-- 				      <input type="text" class="form-control" id="user_nm" name="user_nm" placeholder="" value="${result.user_nm }" required="" maxlength="20"> --%>
				      ${result.userPhone }
				    </div>
				  </div>
				  <div class="form-group row">
				    <label for="userRoleCd" class="col-sm-2 col-form-label">사용자타입</label>
				    <div class="col-sm-3">
		            	<select class="form-control" id="userRoleCd" name="userRoleCd" data-parsley-required>
		            		<c:forEach var="type" items="${ typeList }" varStatus="status">
					        	<option value="${ type.code}" <c:if test="${result.userRoleCd==type.code }">selected</c:if>>${ type.codeNm}</option>
							</c:forEach>
					    </select>
				    </div>
				  </div>
				  <div class="form-group row">
				    <label for="codeCategory" class="col-sm-2 col-form-label">어린이집명</label>
				    <div class="col-sm-10">
<%-- 				      <input type="text" class="form-control" id="centerNm" name="centerNm" placeholder="" value="${result.centerNm }" required="" maxlength="128"> --%>
				    	${result.centerNm }
				    </div>
				  </div>
				  <div class="form-group row">
				    <label for="codeValue" class="col-sm-2 col-form-label">어린이집주소</label>
				    <div class="col-sm-10">
<%-- 				      <input type="text" class="form-control" id="centerAddr" name="centerAddr" placeholder="" value="${result.centerAddr }" required="" maxlength="128"> --%>
				    	${result.centerAddr }
				    </div>
				  </div>
				  <div class="form-group row">
				    <label for="codeDesc" class="col-sm-2 col-form-label">어린이집전화번호</label>
				    <div class="col-sm-10">
<%-- 				 	   <textarea class="form-control" id="centerPhone" name="centerPhone" rows="3" data-parsley-length="[0, 2000]">${result.centerPhone }</textarea> --%>
				   			${result.centerPhone }
				    </div>
				  </div>
				  
				  
				  <div class="form-group row">
				    <label for="confirmYn" class="col-sm-2 col-form-label">승인여부 </label>
				    <div class="col-sm-10">
					  <input class="" type="radio" name="confirmYn" id="confirmYn_Y" value="Y" <c:if test="${result.confirmYn=='Y' }">checked</c:if> data-parsley-required>
					  <label class="" for="confirmYn_Y">Y</label>
					  <input class="" type="radio" name="confirmYn" id="confirmYn_N" value="N" <c:if test="${result.confirmYn=='N' }">checked</c:if>>
					  <label class="" for="confirmYn_N">N</label>
				    </div>
				  </div>
				  <div class="float-right">
				    <div>
              		<c:if test="${flag=='U'}">
              		
			        	<button type="submit" class="btn btn-primary" onclick="fnUpdate(); return false;">수정</button>
			        	<button type="submit" class="btn btn-primary" onclick="fnDelete(); return false;">삭제</button>
              		</c:if>
              		<c:if test="${flag=='I'}">
			        	<button type="submit" class="btn btn-primary" onclick="fnInsert();">등록</button>
              		</c:if>
				      
				    <button type="submit" class="btn btn-secondary"  onclick="fnLinkPage('${ param.pageIndex }'); return false;">목록</button>
				    </div>
				  </div>
				</form:form>

	        </div>
	      </div>
        </main>
      </div>
    </div>
	
    <script src="<%=contextPath%>/resources/js/jquery-3.1.0.js"></script>
    <script src="<%=contextPath%>/resources/js/jquery.twbsPagination.min.js"></script>
    <script src="<%=contextPath%>/resources/js/bootstrap-4.1.1/js/bootstrap.min.js"></script>
    <script src="<%=contextPath%>/resources/js/Parsley.js-2.8.1/parsley.js"></script>
    <script src="<%=contextPath%>/resources/js/ESR23Common_debug.js"></script>
    
    <script type="text/javascript">
	var contextPath = "${ pageContext.request.contextPath }";
	
	/**
	 *  게시판 리스트 페이지 이동
	 */
	function fnLinkPage(pageNo){
		document.registFrm.pageIndex.value = pageNo;
		document.registFrm.action = contextPath + "/admin/user/list";
		document.registFrm.submit();
	}
	
	/**
	 *  회원 정보 등록 
	 */
	function fnInsert(){
		
		if(!confirm("회원 정보를 등록하시겠습니까?")) return;
		$('#registFrm').parsley().on('field:validated', function() {
		})
		.on('form:submit', function() {
			document.registFrm.action = contextPath + "/admin/user/insert";
		});
		
	}
	
	/**
	 *  회원 정보 수정 
	 */
	function fnUpdate(){
		
		if(!confirm("회원 정보를 수정하시겠습니까?")) return;
// 		$('#registFrm').parsley().on('field:validated', function() {
// 			debugger;
// 		})
// 		.on('form:submit', function(){
// 			debugger;
// 			document.registFrm.action = contextPath + "/admin/user/update";
// 		});
		if($('#registFrm').parsley().validate()){
			document.registFrm.action = contextPath + "/admin/user/update";
			document.registFrm.submit();
		}
		
	}
	
	/**
	 *  게시판 삭제
	 */
	function fnDelete(){
		if(!confirm("회원 정보를 삭제하시겠습니까?")) return;
		document.registFrm.action = contextPath + "/admin/user/delete";
		document.registFrm.submit();
	}
	//]]>
	</script>
	
</body>

</html>
