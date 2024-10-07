package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    @Qualifier("island2")
    @Autowired
    private Island2 island;

    @Override
    public String toString() {
        return "На свете есть океан , " + island.toString();
    }
}
