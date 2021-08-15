public class Main {
    public static void main(String[] args) throws Exception {

        Robot r = new Robot();
        r.goStraight();
        r.goRight();  //execution stops here..
        r.goLeft();
        r.goBack();

    }
}



class Robot{
    public void goStraight(){
        System.out.println("going straight");
    }

    public void goLeft() throws Exception {
        throw new Exception("STOP");
    }

    public void goRight() throws Exception {
        throw new Exception("STOP");
    }

    public void goBack() throws Exception {
        throw new Exception("STOP");
    }
}