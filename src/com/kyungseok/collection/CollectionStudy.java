package com.kyungseok.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionStudy {

	public void checkList() {
		// List는 아래와 같이 초기화 불가능 -> 인터페이스이기 때문
		// List list = new List();
		// 선언은 일반 객체를 초기화하는 것과 같다
		ArrayList list = new ArrayList();
		
		//입력
		list.add(new Item()); // <-0번 index로 생성
		list.add(new Item()); // <-1번 index로 생성
		//조회
		list.get(0); // <- index가 0번째인 값을 가져온다.
		//수정1
		list.set(1, new Item()); // <-1번 index의 item이 새로 생성된 new item으로 대체
		//수정2(add의 다른 방법)
		list.add(1, new Item()); // <-1번부터 이후의 아이템 index를 하나씩 증가시키고 자신이 1번으로 들어간다. (배열의 크기가 변경됨)
		//삭제
		list.remove(1); // 삭제할 아이템의 index를 지정
						// 삭제하면 다음 데이터들이 앞으로 한칸씩 이동해서 빈공간을 채운다.
		
	}
	public void checkGeneric() {
		// 제네릭을 사용하는 방법
		// 타입<제네릭타입> 변수이름; //<- 제네릭타입은 클래스만 가능
		//ArrayList<String> list = new ArrayList<>();
		
		// list.add(123); 타입이 맞지 않는다. Generic을 빼면 가능(빼면 Object로 받아드림)
		// ArrayList list = new ArrayList(); 를 하면 Object를 받으므로 가능
		
		/*
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("Hello");
		list.add(new Item());
		list.add(new Student());
		
		System.out.println(list.get(3));
		// 제네릭을 쓰지 않으면 일단 print는 주소를 받게 되며
		// 향상된 for문도 Object로만 받게 된다.
		// for(Object object : list){
		   		Item item = (Item) object;
		   }
		// 와 같이 사용
		*/
		
		ArrayList<Item> list = new ArrayList<>();
		
		list.add(new Item());
		for(Item item : list) {
			
		}
	}
	
	public void checkSet() {
		//Set도 구현체가 아님
		HashSet<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Good to see you");
		set.add("Hello"); //중복된 값
		set.add("dfdf");
		
		//삭제
		set.remove("dfdf");
		
		// 강화된 for문으로 반복 가능
		/*
		 * for(String item : set){
		 * 		System.out.println(item);
		 * }
		 */
		
		//set은 iterator 를 달아서 순서대로 처리해 줄 수 있다. 마치 list처럼
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); //object형으로 리턴이 된다.
		}
		
	}
	//Key, Value로 구성된 동적 객체배열
	public void checkMap() {
		//map또한 interface
		//선언
		HashMap<String, Integer> map = new HashMap<>(); //String을 key로 Integer를 Value로 설정
		//입력
		map.put("key01",123456);
		map.put("key02",1234561234);
		// map.put("1234, "sdfef"); //<- 이는 에러
		//조회
		System.out.println(map.get("key01"));
		
		//map은 반복문 불가능
		//맵을 반복문으로 처리하기
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(map.get(key));
		}
	}

}