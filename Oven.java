public class Oven
{
    private int maxTemp;
    private int currentTemp;

    Oven(int m, int c)
    {
        if (m < 0 || m > 500) {
            maxTemp = 500;
        } else {
            maxTemp = m;
        }

        if (c < 0) {
            currentTemp = 0;
        } else if (c > maxTemp){
            currentTemp = maxTemp;
        } else {
            currentTemp = c;
        }
    }

    public int getMaxTemp() { return maxTemp; }
    public int getCurrentTemp() { return currentTemp;}
    public void turnOff() { currentTemp = 0; }
    public boolean isOn() { if (currentTemp > 0) {return true;} return false; }
    public void preheat(int temp) {if (temp > maxTemp) { currentTemp = maxTemp;} else if (!(temp <=0) { currentTemp = temp;}) }
    public String toString

}
