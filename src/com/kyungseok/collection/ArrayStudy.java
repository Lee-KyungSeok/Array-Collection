package com.kyungseok.collection;

public class ArrayStudy {
	
	public void checkArray() {
		// 선언
		// 타입 이름[] = new 타입[배열공간크기];
		//기본형인 int, long 등은 공간을 할당하는 것만으로 기본값으로 0이 할당
		int intArray[] = new int[10];
		System.out.println(intArray[7]);
		
		//new 는 크기만 할당해 주는 것
		Item itemArray[] = new Item[10];
		// System.out.println(itemArray[7].getMyName()); 이렇게 하면 에러
		// 아래와 같이 Object를 Array로 할 경우 new를 해주어야 한다.
		
		// 반복문 안에서 바로 length를 지정하는 것은 권장되지 않는다.
		int itemLength = itemArray.length;
		for(int i=0 ; i<itemLength ; i++) {
			itemArray[i] = new Item();
		}
		System.out.println(itemArray[7].getMyName());
	}

}
