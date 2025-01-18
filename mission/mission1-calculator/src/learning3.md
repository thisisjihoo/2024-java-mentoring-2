# StringTokenizer 클래스
- 문자열이 한 종류의 구분자로 구분되어 있는 경우 StringTokenizer 클래스를 이용해서 분리할 수 있다.
    
  - 사용법:
    - 분리하고자 하는 문자열을 StringTokenizer 생성자의 매개변수로 전달한다.
    - StringTokenizer 객체 안에 있는 문자열을 nextToken() 매서드를 이용해서 꺼낼 수 있다.
      - nextToken()으로 문자열을 꺼내 온다면 StringTokenizer 객체의 해당 문자열(토큰)은 사라진다.

# split() 매서드
- String 기본 매서드이며, 문자열을 문자열 배열로 분리할 수 있다.
- StringTokenizer와 동일하게 구분자를 기준으로 문자열을 분리한다.
  - split(String regex): 해당 구분자로 문자열을 분리하여 배열로 반환
  - split(String regex, String regex...): 여러 개의 구분자로 문자열을 분리하여 배열로 반환

## StringTokenizer와 split() 차이점
    - split()
        - 리턴 타입이 string[] 타입으로 반복문 없이 바로 배열로 담을 수 있다.
        - 여러 개의 구분자로 분리 가능!
    
# 정규표현식
- 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식 언어
- Pattern 클래스
  - 정규 표현식이 컴파일된 클래스

  - .matches() 매서드
    - 컴파일과 비교를 한 번에 해주는 매서드

  - Matcher
    - Pattern 클래스를 받아 대상 문자열과 패턴이 일치하는 부분을 찾거나 전체 일치 여부 등을 판별

# indexOf()
  - 문자열에서 첫번째로 등장하는 타겟을 찾는 함수

# SRP 
- single Responsibility Principle의 약자로, 한국어로는 "단일 책임 원칙" 이라 한다.
- 클래스가 하나의 책임만을 가져야한다는 것을 의미
- 클래는 하나의 기능 or 하나의 역할만 해야한다.