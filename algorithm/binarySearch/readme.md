## 이분 탐색(이진탐색)
분할해서 찾는 방식이고 단순 탐색 즉 처음부터 찾는 방식보다 빠르다.
과정은 아래와 같음 (이분 탐색을 하고자 할 때 이미 정렬이 되어함)

1. low, high을 더해서 절반을 mid값으로
2. mid 값과 key값을 비교
3. 비교할때 key보다 작으면 mid+1 크면 mid-1
4. low <= high가 될때까지 반복
 
단순 탐색은 시간복잡도가 O( n ) 
이분 탐색은  O( log(n) )
 
* [구현 파일](src/main/java/com/algorithm/guide/BinarySearch.java)
* [문제 링크](https://programmers.co.kr/learn/courses/30/parts/12486)
