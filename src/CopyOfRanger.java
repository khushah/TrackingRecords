import java.util.*;


public class CopyOfRanger {
	
	static LinkedList<Integer>ll= new LinkedList<Integer>();
    static HashMap<Integer,String> hm= new HashMap<Integer,String>();
	public static void main (String args[]){
		addFirstTrackingRecord(1,100000,"a1");
		addStartingTrackingRecord(12000,13000,"b1");
		System.out.println(ll);
		System.out.println(hm);
		
	}
	public static void addFirstTrackingRecord(int start, int end, String statuscode){
		
		ll.add(start);
		hm.put(start,statuscode);
		
				ll.add(end);
				hm.put(end+1, "-1");
	
		
		
	}
public static void addStartingTrackingRecord(int start,int end,String statuscode){
		int toAddIndex1=0;
		int toAddIndex2=0;
		List<Integer> toDeletList =new ArrayList<Integer>();
	for(int i=0;i<ll.size();++i){
		
		if(ll.get(i)>start){
			if(toAddIndex1==0)
			{toAddIndex1=i;
			//System.out.println(toAddIndex);
			}
			
		}
		if(ll.get(i)<=end){
			toDeletList.add(i);
			
			
		}else{
			toAddIndex2=i;
		}
		
		
	}
	ll.add(toAddIndex1,start);
	ll.add(toAddIndex2,end);
	hm.put(start, statuscode);
	hm.put(end, "-1");
	Collections.sort(toDeletList);
	
	for(int i=toDeletList.size()-1;i>=0;--i){
		hm.remove(toDeletList.get(i));
		ll.remove(toDeletList.remove(i));
		
	}
	
		
	}


}



