package miscellaneous;

public class TypeWrappers {
    public static void main(String[] args) {
        char a ='a';
        Character ch = Character.valueOf(a);
        char b = ch.charValue();
        System.out.println(b);

        String n = "10";
        Integer n1 = Integer.valueOf(n);
        int n2 = n1.intValue();
        System.out.println(n2);


        //don't need above
        Integer iob = 100;
        int i = iob;
        System.out.println(iob + " " + i);

        System.out.println(getInt(100));

        System.out.println(++iob);

    }

    static int getInt(Integer i){
        return i;
    }
}
