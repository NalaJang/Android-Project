# Android-Project
## 나만의 코디네이터와 쇼핑하기
* 1:1 채팅을 통해 코디네이터와 내가 원하는 스타일을 상담 후 옷을 구매하는 채팅 어플리케이션 구현
* 서버 : JAVA
* 클라이언트 : Android Studio
* 데이터베이스 : My SQL, SQLite

## 화면 구성
* 메인(로그인 화면)
  * 회원가입
  * 아이디 비밀번호 찾기

* 코디네이터 목록(친구 목록)
	* 사용자 프로필
	* 내가 등록한 코디네이터 목록

* 채팅 목록
	* 채팅 들어가기
	* 채팅 삭제

* 더보기(추가 메뉴)
	* 정보 수정
	* 주문 내역
	* 바디 프로필 등록
	* 문의 내역

## 구현 화면
### 메인(로그인 화면)

* 메인
  
  <img src="https://user-images.githubusercontent.com/73895803/107329247-3bee4400-6af3-11eb-8d45-4d33bccb35c3.PNG" width = "250" /><br />
  
* 회원가입
  
  <p float = "left">
   <img src="https://user-images.githubusercontent.com/73895803/107322265-7f42b580-6ae7-11eb-8b9d-1fd2dad5e800.PNG" width = "250" />
   <img src="https://user-images.githubusercontent.com/73895803/107322269-8073e280-6ae7-11eb-82ca-b5ea699df4ad.PNG" width = "250" "/>
  </p><br />
  
* 아이디 비밀번호 찾기
  
  <p float = "left">
  <img src="https://user-images.githubusercontent.com/73895803/107322337-9da8b100-6ae7-11eb-8b45-4275dde5c439.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107322341-9ed9de00-6ae7-11eb-8cb9-703575ce4df8.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107322342-9ed9de00-6ae7-11eb-8292-5def55a72eaa.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107322344-9f727480-6ae7-11eb-8aa8-60213a0f741d.PNG" width = "235" height = "450"/>
  </p><br /><br />

### 로그인 성공 -> 3개의 하단 메뉴와 코디네이터 검색 메뉴

  <p float = "left">
  <img src="https://user-images.githubusercontent.com/73895803/107329881-2299c780-6af4-11eb-8925-9afc9247e422.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107329899-29c0d580-6af4-11eb-844e-9ad14fc2047a.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107329904-2a596c00-6af4-11eb-903a-42af1035bc6a.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107336646-af488380-6afc-11eb-9e41-9288d404bc88.PNG" width = "235" height = "450"/>
  </p><br />

* 코디네이터 목록과 검색 화면
  * 코디네이터를 등록 후 다시 검색 메뉴에 내가 등록한 코디네이터가 제외 된 목록으로 나오는 모습을 확인 할 수 있다.
  <p float = "left>
  <img src="https://user-images.githubusercontent.com/73895803/107330196-94721100-6af4-11eb-994f-744d0f6e7a7d.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107336652-b1124700-6afc-11eb-9928-1222830f263f.PNG" width = "235" height = "450"/>
  </p>

* 새로운 채팅 시작하기
  * 원하는 코디네이터와 채팅을 진행 할 수 있다.
  
  <나>
  <p float = "left">
  <img src="https://user-images.githubusercontent.com/73895803/107331092-c5067a80-6af5-11eb-9a1e-f655f088e29e.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107331098-c59f1100-6af5-11eb-9498-29c9234930c0.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107331106-c6d03e00-6af5-11eb-9776-e10f7f4f522e.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107331111-c8016b00-6af5-11eb-945b-1265520a631a.PNG" width = "235" height = "450"/>
  </p>
   
  <코디네이터>
  <p float = "left">
  <img src="https://user-images.githubusercontent.com/73895803/107331104-c6d03e00-6af5-11eb-84f9-17318fdd8614.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107331107-c768d480-6af5-11eb-840a-4c486d680eb2.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107331108-c8016b00-6af5-11eb-8c75-24f78a53a596.PNG" width = "235" height = "450"/>
  </p><br />

* 더보기 메뉴에선 나의 정보들을 확인 및 수정이 가능하다.
	* 내 정보
    * 대화명 수정 예시
  <p float = "left">
  <img src="https://user-images.githubusercontent.com/73895803/107331726-9a68f180-6af6-11eb-8f44-771f82b183bf.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107331666-891fe500-6af6-11eb-99e8-09187488477f.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107331667-89b87b80-6af6-11eb-93da-a4b1e2aa0698.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107331668-89b87b80-6af6-11eb-95c7-39f0388a5b28.PNG" width = "235" height = "450"/>
  </p><br />
  
    * 배송지 추가 예시
  <p float = "left">
  <img src="https://user-images.githubusercontent.com/73895803/107331671-8a511200-6af6-11eb-9db9-c54be3df6374.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107331674-8ae9a880-6af6-11eb-9459-a1ec2d47ddac.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107331675-8ae9a880-6af6-11eb-807d-e3a7e8a63893.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107331676-8b823f00-6af6-11eb-8320-230feb7d09cf.PNG" width = "235" height = "450"/>
  </p><br />

	* 주문 내역과 포인트 내역
  <img src="https://user-images.githubusercontent.com/73895803/107336500-83c59900-6afc-11eb-9163-880101f94066.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107336464-78726d80-6afc-11eb-807c-112041f9e518.PNG" width = "235" height = "450"/><p />
  
	* 바디 프로필
      * 사용자의 프로필을 바탕으로 코디네이터의 추천이 가능하다.
  <img src="https://user-images.githubusercontent.com/73895803/107336568-9770ff80-6afc-11eb-9c58-e01ed019e4b7.PNG" width = "235" height = "450"/>
  <img src="https://user-images.githubusercontent.com/73895803/107336574-98a22c80-6afc-11eb-9671-6b77dfc8952b.PNG" width = "235" height = "450"/><br />


	* 문의 내역

