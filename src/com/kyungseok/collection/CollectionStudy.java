package com.kyungseok.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionStudy {

	public void checkList() {
		// List�� �Ʒ��� ���� �ʱ�ȭ �Ұ��� -> �������̽��̱� ����
		// List list = new List();
		// ������ �Ϲ� ��ü�� �ʱ�ȭ�ϴ� �Ͱ� ����
		ArrayList list = new ArrayList();
		
		//�Է�
		list.add(new Item()); // <-0�� index�� ����
		list.add(new Item()); // <-1�� index�� ����
		//��ȸ
		list.get(0); // <- index�� 0��°�� ���� �����´�.
		//����1
		list.set(1, new Item()); // <-1�� index�� item�� ���� ������ new item���� ��ü
		//����2(add�� �ٸ� ���)
		list.add(1, new Item()); // <-1������ ������ ������ index�� �ϳ��� ������Ű�� �ڽ��� 1������ ����. (�迭�� ũ�Ⱑ �����)
		//����
		list.remove(1); // ������ �������� index�� ����
						// �����ϸ� ���� �����͵��� ������ ��ĭ�� �̵��ؼ� ������� ä���.
		
	}
	public void checkGeneric() {
		// ���׸��� ����ϴ� ���
		// Ÿ��<���׸�Ÿ��> �����̸�; //<- ���׸�Ÿ���� Ŭ������ ����
		//ArrayList<String> list = new ArrayList<>();
		
		// list.add(123); Ÿ���� ���� �ʴ´�. Generic�� ���� ����(���� Object�� �޾Ƶ帲)
		// ArrayList list = new ArrayList(); �� �ϸ� Object�� �����Ƿ� ����
		
		/*
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("Hello");
		list.add(new Item());
		list.add(new Student());
		
		System.out.println(list.get(3));
		// ���׸��� ���� ������ �ϴ� print�� �ּҸ� �ް� �Ǹ�
		// ���� for���� Object�θ� �ް� �ȴ�.
		// for(Object object : list){
		   		Item item = (Item) object;
		   }
		// �� ���� ���
		*/
		
		ArrayList<Item> list = new ArrayList<>();
		
		list.add(new Item());
		for(Item item : list) {
			
		}
	}
	
	public void checkSet() {
		//Set�� ����ü�� �ƴ�
		HashSet<String> set = new HashSet<>();
		set.add("Hello");
		set.add("Good to see you");
		set.add("Hello"); //�ߺ��� ��
		set.add("dfdf");
		
		//����
		set.remove("dfdf");
		
		// ��ȭ�� for������ �ݺ� ����
		/*
		 * for(String item : set){
		 * 		System.out.println(item);
		 * }
		 */
		
		//set�� iterator �� �޾Ƽ� ������� ó���� �� �� �ִ�. ��ġ listó��
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); //object������ ������ �ȴ�.
		}
		
	}
	//Key, Value�� ������ ���� ��ü�迭
	public void checkMap() {
		//map���� interface
		//����
		HashMap<String, Integer> map = new HashMap<>(); //String�� key�� Integer�� Value�� ����
		//�Է�
		map.put("key01",123456);
		map.put("key02",1234561234);
		// map.put("1234, "sdfef"); //<- �̴� ����
		//��ȸ
		System.out.println(map.get("key01"));
		
		//map�� �ݺ��� �Ұ���
		//���� �ݺ������� ó���ϱ�
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(map.get(key));
		}
	}

}