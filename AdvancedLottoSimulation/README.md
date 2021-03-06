# AdvancedLottoSimulation (TreeSet Ver.)

## 2021. 1. 10.

### **>> 요구사항**

1. 로또 숫자 구성
   - 숫자 범위: 1~42
   - 갯수: 기본 번호 6개 + 보너스 번호 1개
2. 당첨 규칙
   - 1등: 기본 번호 6개 일치
   - 2등: 기본 번호 5개 일치 + 보너스 번호 1개 일치
   - 3등: 기본 번호 5개 일치
   - 4등: 기본 번호 4개 일치
   - 5등: 기본 번호 3개 일치
3. 시뮬레이션 프로세스
   - n개의 로또 자동 생성
   - 당첨 번호 생성
   - n개의 로또의 당첨여부를 통계내어 출력

코드 유의사항

- 메소드는 한가지 일만한다.
- class의 인스턴스 변수로는 3개이상 두지않는다
- model 위주의 설계를 먼저 진행한다.
- 인덴트는 2depth로 진행한다.
- class는 PascalCase naming을 사용하며, method, variable은 Camel Case를 이용한다.
- 함수는 의미있는 네이밍을 지어준다.
- 변수명 또한 의미있는 네이밍을 지어준다.

### **>> 초기 모델 설계**

<img width="834" alt="image-20210110130248316" src="https://user-images.githubusercontent.com/24728385/104114789-bd638280-534b-11eb-8fe0-50b02302dcb1.png">

* ExampleLotto(시뮬레이션 될 예시 번호)는 큰 틀이 ArrayList이다
  * `id` :초기 설계 때 없었는데, ArrayList내부의 Object의 index를 구하는 방법을 찾지못해 부여하게 됐다.
  * `Set<Integer> basicNumbers` : TreeSet의 장점인 ''번호 중복 자동삭제''와 ''오름차순 정렬''로 번호를 삽입한다.
  * `private int matchCount` : 당첨번호와 비교하여 몇개나 맞았는지 카운트 한다.

* WinningLotto(당첨 번호)
  * `Set<Integer> basicNumbers` : TreeSet의 장점인 ''번호 중복 자동삭제''와 ''오름차순 정렬''로 번호를 삽입한다.
  * `private int bonusNumber` : 랜덤으로 숫자를 생성해서 `basicNumbers` 과 중복 없는 숫자를 저장 한다.


### **>> 실행화면**

![image-20210110133109608](https://user-images.githubusercontent.com/24728385/104114804-d9672400-534b-11eb-9fe7-0a812a201704.png)
<img width="427" alt="image-20210110133255724" src="https://user-images.githubusercontent.com/24728385/104114810-e7b54000-534b-11eb-8b7f-0fd79c3cfe4b.png">

### **>> Class diagram**

![LottoController](https://user-images.githubusercontent.com/24728385/104128643-3b577600-53ac-11eb-8d9d-baf93e3c7dcc.png)
