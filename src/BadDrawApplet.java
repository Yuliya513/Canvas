public class BadDrawApplet {
    public void init(){
        add (new Button ("Press me"));
    }

    public void paint (Graphics h){
       h.drawLine(10,40,50,60);
    }
}
