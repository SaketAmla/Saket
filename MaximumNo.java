class MaximumNo
{
  public static void main(String [] arg)
   {
	 int[] a = {10,20,30,40,50};
	 
     int max = a[0];
  
     for(int j=1; j<a.length; j++)
	 {
	     if(a[j]> max)
		 {
		  max = a[j];
         }
	  
     }
	System.out.print("Maximum No is ="+ max); 
  }
 
}