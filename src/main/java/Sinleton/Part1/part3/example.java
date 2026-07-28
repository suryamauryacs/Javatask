package Sinleton.Part1.part3;

import com.designpattern.day1.Samosa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class example {

    Samosa samosa = Samosa.getSomosa();
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));

    public example() throws IOException {
    }

}
