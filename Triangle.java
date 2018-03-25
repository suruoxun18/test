package test;

public class Triangle {
	private static int res=0;
	 public int getReuslt(){
	        return res;
	    }
	        
		public void triangle(int a, int b, int c) {
			// TODO Auto-generated method stub
			if(((a+b)>c) && ((a+c)>b && (b+c)>a))
	        {
	            if((a == b) &&(a == c))
	            {
	              res=1;//equilateral
	            }
	            if((a==b && a!=c)||(a==c && a!=b)||(b==c && a!=b))
	            {
	                res=2;//isosceles
	                
	            }
	            if(a!=b && a!=c && b!=c)
	            {
	                res=3;//scalene
	            }
	        }
	        else
	        {
	            res=0;//三边长度无法构成三角形
	        }
			
		}
	
}
