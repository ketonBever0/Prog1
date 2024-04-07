public abstract class FileSystemEntry {

    private Folder parent;
    private String name;


    public FileSystemEntry(Folder parent, String name) {
        this.parent = parent;
        this.setName(name);
    }

    public abstract long size();

    public String fullPath() {
        return String.format("%s%s", this.parent == null ? "" : this.parent.fullPath() + "/", this.name);
    }

    public void setName(String name) {
        this.name = name;
        if (this.parent != null) this.parent.addChild(this);
    }

    public String getName() {
        return name;
    }
}
