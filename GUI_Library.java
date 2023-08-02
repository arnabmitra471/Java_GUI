import javax.swing.*;
class LMS_Gui
{
    final JFrame fr;
    final JButton btn;
    final JLabel user_name,no_books,book_name,issue_date,roll_no,dept,semester;
    final JTextField username_inp,no_booksInp,roll_noInp;
    final JComboBox book_nameList,semesterList,deptInp;

    LMS_Gui()
    {
        fr = new JFrame("Books issue form");
        fr.setSize(1000,700);
        fr.setLayout(null);
        fr.setVisible(true);
        btn = new JButton("Submit");
        btn.setBounds(200,400,150,30);
        fr.add(btn);
        
        user_name = new JLabel("Username: ");
        no_books = new JLabel("No. of books: ");
        user_name.setBounds(50,50,100,30);
        no_books.setBounds(50,100,100,30);
        book_name = new JLabel("Book Name: ");
        book_name.setBounds(50,150,100,30);
        issue_date = new JLabel("Date of Issue: ");
        issue_date.setBounds(50,200,100,30);
        roll_no = new JLabel("Roll No: ");
        roll_no.setBounds(50,250,100,30);
        dept = new JLabel("Choose your dept: ");
        dept.setBounds(50,300,150,30);
        semester = new JLabel("Semester: ");
        semester.setBounds(50,350,100,30);
        username_inp = new JTextField();
        username_inp.setBounds(200,52,150,30);
        
        no_booksInp = new JTextField();
        no_booksInp.setBounds(200,100,150,30);
        
        roll_noInp = new JTextField();
        roll_noInp.setBounds(200,250,150,30);

        String books[] = {"Science","Computer","Maths","History","Geography"};
        book_nameList = new JComboBox<>(books);
        book_nameList.setBounds(200,150,150,30);

        String deptList[] = {"CST","Electrical","Civil","Mechanical","Automobile","Biology","Chemistry","Physics"};
        deptInp = new JComboBox<>(deptList);
        deptInp.setBounds(200,300,150,30);
        

        String sem[] = {"1st","2nd","3rd","4th","5th","6th"};
        semesterList = new JComboBox<>(sem);
        semesterList.setBounds(200,350,150,30);

        fr.add(user_name);
        fr.add(no_books);
        fr.add(book_name);
        fr.add(issue_date);
        fr.add(roll_no);
        fr.add(dept);
        fr.add(semester);
        fr.add(username_inp);
        fr.add(no_booksInp);
        fr.add(roll_noInp);
        fr.add(book_nameList);
        fr.add(semesterList);
        fr.add(deptInp);
    }
    public static void main(String args[])
    {
        new LMS_Gui();
    }
}