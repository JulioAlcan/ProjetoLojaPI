package DAO;

import MODEL.ElementosCliente;
import MODEL.ElementosProdutos;
import MODEL.ElementosUsuarios;
import MODEL.ElementosVendas;
import java.util.ArrayList;

public class SimulaDB {

    private static SimulaDB mockdb;
    private ArrayList<ElementosUsuarios> listaUsuarios;
    private ArrayList<ElementosCliente> listaCliente;
    private ArrayList<ElementosProdutos> listaProduto;
    private ArrayList<ElementosVendas> listaVendas;

    private SimulaDB() {

        listaUsuarios = new ArrayList<ElementosUsuarios>();
        listaCliente = new ArrayList<ElementosCliente>();
        listaProduto = new ArrayList<ElementosProdutos>();
        listaVendas = new ArrayList<ElementosVendas>();

    }

    public static synchronized SimulaDB getInstance() {
        if (mockdb == null) {
            mockdb = new SimulaDB();
        }

        return mockdb;
    }
//USUARIO///////////////////////////////////////////////////////////////////

    public boolean InserirUsuario(ElementosUsuarios listUser) {
        listaUsuarios.add(listUser);

        return true;
    }

    public ArrayList<ElementosUsuarios> getUser() {
        return this.listaUsuarios;
    }

    public boolean SalvarUse(ElementosUsuarios c) {
        listaUsuarios.add(c);

        return true;
    }

    public boolean AtualizarUser(ElementosUsuarios p) {
        for (ElementosUsuarios item : listaUsuarios) {
            if (item.getID() == p.getID()) {
                item.setTxtNome(p.getTxtNome());
                item.setTxtCPF(p.getTxtCPF());
                item.setTxtUser(p.getTxtUser());
                item.setTxtEmail(p.getTxtEmail());
                item.setTxtSenhaAdmin(p.getTxtSenhaAdmin());
                item.setTxtSenha(p.getTxtSenha());
            }
        }

        return true;
    }

    public boolean ExcluirUsuario(int i) {
        ElementosUsuarios usuarioExcluir = new ElementosUsuarios();
        boolean existeNaLista = false;
        for (ElementosUsuarios u : listaUsuarios) {

            if (u.getID() == i) {
                usuarioExcluir = u;
                existeNaLista = true;
            }
        }

        if (existeNaLista) {
            listaUsuarios.remove(usuarioExcluir);
        }

        return true;
    }

//CLIENTE///////////////////////////////////////////////////////////////////
    public boolean InserirCliente(ElementosCliente listCli) {
        listaCliente.add(listCli);

        return true;
    }

    public ArrayList<ElementosCliente> getCliente() {
        return this.listaCliente;
    }

    public boolean SalvarCliente(ElementosCliente c) {
        listaCliente.add(c);

        return true;
    }

    public boolean AtualizarCliente(ElementosCliente c) {
        for (ElementosCliente it : listaCliente) {
            if (it.getIdCliente() == c.getIdCliente()) {
                it.setCliNome(c.getCliNome());
                it.setCliCPF(c.getCliCPF());
                it.setCliRG(c.getCliRG());
                it.setListSexo(c.getListSexo());
                it.setCliNascimento(c.getCliNascimento());
                it.setCliEmail(c.getCliEmail());
                it.setListEstadoCivil(c.getListEstadoCivil());
                it.setCliCep(c.getCliCep());
                it.setCliNumeroResidencia(c.getCliNumeroResidencia());
                it.setCliComplementoResidencia(c.getCliComplementoResidencia());
                it.setCliEndercoRua(c.getCliEndercoRua());
                it.setCliBairro(c.getCliBairro());
                it.setListUF(c.getListUF());
                it.setCliCidade(c.getCliCidade());
                it.setCliCelular(c.getCliCelular());
                it.setCliTelResidencial(c.getCliTelResidencial());

            }
        }

        return true;
    }

    public boolean ExcluirCliente(int i) {
        ElementosCliente clienteExcluir = new ElementosCliente();
        boolean existeNaLista = false;
        for (ElementosCliente c : listaCliente) {

            if (c.getIdCliente() == i) {
                clienteExcluir = c;
                existeNaLista = true;
            }
        }

        if (existeNaLista) {
            listaCliente.remove(clienteExcluir);
        }

        return true;
    }

//PRODUTO///////////////////////////////////////////////////////////////////    
    public boolean InserirProduto(ElementosProdutos listProd) {
        listaProduto.add(listProd);

        return true;
    }

    public ArrayList<ElementosProdutos> getProduto() {
        return this.listaProduto;
    }

    public boolean SalvarProduto(ElementosProdutos p) {
        listaProduto.add(p);

        return true;
    }

    public boolean AtualizarProduto(ElementosProdutos p) {
        for (ElementosProdutos it : listaProduto) {
            if (it.getID() == p.getID()) {
                it.setTxtNomeProd(p.getTxtNomeProd());
                it.setTxtTipo(p.getTxtTipo());
                it.setTxtPreco(p.getTxtPreco());
                it.setQtdProd(p.getQtdProd());

            }
        }

        return true;
    }

    public boolean ExcluirProduto(int i) {
        ElementosProdutos ProdutoExcluir = new ElementosProdutos();
        boolean existeNaLista = false;
        for (ElementosProdutos p : listaProduto) {

            if (p.getID() == i) {
                ProdutoExcluir = p;
                existeNaLista = true;
            }
        }

        if (existeNaLista) {
            listaProduto.remove(ProdutoExcluir);
        }

        return true;
    }

    public boolean InserirVendas(ElementosVendas listVend) {
        listaVendas.add(listVend);

        return true;
    }

    public ArrayList<ElementosVendas> getVendas() {
        return this.listaVendas;
    }

    public boolean SalvarVendas(ElementosVendas v) {
        listaVendas.add(v);

        return true;
    }

    public boolean AtualizarVendas(ElementosVendas v) {
        for (ElementosVendas it : listaVendas) {
            if (it.getTxtIdCliente() == v.getTxtIdCliente()) {
                it.setTxtIdCliente(v.getTxtIdCliente());
                it.setTxtQtd(v.getTxtQtd());
                it.setTxtValor(v.getTxtValor());

            }
        }

        return true;
    }

    public boolean ExcluirVendas(int i) {
        ElementosVendas VendasExcluir = new ElementosVendas();
        boolean existeNaLista = false;
        for (ElementosVendas v : listaVendas) {

            if (v.getTxtIdCliente() == i) {
                VendasExcluir = v;
                existeNaLista = true;
            }
        }

        if (existeNaLista) {
            listaVendas.remove(VendasExcluir);
        }

        return true;
    }
}
