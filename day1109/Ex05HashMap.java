package day1109;

import java.util.HashMap;

//1. List

//index를 가지고 중복된 객체 등록 가능
//ex)ArrayList
//2. set
//index를 가지고 중복객체는 등록불가
//ex)HashSet
//3. map
//index는 없지만 대신 key를 사용하고 중복객체는 등록불가
//ex)HashMap
//
//List Set은 비슷함 equals가 true되는 애를 넣을수있느냐없느냐

// Collection
// Collection 이란, 특정 데이터타입을 모아서 한번에 컨트롤 하는 데이터타입을 Collection 데이터타입이라고 한다.
// Collection 데이터타입에는 크게 List, Set, Map 3가지 종류가 있다.
// List: 인덱스를 가지고 중복된 객체를 입력할 수 있는 인터페이스
// Set: 인덱스를 가지고 중복된 객체를 입력할 수 없는 인터페이스
// Map: 중복되지 않는 키를 가지고 객체를 입력할 수 있는 인터페이스

// 인덱스를 가졌기 때문에 어느정도 메소드가 유사한 List와 Set과는 다르게
// Map은 좀 이질적으로 자신이 가지고 있는 엘리먼트들을 관리하게 된다.
// 인덱스 대신, 각각의 엘리먼트를 접근할 수 있는 키 값을 통해서 우리가
// 해당 엘리먼트를 호출하거나, 아니면 고유한 키 값과 추가할 엘리먼트를 같이 붙혀서 추가하게 된다.

public class Ex05HashMap {
    public static void main(String[] args) {
        /*
         * List와 다르게 입력값이 2개 하나는 키의 클래스형식 데이터타입 다른하나는 값을 클래스형식 데이터타입
         */
        HashMap<String, String> map = new HashMap<>();
        // 1. map의 새로운 요소 추가하기
        // put(키,벨류)
//        String a="a";
        map.put("a", "1");
//        map.put("b", a);
        map.put("b", "2");
        map.put("c", "3");
//        map.put("d", a);
        map.put("d", "4");
        /*
         * 같은 key가 들어오면 값만 바꿔줌
         */
//        map.put("d", "4");
//        System.out.println(map.get("d"));
        
        // 2. map의 특정 객체를 불러올 때에는
        //    get(키)를 통해서 불러와야 한다.
        //    만약 해당 키로 등록된 객체가 존재하지 않으면
        //    null이 리턴된다.
        System.out.println("map.get(a): "+map.get("a"));
        System.out.println("map.get(f): "+map.get("f"));
        
        // 3. 특정 키 값이 map에 존재하는지 찾을 때에는
        //    containsKey()를 사용하고 특정 벨류가 map에 존재하는지 찾을 때에는
        //    containsValue() 를 사용하면 된다.
        System.out.println("map.containsKey(f): "+map.containsKey("f"));
        System.out.println("map.containsValue(b): "+map.containsValue("b"));
        
        // 4. 해당 맵의 키 값을 모두 받아볼 때에는
        //    keySet()을 실행시키면
        //    키 값이 모두 추가되어있는 Set 객체가 리턴된다.
        System.out.println("map.keySet(): "+map.keySet());
        
        // 4-B. 위의 키셋을 사용하면 아래와 같이
        //      해당 맵의 내용을 모두 출력하는 것이 가능하다.
        for(String s : map.keySet()) {
            System.out.print("key: "+s);
            System.out.println(", value: "+map.get(s));
        }
    }
}
