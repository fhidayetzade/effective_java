package trhead_stringBuilder_stringBuffer;

public class TestDrive {
    public static void main(String[] args) {
        int n=777777;
        long t;

        {
            StringBuffer sb=new StringBuffer();
            t=System.currentTimeMillis();
            for(int i=n; i-->0;){
                sb.append(" ");
            }
            System.out.println(System.currentTimeMillis()-t);
        }
        {
            StringBuilder sb=new StringBuilder();
            t=System.currentTimeMillis();
            for(int i=n; i>0; i--){
                sb.append(" ");
            }
            System.out.println(System.currentTimeMillis()-t);
        }
    }
}
