/**
 * Created by derdavid on 27/09/15.
 */


public class EinfachVerketteteListe {

    ListElement startElem = new ListElement("Kopf");

    public EinfachVerketteteListe() {
    }

    public void addLast(Object o) {
        ListElement newElem = new ListElement(o);
        ListElement lastElem = getLastElem();
        lastElem.setNextElem(newElem);
    }

    public void insertAfter(Object prevItem, Object newItem) {
        ListElement newElem, nextElem, pointerElem;
        pointerElem = startElem.getNextElem();
        while (pointerElem != null && !pointerElem.getObj().equals(prevItem)) {
            pointerElem = pointerElem.getNextElem();
        }
        newElem = new ListElement(newItem);
        nextElem = pointerElem.getNextElem();
        pointerElem.setNextElem(newElem);
        newElem.setNextElem(nextElem);
    }

    public void delete(Object o) {
        ListElement le = startElem;
        while (le.getNextElem() != null && !le.getObj().equals(o)) {
            if (le.getNextElem().getObj().equals(o)) {
                if (le.getNextElem().getNextElem() != null)
                    le.setNextElem(le.getNextElem().getNextElem());
                else {
                    le.setNextElem(null);
                    break;
                }
            }
            le = le.getNextElem();
        }
    }

    public boolean find(Object o) {
        ListElement le = startElem;
        while (le != null) {
            if (le.getObj().equals(o))
                return true;
            le = le.nextElem;
        }
        return false;
    }

    public ListElement getFirstElem() {
        return startElem;
    }

    public ListElement getLastElem() {
        ListElement le = startElem;
        while (le.getNextElem() != null) {
            le = le.getNextElem();
        }
        return le;
    }

    public void writeList() {
        ListElement le = startElem;
        while (le != null) {
            System.out.println(le.getObj());
            le = le.getNextElem();
        }
    }

}


