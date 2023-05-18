package example01;

import example02.Node;

public class NodeString {
    private String value;

    public NodeString next; // ссылка на такой же объект в памяти

    public NodeString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
