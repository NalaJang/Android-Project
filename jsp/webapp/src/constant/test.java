package constant;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test {

	public static void main(String[] args) {
//		System.out.println(Signals.MSG.getSigal());
//		String text = "85585/@4444/8888";
//		StringTokenizer st = new StringTokenizer(text, "/@");
//		while(st.hasMoreElements()) {
//			String token = st.nextToken();
//			System.out.println(token);
//		}
//		String sts [] = text.split("/@--");
//		for(int i = 0 ; i < sts.length; i++) {
//			System.out.println(i+"번째"+sts[i]);
//		}

		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String , Integer>();
		map.put("ȫ�浿1", 85);
		map.put("ȫ�浿2", 90);
		map.put("ȫ�浿2", 80);
		map.put("ȫ�浿3", 95);
		System.out.println(" �� Entry �� : " + map.size());
		// ��ü ã��
		System.out.println("\tȫ�浿2: " + map.get("ȫ�浿2"));
		System.out.println();
		// ��ü�� �ϳ��� ó��
		Set <String> keyset = map.keySet();        //map.keySet() key���� ������ ��  //Set <String> ������ Ű���� �����ϴ� ��ġ
		Iterator <String> iterator = keyset.iterator();  // Iterator �ݺ��ϴ� keyset�� ������ŭ �ݺ��ϴ�
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// ��ü ����
		map.remove("ȫ�浿2");
		System.out.println(" �� Entry �� : " + map.size());
	}

}
