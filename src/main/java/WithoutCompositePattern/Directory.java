package WithoutCompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    String directoryName;
    List<Object> innerFiles = new ArrayList<>();

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void add(Object object) {
        innerFiles.add(object);
    }

    public void ls(){

        for(Object object : innerFiles){
            if(object instanceof File){
                File f = (File) object;
                f.ls();
            }
            else if(object instanceof Directory){
                Directory d = (Directory) object;
                d.ls();
            }
        }
    }
}
