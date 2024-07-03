package Ch06

/*
 * 2024.07.03 - ch06 코드 자료
 *
 * 패키지 (Package) ; 관련 클래스 하나로 묶어 사용
 * => 조직화
 * => 디렉토리
 * => 코틀린, 자바 라이브러리 ; 기능에 따라 서로 다른 패키지로 분리 구성
 * => 패키지별 접근 제약 가능
 *
 * 모듈 (Module) ; 프로젝트, 컴파일러 실행과 일치
 * => 패키지, 라이브러리보다 상위 개념
 * => 각각의 모듈은 수십 개의 패키지를 포함할 수 있다.
 *
 * 파이썬의 패키지, 모듈 개념과는 반대됨.
 * => 파이썬 ; 모듈 => 패키지
 * => 코틀린 ; 패키지 => 모듈
 *
 * Generics ; C++ 의 Template 개념과 유사 (차이점도 존재)
 * => 컴파일 시 자료형 점검 -> 실행 시 형 변환에서 발생하는 오류 사전 방지 가능
 * => 컴파일된 라이브러리만 존재하면 사용 가능
 * => 자료형에 상관 없이 동일한 구조로 객체 생성 가능
 *
 * Collection ; 데이터 집합
 * => 대표적으로 3가지 인터페이스 제공 (list, set, map)
 * => list ; 순서 o, 중복 o // ArrayList, LinkedList, Stack, Vector // python - list 유사
 * => set (집합) ; 순서 x, 중복 x // HashSet (hash code 값에 따라 저장 순서 결정), TreeSet // python - set 유사
 * => map ; (key, value) 순서쌍 // python - dict 유사
 * => list, set 은 collection interface 상속 받음
 * => Queue ; FIFO, 우선순위 큐 기능 제공
 * => Deque ; LIFO // Stack보다 성능 우수
 * => Vector ; 잘 쓰면 매우 유용하다 // set보다 더 융통성 o
 *
 * 우선순위 큐 (PriorityQueue)
 * => 우선순위에 따라 상위 5개 뽑겠다 이럴 때 씀 ; 성능 좋아
 *
 * 전체 다 정렬해야 할 때는,,
 *
 * HashMap ; Key 로 숫자만 쓸 수 있는 게 아니라 다양한 자료형 사용 가능함
 */