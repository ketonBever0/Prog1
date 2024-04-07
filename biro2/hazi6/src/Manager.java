public class Manager {

    private Namer namer;
    private Folder imagesFolder;
    private Folder etcFolder;


    public Manager(Namer namer, Folder rootFolder) {
        this.namer = namer;
        this.imagesFolder = new Folder(rootFolder, "images");
        this.etcFolder = new Folder(rootFolder, "etc");
    }

    public File upload(String fileName, long size) {
        boolean isImg = fileName.replace(".bak", "").endsWith(".jpg") ||
                fileName.endsWith(".png") ||
                fileName.endsWith(".gif");
        File f = new File(
                isImg
                        ?
                        this.imagesFolder
                        :
                        this.etcFolder,
                fileName, size);

        namer.rename(f);

        System.out.printf("Stored %s at %s%n", f.getName().replace(".bak", "").replace(".txt", ""),
                String.format("%s/%s", isImg ? this.imagesFolder.fullPath() : this.etcFolder.fullPath(), f.getName()));
        System.out.printf("Images size: %d bytes\n", this.imagesFolder.size());
        System.out.printf("Etc size: %d bytes\n", this.etcFolder.size());

        return f;

    }
}
