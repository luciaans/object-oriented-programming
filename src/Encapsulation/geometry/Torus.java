package Encapsulation.geometry;

public class Torus {

    byte r;
    private byte R;
    protected float PI = 3.14f;

    public void setR(int R){
        this.R = (byte) R;
    }

    public byte getR(){
        return R;
    }
}