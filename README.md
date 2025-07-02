# [인프런 독학] 스프링 부트 기초

<br>

## 🌟 소개

- Spring으로 졸업작품 개발을 할 때는 시간이 쫓겨 시간을 투자하지 못했는데, <br>
  작품을 마친 후 부족한 지식을 쌓기 위해 공부하고 기록하기 위해 만들었습니다.
<br><br>
- Spring 입문을 마친 후 상세한 Spring에 대해 기초 과정을 공부하고 싶어 만들었습니다.
<br><br>
- 2025.06.15 ~
  <br><br>
- 목표

1. 섬세하고, 부족한 스프링 지식 채우기

2. 꾸준하게 기록하며, 코딩 습관 들이기

3. 실무에서 쓰는 기술 많이 익히기

> ### [📁 강의 : 스프링 핵심 원리 - 기본편](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B8%B0%EB%B3%B8%ED%8E%B8/dashboard)


<br>

## 강의 필기

### 2025년 6월  15일 (파트 1 ~ 파트 4)

#### 📌 핵심 요약

-  EJB와 Spring

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 4
EJB의 문제 -> (겨울을 지나) 2003년 Spring의 시작 -> 웹서버 톰캣 내장 2014년 Spring boot 출시

</details>

### 2025년 6월 16일 (파트 5 ~ 파트 7)

#### 📌 핵심 요약

- 스프링 프레임워크, 스프링 부트
- 스프링과 다형성
- SOILD 책임 원칙

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 5
스프링 데이터 - JPA
스프링 세션
스프링 시큐리티
스프링 Rest Docs - API 문서와 테스트
스프링 배치 - 분할 처리
스프링 클라우드

- 스프링 프레임워크
  웹, 데이터 접근, 기술 통합, 테스트, 언어

- 스프링 부트 (객체지향 프로그래밍을 중점)
  Tomcat 내장, starter 제공, 3rd parth(외부) 라이브러리 자동 구성, 모니터링 기능 제공, 간결한 설정

#### 파트 : 6
유연하고, 변경이 용이
역할(자동차 / 공연 /인터페이스)과 구현(k3, 아반떼 / 배우1, 배우2 / 구현 클래스)
1. 인터페이스 설계 2. 구현 객체 생성

#### 파트 : 7
SOLID
단일책임 : 한 클래스는 하나만 책임
개방폐쇄 : 확장에는 열려있고, 변경에는 닫혀있음
리스코프 치환 : 인터페이스 원칙 수행
인터페이스 분리 원칙 : 자동차(운전/정비), 사용자(운전자/정비사)
의존 관계 역전 원칙 : 역할 인터페이스 의존 / 구현 의존 X

</details>

### 2025년 6월  17일 (파트 8 ~ 파트 11)

#### 📌 핵심 요약

- 스프링과 다형성
- 회원 - 주문
- 비즈니스 요구사항 확인

<details>
<summary> 학습 필기 내용 </summary>

### 파트 : 8

스프링 (다형성, OCP, DIP 가능하게 지원)<br>
-> 클라이언트 코드 변경 없이 기능 확장

### 파트 : 10

비즈니스 요구사항<br>
회원 - 가입, 조회, 등급 (일반, VIP) DB 미지정, 주문<br>
주문, 할인 - 등급에 따라 할인 (VIP는 천원 나중에 변경, 안할수도)

### 파트 : 11

도메인 협력 관계 - 기획자도 같이<br>
클래스 다이어그램 - 개발자가 구체화<br>
객체 다이어그램 - 실제 서비스용

</details>

### 2025년 6월 18일 (파트 12  ~ 파트 16)

#### 📌 핵심 요약

- 회원 클래스 테스트 코드 확인
- 할인 정책 : 등급이 VIP라면 천원 할인
- 주문 할인 테스트

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 12 ~ 16

강의 보기 전에 먼저 작성 해보고, 강의 후 코드 수정 <br>
모든 메소드 생성 하려고 했는데, 막상 강의에서는 주문 메소드만 생성함 

</details>

### 2025년 6월 19일 (파트 17 ~ 파트 20)

#### 📌 핵심 요약

- DIP, OCP 원칙 위배(ex - 할인율 변경시) 

- 따라서, AppConfig를 통한 객체 의존 관계 정리

- AppConfig에서 전체 구성 및 설정 (ex 할인율 - 고정 / 비율)

- AppConfig 내부도 리팩토링 해, DIP 원칙 준수

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 17

테스트 @DisplayName() -> 테스트 이름 지정

#### 파트 : 19

DIP 원칙에 의해 객체는 자신이 맡은 역할만 수행해야함(배우, 회원가입, 기능)
<br>
그 외의 객체 의존 관계는 AppConfig에서 수행 (공연 기획자)<br>
-> 전체 동작 방식 구성(생성) 및 설정 (의존성 주입)

#### 파트 : 20

AppConfig 역시 새로 생성되는 객체의 생성자를 밖으로 빼서 주입해주므로,<br>
역할과 구현 분리해서 역시 DIP 원칙 수행


</details>

### 2025년 6월 20일 (파트 22)

#### 📌 핵심 요약

- DIP와 OCP 위반을 해결하기 위해, AppConfig 활용해서 구현 및 주입 

- AppConfig 내부에서도 역할과 구현 분리

- 모든 과정을 통해서, 클라이언트 코드는 변경할 필요가 없음

//SAA 자격증 준비로 많이 하지 못했다


### 2025년 6월 21일 (파트 22 ~ 파트 26)

#### 📌 핵심 요약

- 객체지향 특성 3가지 중점

- IoC와 DI

- 스프링 컨테이너와 Bean 등록

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 23

현재 코드 리팩토링을 통해 객체지향 특성 3가지 중점으로 지킴

1. SRP 단일 책임 원칙

   한 클래스는 하나의 책임만  (클래스 내부에서 객체 생성 및 기능 -> 분리)

2. DIP 의존관계 역전

   새로운 기능 추가시, 클라이언트 코드 수정 X (새로운 기능 추가시 객체 주입 코드 수정)

3. OCP 개방폐쇄 원칙

   확장에는 열려있고, 변경에는 닫혀있음 (외부 - AppConfig에서만 변경해주면 됨)

#### 파트 : 24

IoC, 제어의 역전 -> 프로그램 제어 흐름을 외부 관리 <br>
(전) 클래스 내부에서 직접 객체 생성, 주입 (후) AppConfig 제어 흐름 관리 <br>

프레임워크 vs 라이브러리 <br>
프로그램 제어 흐름(호출)을 누가 담당하는지 <br>

DI, 의존관계주입 <br>
정적 클래스 의존 관계 -> 코드를 실행하지 않아도 의존 관계 판단 가능 <br>
동적 클래스 의존 관계 -> AppConfig와 같이 외부에서 주입되는 경우 실행 해봐야함(DI - Dependency Injection) <br>

IoC 컨테이너(DI 컨테이너)

#### 파트 : 25

AppConfig 상단 <br>
@Configuration -> 구성 정보에서 @Bean으로 등록된 메서드를 스프링 컨테이너에 빈으로 등록 <br>

클래스 내부에서 Appconfig 객체 생성 대신 -> <br>
ApplicationContext(스프링 컨테이너) applicationContext = new AnnotationConfigApplicationContext(AppConfig.class); -> 스프링 설정 관리 <br>
MemberService memberService = applicationContext.getBean("memberService", MemberService.class); -> 스프링 컨테이너에서 메서드 명, 반환 타입 검색

#### 파트 : 26

스프링 컨테이너 - 빈 작동 원리

1.  스프링 컨테이너 생성 (빈 저장소 이름- 주로 메소드명 / 객체)

2.  AppConfig에 @Bean 등록 되있는거 컨테이너에 저장

3. 객체 간 의존 관계 설정 (DI)

</details>


### 2025년 6월 22일 (파트 27 ~ 파트 29)

#### 📌 핵심 요약

- 등록된 빈 확인

- 빈 목록을 테스트

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 27

iter 배열, 문자열 반복

Test 코드에서 스프링 빈 조회 가능

#### 파트 : 28

assertThrow를 통해 에러가 터지는지 확인 가능 (어떤 Exception인지 작성)


</details>

### 2025년 6월 25일 (파트 30)

#### 📌 핵심 요약

- 부모 타입 빈 조회 시 자식 타입도 함께 조회 됨.

- Object 타입 조회시 스프링 관련 모든 클래스도 조회됨.

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 30

부모 타입 빈 조회시 자식 타입 함께 조회

내일부터는 처음부터 다시 코딩 해보기


### 2025년 6월 26일 ~ 27일 (파트 1 ~ 파트 30)

- 처음부터 다시 코딩하며 복습 완료

[복습용 레포](https://github.com/junyoung011019/spring-basic-review)

### 2025년 6월 28일 (파트 31 ~ 파트 32)

#### 📌 핵심 요약

- 스프링 컨테이너 (BeanFactory, ApplicationContext)

- 그중 최상위 인터페이스 : BeanFactory

- 하위의 다양한 부가 기능을 상속 받음 : ApplicationContext

- xml로 config 작성하기

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 31

BeanFactory는 최상위 인터페이스, 스프링 관리 및 조회 <br> 

ApplicationContext는 여러 부가기능 (BeanFactory 포함) 상속받음 <br>
· MessageSource : 한국에서 한국어, 미국에선 영어 <br>
· EnvironmentCapable : 로컬 개발환경, 테스트 서버, 운영 서버, (스테이징 환경 - 운영과 가장 밀접한 환경) 환경 별 환경변수 처리 <br>
· ApplicationEventPublisher : 이벤트 발행 및 구독 <br>
· ResourceLoader : 외부 리소스 읽어와서 추상화 <br>

#### 파트 : 32

AppConfig와 동일하게 xml로 config 등록하면 됨

</details>

### 2025년 6월 29일 (파트 33  ~ 파트 )

#### 📌 핵심 요약

- BeanDefinition에서 스프링 정보를 추상화해서 빈이 생성됨

- 현재 요청시마다 config 객체 생성됨

- 싱글톤으로 객체 하나만 생성하고, 공유하도록 설계 변경

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 33 

스프링 컨테이너 -> BeanDefinition (스프링 정보 추상화) -> AppConfig, appConfig

- beanDefinition <br>

scope=; 싱글톤 <br>
autowireMode 자동 주입 <br>
메타정보 기반으로 빈이 생성 <br>

### 파트 : 34

현재 문제점 : 여러번 요청시 config가 불필요하게 여러개 생성됨 <br>

싱글톤으로 객체를 하나만 생성하고, 공유하게 설계


</details>

### 2025년 6월 30일 (파트 35)

#### 📌 핵심 요약

- 싱글톤 패턴 구성 방법

- 싱글톤 패턴의 단점

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 35

private static final SingletonService instance = new SingletonService();으로 <br>
static -> JVM 로딩시 한 번만 실행 <br>
fianl -> 외부 접근 막음 <br>


싱글톤 패턴을 만들지 않아도, 스프링에서 자동으로 관리

DIP 위반, OCP 위반, 유연성 떨어짐

</details>

### 2025년 7월 1일 (파트 36  ~ 파트 38)

#### 📌 핵심 요약

- 스프링 컨테이너는 싱글톤 방식으로 작동

- 따라서 무상태성 유지 해야함.

- AppConfig에서 다른 인스턴스 생성이 여러번 호출해도, 하나만 생성해서 공유한다

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 36

스프링 컨테이너는 싱글톤 방식으로 작동

#### 파트 : 37

**** 중요 **** <br>
싱글톤 객체(스프링 빈)는 무상태성을 유지해야한다 <br>
내부 지역 변수를 변경하면, 다른 사용자도 바뀜 <br>
(한 객체를 공유하기 때문) <br>

isEqualTo 같이 같은지 (=) <br>
isSameAs 참조 값이 같은지 <br>

#### 파트 : 38

AppConfig에서 다른 인스턴스 생성이 여러번 호출해도, 하나만 생성해서 공유한다

</details>

### 2025년 7월 2일 (파트 39  ~ 파트 41)

#### 📌 핵심 요약

- AppConfig를 상속 받는 CGLIB에서, 빈 존재 여부에 따라 생성 or 존재하는 빈 리턴 해줌

- 다양한 스프링 어노테이션은 컴포넌트를 내장한다.

- 컴포넌트 스캔을 통해, 컴포넌트를 자동으로 스프링 컨테이너에 저장한다.

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 39
AppConfig를 상속받는 AppConfig@CGLIB를 생성 <br>
(바이트 코드 조작) <br>
-> 이미 빈이 있으면 존재하는 빈 리턴, 없으면 새로 생성

@Configuration을 지우면, <br>
싱글톤 안됨. AppConfig를 바로 가져옴

#### 파트 : 40

Autowired, 컴포넌트 스캔 수행 과정

1. @ComponentScan이 @Component가 붙은 모든 클래스를 스프링 빈으로 등록한다 (스프링 빈 이름은 맨 앞글자만 소문자)

2. 생성자에 @Autowired를 지정하면, 스프링 컨테이너가 자동으로 해당 스프링 빈을 찾아서 주입한다.
   (타입이 같은 빈을 찾음)

생성자에 매개변수가 많아도 자동으로 주입한다


#### 파트 : 41

<스프링이 지원하는 기능> <br>
basePackages 특정 패키지 하위에서만 스캔 돌릴 수 있다 <br>
SpringBootApplication에 컴포넌트 스캔 내장 <br>

@Controller @Configuration @ Service @Repository <br>
-> @Component 내장


</details>


<br><br><br><br><br><br>


### 2025년 월 일 (파트  ~ 파트 )

#### 📌 핵심 요약

-

<details>
<summary> 학습 필기 내용 </summary>

#### 파트 : 

</details>