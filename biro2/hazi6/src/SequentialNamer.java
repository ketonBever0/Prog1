public class SequentialNamer implements Namer {

    private int index = 1;


    @Override
    public void rename(FileSystemEntry file) {
        file.setName(file.getName() + "_" + this.index);
        this.index++;
    }
}
