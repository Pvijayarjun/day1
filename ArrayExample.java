package secondproject;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] sMarks={23.8f,78.8f,89.9f,90.08f};//static array
		System.out.println(sMarks);
		//repeating
		System.out.println(sMarks[0]);
		System.out.println(sMarks[1]);
		System.out.println(sMarks[2]);
		 
		System.out.println("******************");// by adding loop
		for(int n=0; n<sMarks.length; n++)
		{
		System.out.println(sMarks[n]);
		}

	}

}
