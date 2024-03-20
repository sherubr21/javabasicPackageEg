public class MyfirstClass {
private static String village="wamrong";
    public void helleworld(){
         System.out.println("hellow world");
        System.out.println(village);

    }
    public void nameaddress(String name,String address){
        System.out.println("name:"+name);
        System.out.println("address:"+address);


    }
    public void addnumberwitoutpassingvarible(){
        int a=1;
        float b=2.0f;
        double c= 3.1;

        double sum=a+b+c;


        System.out.println("sum using int:"+((int)sum));
        System.out.println("sum using Float:"+((float)sum));
        System.out.println("sum using double:"+sum);


    }
    public void addnumber(int a,float b,double c){
        double sum=a+b+c;
        System.out.println("sum using int:"+((int)sum));
        System.out.println("sum using Float:"+((float)sum));
        System.out.println("sum using double:"+sum);


    }
    public static void main(String args[]){
        String name="pema lhamo",address="thimphu";
        int a=5;
        float b=2.09f;
        double c=3.00d;
        MyfirstClass obj= new MyfirstClass();
        obj.helleworld();
        obj.nameaddress(name,address);
        obj.addnumberwitoutpassingvarible();
        obj.addnumber(a,b,c);


    }
}
