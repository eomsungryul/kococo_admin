<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<c:set value="${pageContext.request.contextPath}" var="contextPath" />
<c:set value="${ requestScope['javax.servlet.forward.servlet_path'] }" var="requestUri" />
<head>
<%
  String contextPath = (String)request.getContextPath();
%>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>상담 관리</title>

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
         <h2 class="mt-3">상담 등록</h2>
          <div class="row mt-3">
	        <div class="col-md-8 order-md-1">
	        
          	<form:form modelAttribute="record" id="registFrm" name="registFrm"  data-toggle="validator">
       		<input type="hidden" name="searchCondition" id="searchCondition" value="${ searchVO.searchCondition}" />
       		<input type="hidden" name="searchKeyword" id="searchKeyword" value="${ searchVO.searchKeyword}" />
       		<input type="hidden" name="pageIndex" id="pageIndex" value="${ searchVO.pageIndex }"/>  
       		<input type="hidden" name="recordId" id="recordId" value="${ result.recordId }"/>
				  <div class="form-group row">
				    <label for="codeCategory" class="col-sm-2 col-form-label">상담명</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control" id="recordNm" name="recordNm" disabled="disabled"  placeholder="" value="${result.consultingTitle }" required="" maxlength="50">
				    </div>
				  </div>
<!-- 				  <div class="form-group row"> -->
<!-- 				    <label for="codeValue" class="col-sm-2 col-form-label">상담내용</label> -->
<!-- 				    <div class="col-sm-10"> -->
<%-- 				      <input type="text" class="form-control" id="recordAddr" name="recordAddr" disabled="disabled" value="${result.consultingContents }" required="" maxlength="255"> --%>
<!-- 				    </div> -->
<!-- 				  </div> -->
				  <div class="form-group row">
				    <label for="codeDesc" class="col-sm-2 col-form-label">상담내용</label>
				    <div class="col-sm-10">
				 	   <textarea class="form-control" id="recordPhone" name="consultingContents" rows="10" data-parsley-length="[0, 2000]" disabled="disabled">${result.consultingContents }</textarea>
				    </div>
				  </div>
				  <div class="form-group row">
				    <label for="codeDesc" class="col-sm-2 col-form-label">답변</label>
				    <div class="col-sm-10">
				 	   <textarea class="form-control" id="recordPhone" name="consultingReplyContents" rows="10" data-parsley-length="[0, 2000]">${result.consultingReplyContents }</textarea>
				    </div>
				  </div>
				  <div class="float-right">
				    <div>
		        	<button type="submit" class="btn btn-primary" onclick="fnUpdate();">등록</button>
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
	 *  상담 리스트 페이지 이동
	 */
	function fnLinkPage(pageNo){
		document.registFrm.pageIndex.value = pageNo;
		document.registFrm.action = contextPath + "/admin/consult/list";
		document.registFrm.submit();
	}
	
	/**
	 *  상담 등록 
	 */
// 	function fnInsert(){
		
// 		if(!confirm("상담 정보를 등록하시겠습니까?")) return;
// 		$('#registFrm').parsley().on('field:validated', function() {
// 		})
// 		.on('form:submit', function() {
// 			document.registFrm.action = contextPath + "/admin/record/insert";
// 		});
		
// 	}
	
	/**
	 *  상담 수정 
	 */
	function fnUpdate(){
		
		if(!confirm("상담 정보를 수정하시겠습니까?")) return;
// 		$('#registFrm').parsley().on('field:validated', function() {
// 		})
// 		.on('form:submit', function() {
// 			document.registFrm.action = contextPath + "/admin/record/update";
// 		});
		if($('#registFrm').parsley().validate()){
			document.registFrm.action = contextPath + "/admin/consult/update";
			document.registFrm.submit();
		}
		
	}
	
	/**
	 *  상담 삭제
	 */
// 	function fnDelete(){
// 		if(!confirm("상담 정보를 삭제하시겠습니까?")) return;
// 		document.registFrm.action = contextPath + "/admin/consult/delete";
// 		document.registFrm.submit();
// 	}
	//]]>
	</script>
	
</body>

</html>
