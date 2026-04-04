package sortingPackage;

import java.util.Comparator;

public class SemesterComperator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getSem()>o2.getSem())
		{
		return 1;
		}else if(o1.getSem()<o2.getSem())
		{
		return -1;
		}else
		return 0;
	}

}
