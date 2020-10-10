package pattern.command.commands;

import pattern.command.fs.FileSystemReceiver;

public class ReadFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public ReadFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    public void execute() {
        this.fileSystem.readFile();
    }

}
