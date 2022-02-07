import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Frame extends JFrame {
    int number;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormatt;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    String time;
    JLabel dayLabel1;
    JLabel dateFormat1;
    String day;
    String date;
    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 300);
        this.setResizable(true);
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormatt = new SimpleDateFormat("EEEE MMMMM");
        dateFormat = new SimpleDateFormat("MM-dd-yyyy");

        timeLabel = new JLabel();
        time = timeFormat.format(Calendar.getInstance().getTime());

        timeLabel.setText(time);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x091C99));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
        dayLabel1 = new JLabel();
        dayLabel1.setFont(new Font("Ink Free",Font.PLAIN,35));


        dateFormat1 = new JLabel();
        dateFormat1.setFont(new Font("Ink Free",Font.PLAIN,40));


        this.setVisible(true);
        this.add(timeLabel);
        this.add(dayLabel1);
        this.add(dateFormat1);
                setTime();



    }


public void setTime(){
    while(true) {
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);

        day = dayFormatt.format(Calendar.getInstance().getTime());
        dayLabel1.setText(day);

        date = dateFormat.format(Calendar.getInstance().getTime());
        dateFormat1.setText(date);





        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();




        }
    }
    };














    Calendar calendar = new Calendar() {
        @Override
        protected void computeTime() {

        }

        @Override
        protected void computeFields() {

        }

        @Override
        public void add(int field, int amount) {

        }

        @Override
        public void roll(int field, boolean up) {

        }

        @Override
        public int getMinimum(int field) {
            return 0;
        }

        @Override
        public int getMaximum(int field) {
            return 0;
        }

        @Override
        public int getGreatestMinimum(int field) {
            return 0;
        }

        @Override
        public int getLeastMaximum(int field) {
            return 0;
        }

    };




}