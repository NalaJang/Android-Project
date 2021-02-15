<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="text" id="post1" name="post1" size="15" readonly class="fs01" style="width:70px;">&nbsp;<input type="button" onclick="openDaumZipAddress()" value="우편번호 찾기"><br> 
 
<div id="wrap" style="display:none;border:1px solid #DDDDDD;width:99%;margin-top:5px"></div>
 
<input type="text" id="address1" name="address1" placeholder="주소" size="50" readonly class="fs01" style="width:90%; margin-top:5px;"><br>
<input type="text" id="address2" name="address2" placeholder="상세주소" size="50" class="fs01" style="width:90%; margin-top:5px;">
 
 
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script> 
<script>
function openDaumZipAddress() {
 
    // 우편번호 찾기 화면을 넣을 element를 지정
    var element_wrap = document.getElementById("wrap");
 
    // wrap 레이어가 off된 상태라면 다음 우편번호 레이어를 open 한다.
    if(jQuery("#wrap").css("display") == "none") {
        new daum.Postcode({
            oncomplete:function(data) {
                jQuery("#post1").val(data.zonecode);
                jQuery("#address1").val(data.address);
                jQuery("#address2").focus();
                console.log(data);
            }
 
            // 사용자가 값을 주소를 선택해서 레이어를 닫을 경우
            // 다음 주소록 레이어를 완전히 종료 시킨다.
            , onclose:function(state) {
                if(state === "COMPLETE_CLOSE") {
 
                    // 콜백함수를 실행하여 슬라이드 업 기능이 실행 완료후 작업을 진행한다.
                    offDaumZipAddress(function() {
                        element_wrap.style.display = "none";
                    });
                }
            }
        }).embed(element_wrap);
 
        // 슬라이드 다운 기능을 이용해 레이어 창을 오픈한다.
        jQuery("#wrap").slideDown();
    }
    
    // warp 레이어가 open된 상태라면 다음 우편번호 레이어를 off 상태로 변경한다.
    else {
 
        // 콜백함수를 실행하여 슬라이드 업 기능이 실행 완료후 작업을 진행한다.
        offDaumZipAddress(function() {
            element_wrap.style.display = "none";
            return false;
        });
    }
}
 
function offDaumZipAddress() {
    // 슬라이드 업 기능을 이용해 레이어 창을 닫는다.
    jQuery("#wrap").slideUp();
 
}
</script>

</body>
</html>