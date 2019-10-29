package MODEL;

public class ElementosUsuarios {

    private static int QtdUsuario;
    private int ID;
    private String txtNome;
    private String txtCPF;
    private String txtEmail;
    private String txtUser;
    private String txtSenha;
    private String txtSenhaAdmin;

    public ElementosUsuarios() {
        QtdUsuario++;
        this.ID = QtdUsuario;

    }

    public ElementosUsuarios( String txtNome, String txtCPF, String txtEmail, String txtUser, String txtSenha, String txtSenhaAdmin) {
        QtdUsuario++;
        this.ID = QtdUsuario;
        this.txtNome = txtNome;
        this.txtCPF = txtCPF;
        this.txtEmail = txtEmail;
        this.txtUser = txtUser;
        this.txtSenha = txtSenha;
        this.txtSenhaAdmin = txtSenhaAdmin;
    }

    public ElementosUsuarios(int ID, String ptxtNome, String ptxtCPF, String ptxtEmail, String ptxtUser, String ptxtSenha, String ptxtSenhaAdmin) {
        this.ID = ID;
        this.txtNome = ptxtNome;
        this.txtCPF = ptxtCPF;
        this.txtEmail = ptxtEmail;
        this.txtUser = ptxtUser;
        this.txtSenha = ptxtSenha;
        this.txtSenhaAdmin = ptxtSenhaAdmin;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(String txtNome) {
        this.txtNome = txtNome;
    }

    public String getTxtCPF() {
        return txtCPF;
    }

    public void setTxtCPF(String txtCPF) {
        this.txtCPF = txtCPF;
    }

    public String getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(String txtEmail) {
        this.txtEmail = txtEmail;
    }

    public String getTxtUser() {
        return txtUser;
    }

    public void setTxtUser(String txtUser) {
        this.txtUser = txtUser;
    }

    public String getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(String txtSenha) {
        this.txtSenha = txtSenha;
    }

    public String getTxtSenhaAdmin() {
        return txtSenhaAdmin;
    }

    public void setTxtSenhaAdmin(String txtSenhaAdmin) {
        this.txtSenhaAdmin = txtSenhaAdmin;
    }

}
