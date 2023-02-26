public class Main {
    public static void main(String[] args) {
        MagicBox ntw = new MagicBox(2);
        String sdf = " shew";
        String smth = "1";
        int asmth = 2;
        char th = '3';
        if(ntw.add(smth)){
         System.out.println("Объект добавлен!");
        }else{
            System.out.println("Объект не добавлен!");
        }
        if(ntw.add(asmth)){
            System.out.println("Объект добавлен!");
        }else{
            System.out.println("Объект не добавлен!");
        }
        if(ntw.add(th)){
            System.out.println("Объект добавлен!");
        }else{
            System.out.println("Объект не добавлен!");
        }
        System.out.println(ntw.pick().getClass().getName());
    }
}