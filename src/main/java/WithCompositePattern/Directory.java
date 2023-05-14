package WithCompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    public String name;

    List<FileSystem> fileSystems = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void ls() {

        // NOTE THAT HERE YOU DONT REQUIRE TO WRITE THE IF ELSE STATEMENTS

        for(FileSystem fileSystem : fileSystems){
            fileSystem.ls();
        }
    }

    public void add(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }
}
