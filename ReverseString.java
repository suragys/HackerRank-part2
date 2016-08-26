package easy;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseDivideString("helloworld"));
	}
	
	    public String reverseString(String s) {
         //return new StringBuffer(s).reverse().toString();
         char[] st = s.toCharArray();
         //int len = st.length;
         //int delimiter = len/2;
         //for(int i = 0; i < delimiter; i++){
         //    char temp = st[i];
         //    int x = len -1 -i;
         //    st[i] = st[x];
         //    st[x] = temp;
         //}
         
        char[] array=s.toCharArray();
        int start = 0;
        int end = array.length-1;
        while(start<end){
             char temp=array[start];
             array[start]=array[end];
             array[end]=temp;
             start++;
             end--;
        }
         
        // can use recursion 
        //  if (s.length() <= 1) {
	    //     return s;
	    // }
	    // return reverseString(s.substring(1)) + s.charAt(0);
        return new String(array);

        //return new string(st);
        
    }
         

		
	
    }
	



	

}
