import java.awt.*;

class MyFrame extends Frame
{
    MenuBar mbr;
    Menu m_file, m_font, m_color;
    MenuItem mi_open, mi_close, mi_ariel, mi_roman, mi_red, mi_green, mi_blue;
    Panel p_main, p1, p2, p3,p1_main, p_gender, p_mstatus;
    Choice ch;
    Label lbl_fn, lbl_ln, lbl_gender, lbl_mstatus, lbl_hobies, lbl_comment;
    TextField txt_fn, txt_ln;
    CheckboxGroup cbg_gender, cbg_mstatus;
    Checkbox cb_male, cb_female, cb_married, cb_unmarried, cb_singing, cb_eating, cb_dancing, cb_studying;
    TextArea txt_comment;
    Button btn_ok;

    public MyFrame()
    {
        setSize(600,450);
        // setLayout(new FlowLayout());
        setTitle("this is my first frame");
        setLayout(null);
        setBackground(Color.red);

        mbr = new MenuBar();

        m_file = new Menu("File");
        m_font = new Menu("Font");
        m_color = new Menu("Color");
        mi_open = new MenuItem("Open");

        mi_close = new MenuItem("Close");
        mi_ariel = new MenuItem("Ariel");
        mi_roman = new MenuItem("Roman");
        mi_red = new MenuItem("Red");
        mi_green = new MenuItem("Green");
        mi_blue = new MenuItem("Blue");

        p_main = new Panel();
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        ch = new Choice();

        ch = new Choice();
        ch.add("Choose");
        ch.add("option1");
        ch.add("option2");
        ch.add("option3");
        


        lbl_fn = new Label("First Name");
        lbl_ln = new Label("Last Name");
        lbl_gender = new Label("Gender");
        lbl_mstatus = new Label("Married Status");
        lbl_hobies = new Label("Hobbies");
        lbl_comment = new Label("Comment");

        txt_fn = new TextField(15);
        txt_ln = new TextField(15);
        txt_comment = new TextArea(4,50);

        cbg_gender = new CheckboxGroup();
        cbg_mstatus = new CheckboxGroup();

        cb_male = new Checkbox("Male",true,cbg_gender);
        cb_female = new Checkbox("Female",false,cbg_gender);
        cb_married = new Checkbox("Married",true,cbg_mstatus);
        cb_unmarried = new Checkbox("Unmarried",false,cbg_mstatus);
        cb_singing = new Checkbox("Singing");
        cb_eating = new Checkbox("Eating");
        cb_dancing = new Checkbox("Dancing");
        cb_studying = new Checkbox("Studying");

        btn_ok = new Button("OK");
        btn_ok.setBounds(250,270,50,20);

        m_file.add(mi_open);
        m_file.add(mi_close);
        m_font.add(mi_ariel);
        m_font.add(mi_roman);
        m_color.add(mi_red);
        m_color.add(mi_green);
        m_color.add(mi_blue);

        mbr.add(m_file);
        mbr.add(m_font);
        mbr.add(m_color);

        setMenuBar(mbr);
        
        p_main = new Panel();
        p_main.setBounds(15,80,570,355);
        p_main.setBackground(Color.green);
        p_main.setLayout(null);
        // p_main.setLayout(new FlowLayout());

        p1 = new Panel();
        p1.setBounds(10,10,550,100);
        p1.setBackground(Color.white);
        p1.setLayout(null);
        // p1.setSize(550,100);

        p2 = new Panel();
        p2.setBounds(10,115,550,30);
        p2.setBackground(Color.red);

        p3 = new Panel();
        p3.setBounds(10,150,550,100);
        p3.setBackground(Color.white);
        
        p_gender = new Panel();
        // p_gender.setSize(550,20);
        p_gender.setBounds(10,35,540,20);
        // p_gender.setBackground(Color.white);
        // p_gender.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        
        p_mstatus = new Panel();
        p_mstatus.setBounds(10,65,540,20);
        // p_mstatus.setBackground(Color.white);
        
        p1_main = new Panel();
        p1_main.setBounds(10,10,540,30);

        p_gender.add(lbl_gender);
        p_gender.add(cb_male);
        p_gender.add(cb_female);
        p_mstatus.add(lbl_mstatus);
        p_mstatus.add(cb_married);
        p_mstatus.add(cb_unmarried);
        
        p1_main.add(ch);
        p1_main.add(lbl_fn);
        p1_main.add(txt_fn);
        p1_main.add(lbl_ln);
        p1_main.add(txt_ln);
        p1.add(p1_main);
        p1.add(p_gender);
        p1.add(p_mstatus);
        // p1.add(lbl_gender);
        // p1.add(cb_male);
        // p1.add(cb_female);
        // p1.add(lbl_mstatus);
        // p1.add(cb_married);
        // p1.add(cb_unmarried);


        p2.add(lbl_hobies);
        p2.add(cb_singing);
        p2.add(cb_eating);
        p2.add(cb_dancing);
        p2.add(cb_studying);

        p3.add(lbl_comment);
        p3.add(txt_comment);

        p_main.add(p1);
        p_main.add(p2);
        p_main.add(p3);
        p_main.add(btn_ok);

        add(p_main);

        setVisible(true);
    }
    
}




public class FirstUI
{
    public static void main(String [] args)
    {
        new MyFrame();
    }
}