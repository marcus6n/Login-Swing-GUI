import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {

    private static JTextField campoUsuario;
    private static JPasswordField campoSenha;
    private static JLabel mensagem; // Tornar mensagem uma variável de instância

    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha primeira tela Swing GUI");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        frame.add(painel);
        adicionarComponentes(painel);

        frame.setVisible(true);
    }

    private static void adicionarComponentes(JPanel painel) {
        painel.setLayout(null);

        JLabel rotuloUsuario = new JLabel("Usuário");
        rotuloUsuario.setBounds(10, 20, 80, 25);
        painel.add(rotuloUsuario);

        campoUsuario = new JTextField(20);
        campoUsuario.setBounds(100, 20, 165, 25);
        painel.add(campoUsuario);

        JLabel rotuloSenha = new JLabel("Senha");
        rotuloSenha.setBounds(10, 50, 80, 25);
        painel.add(rotuloSenha);

        campoSenha = new JPasswordField(20);
        campoSenha.setBounds(100, 50, 165, 25);
        painel.add(campoSenha);

        JButton botaoLogin = new JButton("Login");
        botaoLogin.setBounds(10, 80, 80, 25);
        botaoLogin.addActionListener(new GUI());
        painel.add(botaoLogin);

        mensagem = new JLabel(); // Crie uma instância de JLabel
        mensagem.setBounds(10, 110, 250, 25); // Defina as dimensões apropriadas
        painel.add(mensagem);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = campoUsuario.getText();
        String password = new String(campoSenha.getPassword());

        if (user.equals("admin") && password.equals("12345")) {
            mensagem.setText("Logado com sucesso!");
        } else {
            mensagem.setText("Usuário ou senha incorretos!");
        }
    }
}
