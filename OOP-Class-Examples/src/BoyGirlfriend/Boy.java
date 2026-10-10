package BoyGirlfriend;

public class Boy {
    private GirlFriend girlfriend = new LekkiBabe();

    public void setGirlfriend(GirlFriend girlfriend) {
        this.girlfriend = girlfriend;
    }

    public void cookForMe(){
        girlfriend.cook();
    }
    public void cookForMe(String food){
        girlfriend.cook(food);
    }


}
