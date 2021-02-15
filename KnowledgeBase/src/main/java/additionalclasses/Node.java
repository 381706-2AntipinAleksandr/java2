package additionalclasses;

import java.util.HashMap;

public class Node {
    private String headline;
    private String text;
    private HashMap<String, byte[]> files;

    public Node(String _headline, String _text) {
        headline = _headline;
        text = _text;
        files = new HashMap<String, byte[]>();
    }

    public String GetText() {
        return text;
    }

    public String GetHeadline() {
        return headline;
    }

    public void SetFile(String name, byte[] file) {
        files.put(name, file.clone());
    }

    public byte[] GetFile(String name) {
        return files.get(name);
    }
}