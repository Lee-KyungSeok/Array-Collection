package com.kyungseok.collection;

public class ArrayStudy {
	
	public void checkArray() {
		// ����
		// Ÿ�� �̸�[] = new Ÿ��[�迭����ũ��];
		//�⺻���� int, long ���� ������ �Ҵ��ϴ� �͸����� �⺻������ 0�� �Ҵ�
		int intArray[] = new int[10];
		System.out.println(intArray[7]);
		
		//new �� ũ�⸸ �Ҵ��� �ִ� ��
		Item itemArray[] = new Item[10];
		// System.out.println(itemArray[7].getMyName()); �̷��� �ϸ� ����
		// �Ʒ��� ���� Object�� Array�� �� ��� new�� ���־�� �Ѵ�.
		
		// �ݺ��� �ȿ��� �ٷ� length�� �����ϴ� ���� ������� �ʴ´�.
		int itemLength = itemArray.length;
		for(int i=0 ; i<itemLength ; i++) {
			itemArray[i] = new Item();
		}
		System.out.println(itemArray[7].getMyName());
	}

}
