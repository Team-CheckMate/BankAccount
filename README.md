# 조별 주말 과제 - 은행 계좌

## 🚀 기능 요구 사항

초간단 은행 계좌 시스템을 구현한다.

- 은행은 계좌를 관리한다.
- 은행은 계좌를 등록한다.
- 은행은 계좌번호로 계좌를 찾을 수 있다.
- 은행은 계좌의 소유자명으로 계좌를 찾을 수 있다.
- 은행은 모든 계좌의 목록을 볼 수 있다.
- 계좌는 소유자명, 계좌번호, 잔고로 구성된다.
- 계좌는 입금,출금 기능과 잔고확인 기능이 있다.
- 계좌에서 잔액의 변화가 있을 때마다 입출금 명세에 기록된다.
- 입출금 명세는 거래일자, 거래시간, 입금/출금, 금액, 잔액으로 구성된다.

### 실행 결과 예시

```
= 전체 계좌 목록 =
[계좌번호 :10071, 소유자 명 : 백, 잔액 : 0]
[계좌번호 :890113, 소유자 명 : 택, 잔액 : 0]
[계좌번호 :0113, 소유자 명 : 택, 잔액 : 0]
[계좌번호 :987654321, 소유자 명 : 두팔, 잔액 : 0]

= 해당 계좌번호의 계좌정보 =
[계좌번호 :890113, 소유자 명 : 택, 잔액 : 0]

200000원 입금하셨습니다.
현재 잔액은 200000원 입니다.

= 해당 계좌번호의 계좌정보 =
[계좌번호 :890113, 소유자 명 : 택, 잔액 : 200000]

200000원 입금하셨습니다.
현재 잔액은 400000원 입니다.

= 해당 계좌번호의 계좌정보 =
[계좌번호 :890113, 소유자 명 : 택, 잔액 : 400000]

= 해당 소유자명의 계좌 목록 =
[계좌번호 :890113, 소유자 명 : 택, 잔액 : 400000]
[계좌번호 :0113, 소유자 명 : 택, 잔액 : 0]

= 해당 계좌번호의 계좌정보 =

= 해당 소유자명의 계좌 목록 =

= 해당 계좌번호의 계좌정보 =
[계좌번호 :890113, 소유자 명 : 택, 잔액 : 400000]

5500원 인출하셨습니다.
현재 잔액은 394500원 입니다.

= 해당 계좌번호의 계좌정보 =
[계좌번호 :890113, 소유자 명 : 택, 잔액 : 394500]

= 거래 내역 =
[거래금액:200000, 잔액:200000원 /2020년08월26일11시53분]
[거래금액:200000, 잔액:400000원 /2020년08월26일11시53분]
[거래금액:5500, 잔액:394500원 /2020년08월26일11시53분]
```

---

## 🎯 프로그래밍 요구 사항

- Collection API를 사용한다.
- 날짜를 처리하는 별도의 클래스를 만든다.
- 아래의 클래스 다이어그램으로 프로그램을 구현한다. (필요시 생성자 사용 가능)
- `Lombok` 라이브러리 사용 가능

---

## 🔗 클래스 다이어그램
![image](https://github.com/SysoneEduTeam4/Algorithm/assets/117193889/fdd218b9-3720-4f77-946a-d9a445d49986)
![image](https://github.com/SysoneEduTeam4/Algorithm/assets/117193889/ce1b2e4b-935e-4991-9144-09f5c724ade7)
