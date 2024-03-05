import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JajarGenjangCalculator extends JFrame {
    private JTextField txtPanjang, txtLebar;
    private JButton btnHitung;
    private JLabel lblHasil;

    public JajarGenjangCalculator() {
        setTitle("Jajar Genjang Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel lblPanjang = new JLabel("Panjang:");
        txtPanjang = new JTextField();
        JLabel lblLebar = new JLabel("Lebar:");
        txtLebar = new JTextField();
        btnHitung = new JButton("Hitung");
        lblHasil = new JLabel("Hasil:");

        panel.add(lblPanjang);
        panel.add(txtPanjang);
        panel.add(lblLebar);
        panel.add(txtLebar);
        panel.add(btnHitung);
        panel.add(lblHasil);

        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungLuasDanKeliling();
            }
        });

        add(panel);
        setVisible(true);
    }

    private void hitungLuasDanKeliling() {
        try {
            double panjang = Double.parseDouble(txtPanjang.getText());
            double lebar = Double.parseDouble(txtLebar.getText());

            double luas = panjang * lebar;
            double keliling = 2 * (panjang + lebar);

            lblHasil.setText("Luas: " + luas + ", Keliling: " + keliling);
        } catch (NumberFormatException ex) {
            lblHasil.setText("Masukkan nilai yang valid untuk panjang dan lebar");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JajarGenjangCalculator();
            }
        });
    }
}
