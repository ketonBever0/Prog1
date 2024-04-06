public class Folder extends FileSystemEntry {

    private FileSystemEntry[] children = null;


    public Folder(Folder parent, String name) {
        super(parent, name);
    }

    public void addChild(FileSystemEntry child) {

        if (this.children == null) {
            FileSystemEntry[] arr = new FileSystemEntry[] {child};
        } else {
            FileSystemEntry[] newArr = new FileSystemEntry[this.children.length + 1];
            System.arraycopy(this.children, 0, newArr, 0, this.children.length);
            newArr[newArr.length - 1] = child;
            this.children = newArr;
        }


    }




}
