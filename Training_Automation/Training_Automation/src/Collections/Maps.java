package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;

public class Maps {
	static void trail1() {
		HashMap <Integer , String> hm = new HashMap<Integer,String>();
		hm.put(33, "vamsi");
		hm.put(24, "vamsikis");
		hm.put(199, "mourta");
		System.out.println(hm);
//		System.out.println(hm.containsKey(1));
//		System.out.println(hm.size());
//		System.out.println(hm.entrySet());
//		for(Entry<Integer, String> data:hm.entrySet())
//		{
//			System.out.println(data.getKey()+"-------------------------------"+data.getValue());
//		}

	}
	static void trail2() {
		HashMap vam = new HashMap();
		vam.put("name", "vamsi");
		vam.put("id", 4112);
		vam.put("org", "Maveric");
		vam.put("vlg", "vamsi");
		System.out.println(vam);
		System.out.println(vam.entrySet());
		Map.Entry ob = (Entry) vam.entrySet();
//		for(Map.Entry mm : ob) {
//			
//		}
	}
	public static void main(String[] args) {
	trail1();
	
	}

}
