# 토이프로젝트 2단계 - 4조
- 스프링 Legacy 기반 프로젝트 (DB 설계, DB 트랜젝션, RESTful API 설계)

## 프로젝트 소개
- 여행별 여러 개의 여정을 담아 기록, 수정할 수 있도록 관리하는 스프링 기반 RESTful API <br>
[명세서]https://www.notion.so/2-9661b25933204481ace02cdb37d70de8#450e3beb32874855ae65ad2c1104c8ab
[RFP]https://docs.google.com/document/d/1RSqH9ILlEo4juLZLKocfVOdKH9eoTT5U/edit

## 프로젝트 기간
- 2024-01-29 ~ 2024-02-02

## 멤버 구성&역할
이름|기능|역할
:---:|:---:|:---:
신종호(조장)|여정|U
박하은|여정|R, 예외처리
여관구|여정|C
김애림|여행|C,U
이선주|여행|R,U,예외처리

## 개발 환경
- JDK : 11
- Database : MySQL

## API 명세서
[API 명세서]https://documenter.getpostman.com/view/32623056/2s9YyvAf7C

## ERD 설계도


## 파일 구조

├── build.gradle
├── README.md
├── src
│   └── main
│       ├── java
│       │   └── com.travel
│       │       ├── domain
│       │       │   ├── itinerary
│       │       │   │   ├── controller
│       │       │   │   ├── entity
│       │       │   │   ├── repository
│       │       │   │   └── service
│       │       │   └── trip
│       │       │       ├── controller
│       │       │       ├── entity
│       │       │       ├── repository
│       │       │       └── service
│       │       ├── exception
│       │       └── model
│       ├── resources
│       │   └── mybatis-config
│       │       ├── config.xml
│       │       └── mapper
│       │           ├── ItineraryMapper.xml
│       │           └── TripMapper.xml
│       └── webapp
│           └── WEB-INF
│               ├── web.xml
│               └── spring
│                   ├── root-context.xml
│                   └── appServlet
│                       └── servlet-context.xml
└


## 유의사항
- rootcontext.xml ==> username, password 사전 설정 필요
