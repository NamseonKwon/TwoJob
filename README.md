# ToJob (투자를 잡아라) ![버전](https://img.shields.io/badge/%20version-1.0-green)

![](기타/image/로고.PNG)

###  서비스 개요

사업자의 이전 투자프로젝트 정보<sup>[1](#footnote_1)</sup> 공개를 통한 신뢰 가능한 투자/쇼핑 플랫폼



### 제작 배경

<img src="기타/image/배경.PNG" alt="person1" />



 큰 맘 먹고 어렵게 모은 돈을 투자했는데, 투자금이 어떻게 사용되는 건지 알 수 없어서 답답하지는 않으셨나요? 좋은 아이디어는 있는데 자본이 없어 상품을 출시하지 못하진 않으셨나요? 투잡에서는 **블록체인** 기술을 적용해 **위변조 불가능한 거래 내역을 공개**하고, 누구나 **소자본**으로도 **상품을 출시할 기회**를 제공하고 있습니다.

##### 

### 주요 기능 

- 블록체인

  - 프로젝트 이력, 투자금 운용 내역 저장

  - 투자 프로젝트 목표금액을 달성시 중간계좌에 모인 돈 사업자가 수령가능 

  - 상품 판매 수익금 투자 비율에 따라 투자자들에게 분배

- 투자

  - 사업자: 사업 아이템을 투자 프로젝트로 오픈
  - 투자자: 사업자의 과거 투자 프로젝트 이력 및 투자금 운용내역 열람, 투자 가능 

- 쇼핑

  - 사업자: 투자 프로젝트 목표금액 100% 달성시 상품 판매 가능  

  - 소비자: 원하는 상품 구매  



- 투자 프로젝트 오픈을 원하는 유저가 게시글을 올리면, 해당 게시글의 해시값은 DB에서 관리되어 이후 거래명세를 확인하는데 사용

- 투자 프로젝트 목표금액을 달성하게 되면, 중간계좌에 모인 돈이 사업자에게 옮겨짐<sup>[2](#footnote_2)</sup>

- 목표금액을 달성한 투자 게시글은 이후 판매를 할 수 있도록 서비스를 제공하며 투자자들에게 이윤의 X%를 투자자들 수로 나누어 분배함



### 차별점

- 소비자

  - 블록체인을 통해 투자자들에게 위변조 불가능한 투명한 정보 제공

- 사업자

  - 아이디어만 있다면 소자본으로 이익 창출 가능

  - 본인의 아이디어에 대한 상품화 가능성 확인 가능



### 블록체인의 활용방안

- 블록체인은 투자금액을 모금하는 중간계좌 뿐 아니라 수익을 분배할 때 사용됨
- 또한, 유저의 투자 게시글 정보와 판매 명세를 블록으로 저장하여 이후 투자자들이 투자할 때 참고할 수 있도록 제공이 됨



### 와이어프레임

https://xd.adobe.com/view/adaaaf5b-9132-4b7c-96aa-b082be9f2062-f8f9/

![wireframe](산출물/와이어프레임/와이어프레임.PNG)



### 서비스 이용방법







### 기술 스택

![](기타/image/기술스택.PNG)





### commit message rule

```
[FE/BE/etc] 동사 + 페이지 이름 + 추가하고 싶은 메시지 

#지라번호
```

- 동사: Add, Update, Fix(버그 수정), Delete

- 예시

  ```
  [FE] Fix adminpage design
  
  #S02P13B205-332 
  ```





---

<a name="footnote_1">1</a>) 과거 투자 프로젝트 이력 및 투자금 운용내역

<a name="footnote_2">2</a>) 목표금액 미달성시, 투자자들에게 투자한만큼 돌아감



 