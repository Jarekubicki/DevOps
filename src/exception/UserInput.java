package exception;

import java.util.Scanner;

/**
 * Created by BIURO22 on 2023-03-13
 */
public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public int enterNoConnectors() {
        System.out.println("Enter number of connectors:");
        try {
            int connectors = scanner.nextInt();
            if (connectors > 10) {
                throw new noConnectorsExceededException("Number of connectors exceeded.");
            }
            return connectors;
        } catch (NumberFormatException nfe) {
            System.out.println("Incorrect number format.");
        } catch (noConnectorsExceededException nce) {
            System.out.println(nce.getMessage());
        }
        return enterNoConnectors();
    }


    public int enterFileSize() {
        System.out.println("Enter file size:");
        try {
            int fileSize = scanner.nextInt();
            if(Integer.toString(fileSize).length() > 4) {
                throw new incorrectFileSizeException("Incorrect file size.");
            }
            return fileSize;
        } catch (incorrectFileSizeException ifs) {
            System.out.println(ifs.getMessage());
        }
        catch (NumberFormatException nfe) {
            System.out.println("Incorrect number format.");
        }
        return enterFileSize();
    }


    public String enterFilePath() {
        System.out.println("Enter file path:");
        try {
            String filepath = scanner.nextLine();
            if(filepath.isEmpty()) {
                throw new emptyFilePathException("File path can not be empty.");
            }
            return filepath;
        } catch (emptyFilePathException fpe) {
            System.out.println(fpe.getMessage());
        }
        return enterFilePath();
    }




}
