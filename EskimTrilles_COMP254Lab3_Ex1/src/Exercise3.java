import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class Exercise3 {
    public static Boolean find(File path, String filename) {

        //flag used to exit the recursion
        boolean fileFound = false;

        //checks if the path is a directory
        if (path.isDirectory()) {

            //pathList variable stores the list of every item in a path/directory
            File[] pathList = path.listFiles();

            //loops throughout the list of Files for every path
            for (File subPath : pathList) {

                //accesses the individual file from the list as argument to call
                //the method recursively and storing the return value a variable
                fileFound = find(subPath, filename);

                //triggers an exit to the recursion if the method found
                //the correct file
                if (fileFound) {
                    return fileFound;
                }
            }

            //checks if the path is a file
        } else if (path.isFile()) {

            //checks the path's string value if the same as with the
            //filename string value
            if (path.getName().equals(filename)) {

                //creates a list to store all the subfolders and files
                //of within the directory where the file is located
                File[] dirList = path.getParentFile().listFiles();

                System.out.println("Folders and Files with " + filename);

                //stores the absolute path of the file
                String absPath = path.getAbsolutePath();
                System.out.println(absPath);

                //loops throughout the file list within the file's
                //parent folder and print all its content
                for (File subPath : dirList) {
                    System.out.println(dirList.length);
                    System.out.println("\n" + subPath.getName());
                }

                //confirmation message that the file was found
                System.out.println(filename +" found from " + path.getName());

                //returns the boolean true
                fileFound = true;
            }

            //cheks if the path is null or not existing
        } else if(path == null) {
            System.out.println("File or Folder does not exist.");
        }else {
            System.out.println("Searching the next Directory...");
        }
        return fileFound;
    }
}
