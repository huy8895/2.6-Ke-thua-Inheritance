package Cai_de_Nap_Chong;

public class Test {
    public static void main(String[] args) {
        cha b  = new con();
        b.p(20);
        cha[] con1 = new cha[5];
        con1[0] = new con();

    }

}

class con extends cha {
    public void p(int number) {
        System.out.println(number);
    }
}

class cha {
    public void p(int number) {
        System.out.println(number * 2);
    }
}