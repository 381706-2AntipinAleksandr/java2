package additionalclasses;

public class Label {
    private String text;
    private int nodes[];
    private int count;

    public Label(String _text) {
        text = _text;
        nodes = new int[10];
        count = 0;
    }

    public String GetText() {
        return text;
    }

    public void AddNode(int id) {
        if (count < 10) {
            nodes[count] = id;
            count++;
        }
    }

    public int[] GetNodes() {
        return nodes;
    }

    public int GetCount() {
        return count;
    }
}