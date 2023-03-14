package exception;

/**
 * Created by BIURO22 on 2023-03-13
 */
public class FileHandler {

    private String filePath;
    private int noConnectors;
    private int maxFileSize;

    public FileHandler(String filePath, int noConnectors, int maxFileSize) {
        this.filePath = filePath;
        this.noConnectors = noConnectors;
        this.maxFileSize = maxFileSize;
    }

    public void readContent() {
        System.out.println("READ: Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
    }

    public void writeContent() {
        System.out.println("WRITE: Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setNoConnectors(int noConnectors) {
        this.noConnectors = noConnectors;
    }

    public void setMaxFileSize(int maxFileSize) {
        this.maxFileSize = maxFileSize;
    }
}
