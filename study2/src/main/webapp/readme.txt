기본 팩키지 구조 / 메서드명 규칙 

kr.ac.pcu.admin.web : 컨트롤러, vo(java bean, dto, 도메인, 모델,..)        
        AdminMemberController 
kr.ac.pcu.admin.service : 서비스
        AdminMemberService <--  AdminMemberServiceImpl   
kr.ac.pcu.admin.dao  : MemberDao or MemberMapper(MyBatis, iBatis)  

dao 메서드 : selectXxxx , insertXxxx , ...
service 메서드 : getXxx, getXxxList, registXxx , modifyXxx, removeXxx

-- 컨트롤러와 서비스는 각 영역에 생성 하셔야 하고요...
일반적으로 DAO 객체는 DB Table 과 1:1로 매핑하여 
하나의 쿼리를 하나의 메서드에서 처리 하는데....
현재 MemberDao 가 admin/member 서비스에서도 사용할 것이고 
차후 login 할때도 MemberDao 를 사용해야 할 텐데요....

-- DAO 및 vo(자바빈)는 공통적인 기


 

