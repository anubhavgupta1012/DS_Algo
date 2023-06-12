package HashMapImplementation;

import java.util.Objects;

public class CHashMap<K, V> {

    private static final int capacity = 16;
    private Node<K, V>[] nodes = new Node[capacity];

    public void add(K key, V value) {
        int hash = key.hashCode();
        int index = hash % capacity;

        Node<K, V> node = nodes[index];
        Node newNode = new Node(key, value, hash, null);

        if (Objects.isNull(node)) {
            nodes[index] = newNode;
        } else {
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    public V get(K key) {
        int hash = key.hashCode();
        int index = hash % capacity;

        Node<K, V> node = nodes[index];
        while (node != null) {
            if (Objects.equals(node.hash, hash) && Objects.equals(node.key, key)) return node.value;

            node = node.next;
        }
        return null;
    }

    public boolean delete(K key) {
        int hash = key.hashCode();
        int index = hash % capacity;
        Node<K, V> node = nodes[index];

        Node<K, V> prev = node;
        while (Objects.nonNull(node)) {

            if (Objects.equals(node.hash, hash) && Objects.equals(node.key, key)) {
                prev.next = node.next;
                node= null;
                return true;
            }
            prev = node;
            node = node.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; i < 15; ) {
            Node<K, V> node = nodes[i];
            if (node == null)
                continue;

            stringBuilder.append("{" + node.key + ":" + node.value + "}");
            if (node.next != null) {
                stringBuilder.append(",");
                node = node.next;
            } else {
                stringBuilder.append(",");
                i++;
            }


        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    static class Node<K, V> {
        private K key;
        private V value;
        private int hash;
        private Node next;

        public Node(K key, V value, int hash, Node next) {
            this.key = key;
            this.value = value;
            this.hash = hash;
            this.next = next;
        }
    }
}


class TestCHashMap {
    public static void main(String[] args) {
        CHashMap<Integer, String> cHashMap = new CHashMap();
        cHashMap.add(1, "ANUBHAV");
        cHashMap.add(2, "SANDEEP");
        cHashMap.add(3, "PARIVESH");
        cHashMap.add(4, "DHEERAJ");
        System.out.println(cHashMap.get(1));
        System.out.println(cHashMap.get(2));
        System.out.println(cHashMap.get(3));
        System.out.println(cHashMap.get(4));
        System.out.println(cHashMap.get(5));
        System.out.println(cHashMap.get(6));

        cHashMap.delete(1);
        cHashMap.delete(3);

        System.out.println("after delete");
        System.out.println(cHashMap.get(1));
        System.out.println(cHashMap.get(2));
        System.out.println(cHashMap.get(3));
        System.out.println(cHashMap.get(4));


    }
}