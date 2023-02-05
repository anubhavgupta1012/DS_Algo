package designPatterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
public class VehiclePrototype implements Cloneable {
    private int tyre;
    private List<String> color;
    private int exShowroom;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        VehiclePrototype prototype = new VehiclePrototype(4, Arrays.asList("BLACK", "BLUE"), 100000);
        VehiclePrototype clone = (VehiclePrototype) prototype.clone();
        clone.setTyre(0);
        clone.setColor(Collections.EMPTY_LIST);

        System.out.println("CLONED " + clone);
        System.out.println("ORIGINAL " + prototype);

        System.out.println("CLONED " + clone.hashCode());
        System.out.println("ORIGINAL " + prototype.hashCode());
    }
}
