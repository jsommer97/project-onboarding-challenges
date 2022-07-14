import models.LinkedList;
import models.Node;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Node five = new Node(5);
        Node four = new Node(4, five);
        Node three = new Node(3, four);
        Node two = new Node(2, three);
        Node one = new Node(1, two);

        LinkedList list1 = new LinkedList(one);

        Node ten = four;
        Node nine = new Node(9, ten);
        Node eight = new Node(8, nine);
        Node seven = new Node(7, eight);
        Node six = new Node(6, seven);

        LinkedList list2 = new LinkedList(six);
        System.out.println("Intersection: ");
        System.out.println(intersect(list1, list2).toString());

        LinkedList loopedList = list1.insert(list1, three);
        System.out.println("Loop: ");
        System.out.println(loopDetection(loopedList).toString());
    }

    public static Node intersect(LinkedList list1, LinkedList list2) {
        Node pointer = list1.head;
        Node check = list2.head;

        while(pointer != null) {

            while(check != null) {
                if(pointer.equals(check)) {
                    return check;
                }
                check = check.next;
            }
            check = list2.head;
            pointer = pointer.next;
        }
        return null;
    }

    public static Node loopDetection(LinkedList list) {

        ArrayList<Node> foundNodes = new ArrayList<>();
        Node pointer = list.head;

        while(pointer != null) {
            if (foundNodes.contains(pointer)) {
                return pointer;
            }

            foundNodes.add(pointer);
            pointer = pointer.next;
        }
        return null;
    }
}
