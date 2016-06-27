package Main;


import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Company> list = new ArrayList<Company>();
		list.add(new Company("HP", 2000));
		list.add(new Company("Ubisoft", 10000));
		list.add(new Company("BPB", 3000));
		list.add(new Company("Ejko", 7500));
		list.add(new Company("Bejko",12000));
		
		Company temp = new Company("", 0);
		int tempIndex = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if(temp.getCount() < list.get(i).getCount()){
				temp = list.get(i);
				tempIndex = i;
			}
		}
		list.remove(tempIndex);
		
		for(Company a: list) {
			
		System.out.println(a.getName());
			
		}
	}

}