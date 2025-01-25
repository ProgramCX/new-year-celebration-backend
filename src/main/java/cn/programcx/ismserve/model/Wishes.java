package cn.programcx.ismserve.model;

public class Wishes {
    private int id;
    private String content;
    private String name;
    private long loves;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public long getLoves() {
        return loves;
    }
    public void setLoves(long loves) {
        this.loves = loves;
    }
}
