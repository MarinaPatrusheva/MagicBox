public class Main {
    public static void main(String[] args) {
        MagicBox ntw = new MagicBox(2);
        Something smth = new Something();
        if(ntw.add(smth)){
         System.out.println("Объект добавлен!");
        }else{
            System.out.println("Объект не добавлен!");
        }
        AnotherSomething asmth = new AnotherSomething();
        if(ntw.add(asmth)){
            System.out.println("Объект добавлен!");
        }else{
            System.out.println("Объект не добавлен!");
        }
        Thing th = new Thing();
        if(ntw.add(th)){
            System.out.println("Объект добавлен!");
        }else{
            System.out.println("Объект не добавлен!");
        }
        System.out.println(ntw.pick().getClass().getName());

    }
}