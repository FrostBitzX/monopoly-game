//StudentID: 6510450879
//Name: Mr.Yossawaj Bonsrithananon

import java.util.Random;
public class Die {
    private int faceValue;
    Random rand = new Random();
    public int getFaceValue(){
        return faceValue;
    }
    public void roll(){
        this.faceValue = rand.nextInt(1,7); //score 1-6
    }
}
