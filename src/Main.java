public class Main {

    public static void main(String[] args) {

        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.addFirst(34);
        customLinkedList.addLast(23);
        customLinkedList.deleteFirst();
        customLinkedList.addLast(43);

        System.out.println(customLinkedList);
        System.out.println(customLinkedList.contains(12));
        System.out.println(customLinkedList.contains(23));
        System.out.println(customLinkedList.contains(43));
        System.out.println(customLinkedList.indexOf(34));
        System.out.println(customLinkedList.indexOf(23));
        System.out.println(customLinkedList.indexOf(43));
    }
}
