import java.util.ArrayList;
public class Phonepermutations
{
    public static void strPhonePerm(ArrayList<String> ar,StringBuilder  fs,StringBuilder s,int i)
    {
        if(fs.length()==i)
        {
            ar.add(s.toString());
            return;
        }
        if(i>fs.length())
            return;
        char d;
        if(i<fs.length())
        {
            if((int)fs.charAt(i) - 48 !=0)
                {
                int c=((int)fs.charAt(i))-48;
                 d=(char)(c+96);
                strPhonePerm(ar,fs,s.insert(i,d),i+1);
                s.deleteCharAt(s.length()-1);
                }
            else
            {
            return;
            }
                if(i+1<fs.length())
                {
                int a=Integer.parseInt(fs.toString().substring(i,i+2));
            
            if(a>0 && a<=26)
            {
                int k=a+96;
                d=(char)k;
                strPhonePerm(ar,fs,s.insert(i,d),i+2);
                s.deleteCharAt(s.length()-1);
            }
                }
        }    
    }
	public static void main(String[] args) {
	            ArrayList<String> combinations = new ArrayList<>();
	            StringBuilder fs= new StringBuilder("23");
	            StringBuilder s= new StringBuilder("");
	            strPhonePerm(combinations,fs,s,0);
	            for(String a:combinations)
	                System.out.println(a);
		
	}
}
