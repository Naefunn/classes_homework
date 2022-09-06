public class WaterBottle {
    private int volume;

    public WaterBottle(int _volume){
        this.volume = _volume;
    }

    public int drinkWater(){
        return this.volume - 10;
    }

    public int emptyBottle(){
        return this.volume = 0;
    }

    public int fillBottle(){
        return this.volume = 100;
    }
}
