package Lab.Commands;

import java.io.Serializable;

public class Meta implements Serializable {
    private static final long serialVersionUID = 4562371567263178L;
    Meta(String name, Element element){
        this.name=name;
        this.element=element;
    }
    String name;
    Element element;
}
