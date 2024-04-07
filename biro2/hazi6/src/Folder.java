public class Folder extends FileSystemEntry {

    private FileSystemEntry[] children = null;


    public Folder(Folder parent, String name) {
        super(parent, name);
    }

    @Override
    public long size() {
        if (children == null || children.length == 0) return 0;

        long sumSize = 0;

        for (FileSystemEntry child : children) {
            sumSize += child.size();
        }

        return sumSize;

    }

    public void addChild(FileSystemEntry child) {

        if (this.children == null) {
            this.children = new FileSystemEntry[] {child};
        } else {
            FileSystemEntry[] newArr = new FileSystemEntry[this.children.length + 1];
            System.arraycopy(this.children, 0, newArr, 0, this.children.length);
            newArr[newArr.length - 1] = child;
            this.children = newArr;
        }


    }




}
