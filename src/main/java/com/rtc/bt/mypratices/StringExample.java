public class StringExample {
    public static void main(String[] args) {
        String name[] = {"Tshering","Dolma", "Tenzing", "Lakpa", "Sunil"};
        String nameWithPlus="";
        String nameWithConcat="";
        String nameWithStringBuilder ="";
        String nameWithStringBuffer="";

        StringBuilder strBuilder = new StringBuilder();
        StringBuffer strBuffer = new StringBuffer();
        for(int i=0; i< name.length;i++){
            nameWithPlus += name[i] + " ";
            nameWithConcat = nameWithConcat.concat(name[i] + " ");
            strBuilder.append(name[i] + " ");
            strBuffer.append(name[i] + " ");
        }
        nameWithStringBuilder = strBuilder.toString();
        nameWithStringBuffer = strBuffer.toString();

        System.out.println("With + Operator: "+ nameWithPlus);
        System.out.println("With Concat Operator: "+ nameWithConcat);
        System.out.println("With StringBuffer Operator: "+ nameWithStringBuffer);
        System.out.println("With StringBuilder Operator: "+ nameWithStringBuilder);


    }
}
