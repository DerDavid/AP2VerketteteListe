/**
 * Created by derdavid on 27/09/15.
 */
public class Main {


    public static void main(String[] args) {
        EinfachVerketteteListe list = new EinfachVerketteteListe();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.insertAfter("2", "neu");
        //list.delete("3");
        list.writeList();
        System.out.println("erstes Element: " + list.getFirstElem().getObj());
        System.out.println("ist '3' enthalten? " + list.find("3"));
        System.out.println("ist '5' enthalten? " + list.find("5"));
        System.out.println("letztes Element: " + list.getLastElem().getObj());
    }
}

