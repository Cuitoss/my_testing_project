package algstudent.s11;

public class Vector5 {
static int[]v;
static int[]w;
	
	public static void main(String arg []) {
		int repetitions = 100;// Integer.parseInt(arg[0]);
		long t1,t2;
		
		
		for (int n=10; n<=Integer.MAX_VALUE; n*=2){ //n is increased *5   
			  v = new int[n];
			  w = new int[2];
			  Vector1.fillIn(v);

			  
			  t1 = System.currentTimeMillis();
			  //We have to repeat the whole process to be measured
			  for (int repetition=1; repetition<=repetitions; repetition++){    	
			     Vector1.maximum(v,w);
			  }
			  t2 = System.currentTimeMillis();
			  System.out.printf("SIZE=%d TIME=%d milliseconds MAX_POS=%d  MAX_VALUE=%d NTIMES=%d\n", n, t2-t1, w[0], w[1], repetitions);	
		}//for 
		
	}//main


}
