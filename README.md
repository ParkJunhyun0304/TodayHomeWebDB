# 22100304 박준현
---
# 프로젝트 설명

Spring Boot 기반 가구 관리 REST API 프로젝트입니다.  
MySQL과 연동되며, 가구 데이터를 등록, 조회, 수정, 삭제할 수 있습니다.

---

## 프로젝트 정보

- **Framework**: Spring Boot 3.5.3  
- **Build Tool**: Maven  
- **Database**: MySQL 8  
- **ORM**: Spring Data JPA  
- **Java Version**: 17  
- **REST API 설계** 기반  

---

## 프로젝트 구조

<pre>
TodayHomeWebDB/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/todayHome/
│   │   │       ├── controller/         # REST API 컨트롤러
│   │   │       ├── entity/             # JPA 엔티티 클래스
│   │   │       ├── repository/         # JPA 레포지토리 인터페이스
│   │   │       ├── service/            # 서비스 비즈니스 로직
│   │   │       └── TodayHomeApplication.java
│   │   └── resources/
│   │       ├── application.properties  # DB 등 환경 설정
│   │       └── static/                 # 정적 리소스 (필요 시)
├── target/                             # 빌드 결과물
└── pom.xml                             # Maven 의존성 관리 파일
</pre>


---

## 주요 기능

- 가구 정보 등록 (POST)
- 가구 목록 조회 (GET)
- 가구 정보 수정 (PUT)
- 가구 삭제 (DELETE)

**가구 정보 항목:**

- `name`: 가구 이름
- `price`: 가격
- `category`: 카테고리 번호
  1. 침대
  2. 매트리스 토퍼
  3. 테이블/식탁/책상
  4. 소파
  5. 서랍/수납장
  6. 행거/옷장
  7. 거울
  8. 화장대/콘솔
  9. 유아동기구
  10. 야외기구
  11. 가벽/파티션
- `width` / `depth` / `height`: 크기 (단위: mm)

---

## API 명세서

| 메서드 | URL               | 설명             | 요청 Body (예시) |
|--------|-------------------|------------------|------------------|
| GET    | `/todayHome`      | 전체 가구 목록 조회 | - |
| POST   | `/todayHome`      | 새 가구 등록     | `{ "name": "책상", "price": 50000, "category": 1, "width": 100, "depth": 50, "height": 75 }` |
| PUT    | `/todayHome/{id}` | 기존 가구 수정   | `{ "name": "책장", "price": 60000, "category": 2, "width": 120, "depth": 40, "height": 180 }` |
| DELETE | `/todayHome/{id}` | 가구 삭제        | - |

---

# 실행 예시

## 모든 가구 데이터 조회
<img width="1234" height="957" alt="스크린샷 2025-07-12 오후 9 03 46" src="https://github.com/user-attachments/assets/1af9d637-18d6-4b99-baa4-ed20641a2a78" />

---
## 새로운 가구 데이터 추가

### 입력된 데이터
```
{
    "name": "철제의자",
    "price" : "21000",
    "category" : "4",
    "width" : "400",
    "depth" : "400",
    "height" : "1500"
}
```
<img width="1234" height="957" alt="스크린샷 2025-07-12 오후 9 09 50" src="https://github.com/user-attachments/assets/ceed496c-fe78-4661-ae8b-2def7d0f24e7" />

### 추가된거 확인
<img width="1234" height="957" alt="스크린샷 2025-07-12 오후 9 10 24" src="https://github.com/user-attachments/assets/dab854f6-270f-4057-8f2e-93290aa6e79c" />

---

## 데이터 수정
### 철제의자(id = 52)의 price : 21000, height : 1700 으로 변경
<img width="1234" height="957" alt="스크린샷 2025-07-12 오후 9 12 32" src="https://github.com/user-attachments/assets/7342ba67-9b1c-4bad-b776-a0410ebc1e17" />

### 변경 후 확인
<img width="1234" height="957" alt="스크린샷 2025-07-12 오후 9 12 36" src="https://github.com/user-attachments/assets/f7188a15-15f3-4baa-b051-cfa64ff718ac" />

---

## 데이터 삭제
### 철제의자(id=52) 삭제
<img width="1234" height="957" alt="스크린샷 2025-07-12 오후 9 12 46" src="https://github.com/user-attachments/assets/383ec34c-7bc8-4e86-8a21-48add321e492" />

### 삭제후 확인
<img width="1234" height="957" alt="스크린샷 2025-07-12 오후 9 12 51" src="https://github.com/user-attachments/assets/303768cf-8343-40e5-80a1-7e609edfd4ec" />




