import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class Exercise3 {
    public static Boolean find(File path, String filename) {

        //flag used to exit the recursion
        boolean fileFound = false;

        //checks if the path is a directory
        if (path.isDirectory()) {

            //pathList variable to store the list of files in a path/directory
            File[] pathList = path.listFiles();

            //loops throughout the list of Files
            for (File subPath : pathList) {

                //System.out.println("This is the file: " + path.getName());
                fileFound = find(subPath, filename);
                if (fileFound) {
                    return fileFound;
                }
            }
        } else if (path.isFile()) {
            if (path.getName().equals(filename)) {
                File[] dirList = path.getParentFile().listFiles();

                System.out.println("Folders and Files with " + filename);

                String absPath = path.getAbsolutePath();
                System.out.println(absPath);
                for (File subPath : dirList) {
                    System.out.println(dirList.length);
                    System.out.println("\n" + subPath.getName());
                }
                System.out.println(filename +" found from " + path.getName());
                fileFound = true;
            }
        } else if(path == null) {
            System.out.println("File or Folder does not exist.");
        }else {
            System.out.println("Searching the next Directory...");
        }

        return fileFound;
    }
}
