package collectionTest.HachSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

java.util.HashSet;

public class HashSet {
	public static void main(String[] args) {
		HashSet<String> mbti Type  = new HashSet<String>();
		
		mbtiType.add("ENFP"); 
		mbtiType.add("INFJ"); 
		mbtiType.add("ISFP"); 
		mbtiType.add("ENFP"); 
		mbtiType.add("ENFP"); 
		mbtiType.add("ENTP");
		System.out.println(mbtiType);
		
//		Iterator
//		순서가 없을 때 순서를 부여하는 자료구조
		Iterator<String> iter = mbtiType.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		중복된 데이터 삭제
		ArrayList<Integer> datas = new ArrayList()<Integer> (Arrays.asList(1,2,3,4,4,9,9,9));
		datas = ArrayList<Integer>(new HachSet<Integer>(datas));
		System.out.println(datas);
				
		
	}
}
