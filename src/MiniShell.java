import java.util.Scanner;

public class MiniShell {
    public static void main(String[] args) {
        ShellCommandHandler shell = new ShellCommandHandler();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Show current path of the project as prompt
            System.out.print(shell.getCurrentDirectory().getAbsolutePath() + " > ");
            String line = scanner.nextLine().trim();

            // Terminate The Process
            if (line.equals("exit")) {
                break;
            }

            String[] parts = line.split("\\s+"); // This cuts the sentence into separate words at every space/tab/new line etc and stores them into an array
            String cmd = parts[0];

            switch (cmd) {
                case "pwd":
                    shell.printWorkingDirectory();
                    break;
                case "ls":
                    shell.listDirectory();
                    break;
                case "mkdir":
                    if (parts.length > 1) {
                        shell.makeDirectory(parts[1]);
                    } else {
                        System.out.println("Usage: mkdir <name>");
                    }
                    break;
                case "touch":
                    if (parts.length > 1) {
                        shell.createFile(parts[1]);
                    } else {
                        System.out.println("Usage: touch <name>");
                    }
                    break;
                case "cd":
                    if (parts.length > 1) {
                        shell.changeDirectory(parts[1]);
                    } else {
                        System.out.println("Usage: cd <directory>");
                    }
                    break;
                case "help":
                    shell.printHelp();
                    break;
                default:
                    System.out.println("Unknown command. Type 'help' to see available commands.");
            }
        }

        scanner.close();
        System.out.println("Goodbye 👋");
    }
}
