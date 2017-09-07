# Array / Collection
Array 및 Collection 개념


## Array
배열 / 이차배열 / 다중 배열
1. __배열의 선언__
>* 배열을 생성하기 위해서는 배열을 선언한다.
>* int long 등은 기본적으로 '0'이 초기화 된다.

```java
//10 개의 int 값 선언
int intArray[] = new int[10];

//아래와 같이초기화 가능
char [] alphabat = {'A', 'B', 'C'}
```
>* ※ Object를 Array로 설정하였을 경우 new 실행 시 공간만 할당한 것이므로 아래와 같이 각각의 요소에 값을 새로 할당해주어야 한다.

```java
class ObjectArray {
	//10 개의 Object 값 선언
	Item itemArray[] = new Item[10];

	// 반복문 안에서 바로 length를 지정하는 것은 권장되지 않는다.
	int itemLength = itemArray.length;
	for(int i=0 ; i<itemLength ; i++) {
    // 새로 할당
	  itemArray[i] = new Item();
	}
	System.out.println(itemArray[7].getMyName());
}

class Item{
	private String myName = "지코";
	public String getMyName(){
		return myName;
	}
}
```

2. __dd__

## Collection
List / Set / Hash
1. __List__
> ddd


## 참고 문제
Array / Collection을 활용한 문제
1. [로또 문제](https://github.com/Lee-KyungSeok/LottoExample)
2. [Memo 문제](https://github.com/Lee-KyungSeok/MemoExample)
