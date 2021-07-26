package RevBook3_Part2;

public class RevPro13 {
	public static void main(String[] args) {
		 int M[][]={{47,75,80},{52,81,76}};
		  int p;
		  for ( int i = 0; i < 2; i++ )
		  {
		    p=0;
		    for ( int j = 0; j < 3; j++ )
		    {
		      p+=M[i][j];
		    }
			float pm=(float) p/3;
			System.out.println(pm+" ");
			System.out.println();
	}
}
}
