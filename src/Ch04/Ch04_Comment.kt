package Ch04

/*
 * 2024.07.02 - ch04 코드 자료
 *
 * class 작성할 때 필요한 것 : 상상력
 * => 내부적으로 어떤 절차에 따라 실행되는지 생각해 보아야 함
 * => 어떤 기능의 함수가 필요한지 생각할 것
 *
 * class Static member : class 하나에 딱 하나만 생성됨 (즉, Static member 를 가진 class 는 하나의 Static 변수를 가진다.)
 * => 객체 내부가 아닌 별도의 공간에 생성됨
 * => 모든 A class 객체는 Static 변수를 쓸 수 있다.
 *
 * final class : 상속 x class
 * final method : overriding x
 *
 * data class : 데이터를 처리하는 목적으로 사용됨
 * => toString(), equals(), copy(), hashCode() 함수 제공
 *
 * 연산자 오버로딩 (Operator Overloading)
 * => 3 + 7 ==> +(3, 7) // + 라는 함수의 인수로 3, 7 이 전달되는 것과 같다.
 * => 함수 선언할 때 operator fun ~
 * => plus(+), minus(-), times(*), div(/)
 *
 * hashCode()
 * => 객체 생성 시 얻는 정수 id 값 반환 ; 이 id 값은 주솟값 느낌
 * => 객체의 속성이 동일해도 별도로 생성된 객체는 서로 다른 id 를 가진다.
 * => '==' 연산자 ; hashCode() 결과 사용함
 * => 동일 클래스로부터 각각 생성된 인스탄스의 속성이 동일해도 서로 다른 hashCode 값을 가지므로 서로 다른 객체 인스탄스로 판단
 * => 문자열 변수는 관리가 좀 다르다.
 * ==> arr = {"AAA", "BBB", "AAA"} 이렇게 각각의 AAA 원소를 두 개 생성하고
 * ==> 각 원소의 hashCode() 값을 확인하면 arr[0] 과 arr[2] 의 hashCode() 값 동일함
 * ==> arr[0] 과 arr[2] 는 동일한 객체
 * => 메모리를 효율적으로 사용하기 위해 동일한 문자열은 이런 식으로 사용한다고 함
 * 속성 동일한지 비교하려면 equals()
 *
 *
 * 어렵더라도 차근차근 인내심 있게 해야 한다.
 *
 * 직접 해 보고, 오류도 좀 잡고 그래야 실력이 는다.
 *
 * 코틀린, 자바, 파이썬 => 클래스 개념으로 구현
 *
 */