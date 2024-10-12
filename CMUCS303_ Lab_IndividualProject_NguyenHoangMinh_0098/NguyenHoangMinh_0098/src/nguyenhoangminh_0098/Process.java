
package nguyenhoangminh_0098;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Process extends JFrame {
    private StudentList studentList = new StudentList();
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField nameField, gpaField, idField, dobField, majorField;
    private JTextField findByIdField, removeByIdField, updateByIdField;

    public Process() {
        setTitle("Student Management System");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for adding students
        JPanel inputPanel = new JPanel(new GridLayout(6, 2, 5, 5));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("GPA:"));
        gpaField = new JTextField();
        inputPanel.add(gpaField);

        inputPanel.add(new JLabel("ID:"));
        idField = new JTextField();
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Date of Birth:"));
        dobField = new JTextField();
        inputPanel.add(dobField);

        inputPanel.add(new JLabel("Major:"));
        majorField = new JTextField();
        inputPanel.add(majorField);

        JButton addButton = new JButton("Add Student");
        styleButton(addButton);
        inputPanel.add(addButton);

        add(inputPanel, BorderLayout.NORTH); // Input panel for adding students at the top

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        // Table for displaying all students
        String[] columnNames = {"ID", "Name", "GPA", "Date of Birth", "Major"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER); // Display All table at the bottom

        // Panel for Find, Remove, and Update (compact and consistent layout)
        JPanel controlPanel = new JPanel(new GridLayout(9, 2, 5, 5)); // Consistent grid layout

        // Find Student Section
        controlPanel.add(new JLabel("Find by ID:"));
        findByIdField = new JTextField();
        controlPanel.add(findByIdField);
        JButton findButton = new JButton("Find");
        styleButton(findButton);
        controlPanel.add(findButton);

        findButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                findStudentById();
            }
        });

        // Remove Student Section
        controlPanel.add(new JLabel("Remove by ID:"));
        removeByIdField = new JTextField();
        controlPanel.add(removeByIdField);
        JButton removeButton = new JButton("Remove");
        styleButton(removeButton);
        controlPanel.add(removeButton);

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeStudentById();
            }
        });

        // Update Student Section
        controlPanel.add(new JLabel("Update by ID:"));
        updateByIdField = new JTextField();
        controlPanel.add(updateByIdField);
        JButton updateButton = new JButton("Update");
        styleButton(updateButton);
        controlPanel.add(updateButton);

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateStudentById();
            }
        });

        add(controlPanel, BorderLayout.WEST); // Control panel with Find, Remove, and Update

        updateTable();
        updateTopGpaStudent();
    }

    private void addStudent() {
        String name = nameField.getText();
        double gpa = Double.parseDouble(gpaField.getText());
        String id = idField.getText();
        String dob = dobField.getText();
        String major = majorField.getText();

        Student student = new Student(name, gpa, id, dob, major);
        studentList.addStudent(student);

        updateTable();
        clearInputFields();
    }

    private void findStudentById() {
        String id = findByIdField.getText();
        Student student = studentList.findStudent(id);
        if (student != null) {
            JOptionPane.showMessageDialog(this, "Found student: " + student);
        } else {
            JOptionPane.showMessageDialog(this, "Student not found.");
        }
    }

    private void removeStudentById() {
        String id = removeByIdField.getText();
        studentList.removeStudent(id);
        updateTable();
    }

    private void updateStudentById() {
        String id = updateByIdField.getText();
        Student student = studentList.findStudent(id);
        if (student != null) {
            String newName = JOptionPane.showInputDialog("Enter new name:");
            double newGpa = Double.parseDouble(JOptionPane.showInputDialog("Enter new GPA:"));
            String newDob = JOptionPane.showInputDialog("Enter new date of birth:");
            String newMajor = JOptionPane.showInputDialog("Enter new major:");

            student.setName(newName);
            student.setGpa(newGpa);
            student.setDob(newDob);
            student.setMajor(newMajor);

            updateTable();
        } else {
            JOptionPane.showMessageDialog(this, "Student not found.");
        }
    }

    private void updateTable() {
        tableModel.setRowCount(0);
        for (Student student : studentList.getAllStudents()) {
            tableModel.addRow(new Object[]{student.getId(), student.getName(), student.getGpa(), student.getDob(), student.getMajor()});
        }
        updateTopGpaStudent();
    }

    private void updateTopGpaStudent() {
        Student topStudent = studentList.findTopGpaStudent();
        if (topStudent != null) {
            JOptionPane.showMessageDialog(this, "Top GPA student: " + topStudent.getName() + " (GPA: " + topStudent.getGpa() + ")");
        }
    }

    private void styleButton(JButton button) {
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    private void clearInputFields() {
        nameField.setText("");
        gpaField.setText("");
        idField.setText("");
        dobField.setText("");
        majorField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Process().setVisible(true);
            }
        });
    }
}
