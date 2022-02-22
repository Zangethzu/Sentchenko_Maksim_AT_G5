package basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int newInt) {
        return newInt * 3;
    }

    public long returnNewLong(long newLong) {
        return newLong - 4;
    }

    public char returnNewChar(char newChar) {
        return (char) (newChar + newChar);
    }

    public float returnNewFloat(float newFloat) {
        return newFloat / 2;
    }

    public double returnNewDouble(double newDouble) {
        return newDouble + 8;
    }

    public short returnNewShort(short newShort) {
        return (short) (newShort - 1);
    }

    public byte returnNewByte(byte newByte) {
        return (byte) (newByte * 2);
    }

    public boolean returnNewBoolean(boolean newBoolean) {
        return !newBoolean;
    }

}
