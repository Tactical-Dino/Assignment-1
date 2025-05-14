import java.io.File;
import java.io.IOException;


public class ShellCommandHandler {
    private File currentDirectory;

    // Constructor
    public ShellCommandHandler() {
        // Get the Java Virtual Machine's working directory
        this.currentDirectory = new File(System.getProperty("user.dir"));
    }

    // Print the path of the current directory/file location "pwd"
    public void printWorkingDirectory() {
        System.out.println(currentDirectory.getAbsolutePath());
    }

    public File getCurrentDirectory() {
        return currentDirectory;
    }

   // List all the folders and files in the current directory that's chosen in the path "ls"
    public void listDirectory() {
        File[] items = currentDirectory.listFiles();
        if (items != null) {
            for (File f : items) { //simpler way to loop through each file instead of saying for example for (int i = 0; i < files.length; i++)
                System.out.println(f.getName());
            }
        }
    }

    // Create a new directory inside the current path/directory "mkdir"
    public void makeDirectory(String name) {
        File newDir = new File(currentDirectory, name);
        if (newDir.mkdir()) {
            System.out.println("Directory created: " + name);
        } else {
            System.out.println("Failed to create directory: " + name);
        }
    }

    // Create a new file inside the current directory "touch"
    public void createFile(String name) {
        File newFile = new File(currentDirectory, name);
        try {
            if (newFile.createNewFile()) {
                System.out.println("File created: " + name);
            } else {
                System.out.println("File already exists: " + name);
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    // Change path/directory "cd"
    public void changeDirectory(String name) {
        File target = new File(currentDirectory, name);
        if (target.exists() && target.isDirectory()) {
            currentDirectory = target;
        } else {
            System.out.println("Directory not found: " + name);
        }
    }

    // Print the available commands for this MiniShell
    public void printHelp() {
        System.out.println("Supported commands:\n  pwd           - print working directory\n  ls            - list files and folders\n  mkdir <name>  - make directory\n  touch <name>  - create file\n  cd <name>     - change directory\n  exit          - exit shell\n  help          - show this help");

    }
}
