package Ch10

/*
 * 2024.07.05 - ch10 코드 자료
 *
 * Task 수행이 병렬로 처리
 * 1. 양방향 동시 전송 지원 - 멀티미디어 정보 통신 응용 프로그램
 * => full-duplex 실시간 전화 서비스 ; 상대편 음성 정보 수신 & 내 음성 정보 송신
 * 2. 다수 사건 발생 등록 -> 우선순위에 따라 처리 ; Event Handling / Management
 *
 * 문맥 교환 (Context switching) ; A process 실행하다가 B process 실행
 *
 * 스레드 (Thread) ; CPU 사용 기본 단위
 * 멀티스레드 (Multi-thread) ; 한 프로그램 내에서 둘 이상의 thread 실행
 *
 * 코루틴 (Co-routine) ; 비동기 프로그래밍
 * => 경량 스레드 ; 실제 스레드 차지 x 비동기 작업 수행 가능
 * => 중단점 (Suspension Point) 에서 실행 일시 중지 -> 중단점부터 다시 실행 재개 가능
 * => 비동기 코드가 마치 동기 코드처럼 직관적으로 작성 가능
 * => Callback hell 문제 해결 가능
 *
 * Sequence ; 대량 데이터 효율적으로 처리하기 위한 지연 연산 컬렉션
 *
 * 스레드 => 동기화 맞추는 거 이해 필수
 *
 * 코틀린 GUI ; 자바 것 가져다 씀 - 코틀린에게 GUI 는 중요한 부분이 아님
 *
 *
 *
 */