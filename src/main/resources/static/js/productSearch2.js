/**
 * productSearch1.jsp
 */
 
 $(document).ready(function(){

 	$('#prdSearchFrm').on('submit', function(){
 	
 		// submit 이벤트 기본 기능 : 페이지 새로 고침
 		// 기본 기능 중단
 		event.preventDefault();
 		
 		//serialize() : 폼에 입력한 값들을 쿼리 스트링 방식의 데이터로 변환
 		// type=prdName&keywork=노트북
 		var formData = $(this).serialize();
 		
 		$.ajax({
 			type:"post",
 			url:"productSearch2", // /mybatis/product/productSearch1
 			data:formData,
 			success: function(result){
 			
 				// 반환된 결과를 searchResultBox <div>에 삽입
	 			$('#searchResultBox').html(result);
	 			
 			},
 			error: function(){
 				alert("전송 실패");
 			},
 			complete:function(){
 			
 			}
 			
 			
 		}); 	// ajax 끝
 	}); // submit 끝 
 });  // ready 끝