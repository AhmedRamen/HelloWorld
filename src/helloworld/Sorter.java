package helloworld;

public class Sorter {
	void sort(Person[] p) {
		for(int i=0;i<p.length;i++) {
			int minindex = i;
			for(int j= i+1; j<p.length;j++) {
				if (p[j].id < p[minindex].id)
					minindex = j;
			}
			Person Pertemp = p[i];
			p[i] = p[minindex];
			p[minindex] = Pertemp;
		}
	}
}
