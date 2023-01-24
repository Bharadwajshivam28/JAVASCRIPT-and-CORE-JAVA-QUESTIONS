class cellphone{
    public void ring(){
        System.out.println("Ringing... ! ");
    }
    public void vibrate(){
        System.out.println("Vibrating.... ! ");
    }
    public void call_friend(){
        System.out.println("Calling Mohan... ! ");
    }
}

public class Ques_02 {
    public static void main(String[] args) {
        cellphone iphone = new cellphone();
        iphone.ring();
        iphone.vibrate();
        iphone.call_friend();
    }
}

