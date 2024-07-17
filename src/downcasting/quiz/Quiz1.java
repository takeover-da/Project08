package downcasting.quiz;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {

		ArrayList<Animal> anilist = new ArrayList<Animal>();
		
//		Human human = new Human();
		
		anilist.add(new Human);
		anilist.add(new Tiger());
		anilist.add(new Eagle());
		
		for(Animal ani : list) {
		
			if(ani instanceof Human) {
				
				Human h = (Human)ani;
				h.readBook();
			}
		}

	}
}

