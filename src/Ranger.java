import java.util.*;


public class Ranger {
	
	static LinkedList<Integer>ll= new LinkedList<Integer>();
    static HashMap<Integer,String> hm= new HashMap<Integer,String>();
	public static void main (String args[]){
		addFirstTrackingRecord(1,100000,"a1");
		addStartingTrackingRecord(12000,13000,"b1");
		//addStartingTrackingRecord(11000,11500,"c1");
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
		int length=ll.size();
		System.out.println("size="+length);
		String prev="";
	for(int i=0;i<length;++i){
		System.out.println("im in for");
	prev=hm.get(ll.get(i));
	System.out.println("testing"+ll.get(i)+" -- "+start);
		if(ll.get(i)>start){
			if(toAddIndex1==0)
			{
				ll=addToList(ll,i,start);
				hm.put(ll.get(i), statuscode);
				toAddIndex1++;
			//System.out.println(toAddIndex);
			}
			
		}
		if(ll.get(i)<=end){
			if(toAddIndex1!=0)
			{
				hm.put(ll.get(i), "-2");
			
			}
			
		}else{
			
			ll=addToList(ll,i,end);
			
		}
		
		//length=ll.size();
	}

		
	}

private static LinkedList<Integer> addToList(LinkedList<Integer> ll2, int i,
		int start) {
	System.out.println("to add at"+i+"value="+start);
	LinkedList<Integer> ll=new LinkedList<Integer>(ll2);
	ll.add(i, start);
	return ll;
}


}



