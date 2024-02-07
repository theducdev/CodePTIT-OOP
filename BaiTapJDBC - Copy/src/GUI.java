import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.*;

public class GUI extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField maSVField, hoTenField, lopField, gpaField;

    public GUI() {
        setTitle("Student Management System");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tableModel = new DefaultTableModel(new String[] { "Mã SV", "Họ tên", "Lớp", "GPA" }, 0);
        table = new JTable(tableModel);

        maSVField = new JTextField(10);
        hoTenField = new JTextField(10);
        lopField = new JTextField(10);
        gpaField = new JTextField(10);

        JButton hienThiBtn = new JButton("Hiển thị");
        JButton themBtn = new JButton("Thêm mới");
        JButton capNhatBtn = new JButton("Cập nhật");
        JButton xoaBtn = new JButton("Xóa");
        JButton resetBtn = new JButton("Reset");

        // Thêm sự kiện cho nút "Hiển thị"
hienThiBtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        fetchDataFromDatabase();
    }
});

// Thêm sự kiện cho nút "Thêm mới"
themBtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        addDataToDatabase();
    }
});

// Thêm sự kiện cho nút "Cập nhật"
capNhatBtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        updateDataInDatabase();
    }
});

// Thêm sự kiện cho nút "Xóa"
xoaBtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        deleteDataFromDatabase();
    }
});



        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Mã SV:"));
        inputPanel.add(maSVField);
        inputPanel.add(new JLabel("Họ tên:"));
        inputPanel.add(hoTenField);
        inputPanel.add(new JLabel("Lớp:"));
        inputPanel.add(lopField);
        inputPanel.add(new JLabel("GPA:"));
        inputPanel.add(gpaField);
        inputPanel.add(new JLabel()); // Empty label for alignment
        inputPanel.add(new JLabel()); // Empty label for alignment

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(hienThiBtn);
        buttonPanel.add(themBtn);
        buttonPanel.add(capNhatBtn);
        buttonPanel.add(xoaBtn);
        buttonPanel.add(resetBtn);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
        contentPane.add(inputPanel, BorderLayout.WEST);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }

    // Các phương thức fetchDataFromDatabase, addDataToDatabase,
    // updateDataInDatabase, deleteDataFromDatabase cần được triển khai
    // để thực hiện thao tác với cơ sở dữ liệu. Đây chỉ là các phương thức giả định
    // để minh họa.

    private void fetchDataFromDatabase() {
        // Giả định: Lấy dữ liệu từ cơ sở dữ liệu và hiển thị trên bảng
        Vector<Vector<String>> data = new Vector<>();
        // Logic lấy dữ liệu từ cơ sở dữ liệu
        Vector<String> columnNames = new Vector<>(Arrays.asList("Mã SV", "Họ tên", "Lớp", "GPA"));
        tableModel.setDataVector(data, columnNames);

    }

    private void addDataToDatabase() {
        // Giả định: Thêm dữ liệu vào cơ sở dữ liệu và hiển thị trên bảng
        String maSV = maSVField.getText();
        String hoTen = hoTenField.getText();
        String lop = lopField.getText();
        String gpa = gpaField.getText();

        // Logic thêm dữ liệu vào cơ sở dữ liệu

        // Hiển thị lại dữ liệu trên bảng
        fetchDataFromDatabase();
    }

    private void updateDataInDatabase() {
        // Giả định: Cập nhật dữ liệu trong cơ sở dữ liệu và hiển thị trên bảng
        String maSV = maSVField.getText();
        String hoTen = hoTenField.getText();
        String lop = lopField.getText();
        String gpa = gpaField.getText();

        // Logic cập nhật dữ liệu trong cơ sở dữ liệu

        // Hiển thị lại dữ liệu trên bảng
        fetchDataFromDatabase();
    }

    private void deleteDataFromDatabase() {
        // Giả định: Xóa dữ liệu từ cơ sở dữ liệu và hiển thị trên bảng
        String maSV = maSVField.getText();

        // Logic xóa dữ liệu từ cơ sở dữ liệu

        // Hiển thị lại dữ liệu trên bảng
        fetchDataFromDatabase();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI frame = new GUI();
                frame.setVisible(true);
            }
        });
    }
}
