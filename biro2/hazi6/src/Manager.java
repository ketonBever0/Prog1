public class Manager {

    private Namer namer;
    private Folder imagesFolder;
    private Folder etcFolder;


    public Manager(Namer namer, Folder rootFolder) {
        this.namer = namer;
        this.imagesFolder = new Folder(rootFolder, "images");
        this.etcFolder = new Folder(etcFolder, "etc");
    }

    public File upload(String fileName, long size) {
        File f = new File(
                fileName.endsWith(".jpg") ||
                        fileName.endsWith(".png") ||
                        fileName.endsWith(".gif") ?
                        imagesFolder
                        :
                        etcFolder,
                fileName, size);

        namer.rename(f);

        System.out.printf("Stored %s at %s%n", f.getName(), f.fullPath());
//        System.out.printf("Images size: %d", f.size());

        return f;

    }
}
