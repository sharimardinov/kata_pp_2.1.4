package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Deth8 {
    private String id;

    @Autowired
    public Deth8() { this.id = " смерть Кощея на игле :("; }

    @Override
    public String toString() {
        return id;
    }

}
