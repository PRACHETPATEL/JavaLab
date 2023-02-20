class Stringbufer {
    public static void main(String[] args) {
        String s1="java";
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);
        String s3=new String("example");
        System.out.println("Using String Class :");
        System.out.println("String 1 : "+s1);
        System.out.println("String 2 : "+s2);
        System.out.println("String 3 : "+s3);
        System.out.println();
        System.out.println("Using StringBuffer Class and its Methods");
        StringBuffer sb = new StringBuffer("Hello Java Developers!!");
        System.out.println("String of string buffer class: "+sb);
        sb.append("Hello");
        System.out.println("After Append method: "+sb);
        sb.delete(2,5);
        System.out.println("After Delete method: "+sb);
        sb.insert(2,"llo");
        System.out.println("After Insert method: "+sb);
        sb.replace(0,5,"Aloha");
        System.out.println("After Replace method: "+sb);
        sb.reverse();
        System.out.println("After Reverse method: "+sb);
        System.out.println("String length: "+sb.capacity());
    }
}
