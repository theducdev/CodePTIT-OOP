import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ExerciseGUI extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private ArrayList <String> data = new ArrayList<>();

    public ExerciseGUI() {
        setTitle("Exercise GUI");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tableModel = new DefaultTableModel(new String[]{"Data"}, 0);
        table = new JTable(tableModel);

        JButton readBtn = new JButton("Đọc từ file");
        JButton sortBtn = new JButton("Sắp xếp");
        JTextField fileNameField = new JTextField("Nhập tên file");


        readBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String fileName = fileNameField.getText();
                    BufferedReader reader = new BufferedReader(new FileReader(fileName));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        data.add(line);
                    }
                    reader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                refreshTable();
            }
        });

        sortBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(data);
                refreshTable();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(readBtn);
        buttonPanel.add(fileNameField);
        buttonPanel.add(sortBtn);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new JScrollPane(table));
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

    }

    private void refreshTable() {
        tableModel.setRowCount(0);

        for (String item : data) {
            tableModel.addRow(new Object[]{item});
        }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ExerciseGUI frame = new ExerciseGUI();
                frame.setVisible(true);
            }
        });
    }


}
