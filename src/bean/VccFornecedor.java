package bean;
// Generated 09/12/2024 17:14:49 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VccFornecedor generated by hbm2java
 */
@Entity
@Table(name = "vcc_fornecedor",
         catalog = "db_viviane_carvalho"
)
public class VccFornecedor implements java.io.Serializable {

    private int vccIdFornecedor;
    private String vccNome;
    private Date vccDataNasc;
    private String vccEmail;
    private String vccNumeroTel;
    private String vccCnpj;
    private String vccEndereco;
    private String vccStatus;
    private String vccCep;
    private String vccCidade;
    private String vccEstado;
    private double vccPreco;
    private String vccQualidade;
    private int vccQuantidade;
    private Date vccPrazo;

    public VccFornecedor() {
    }

    public VccFornecedor(int vccIdFornecedor, String vccNome, String vccEmail, String vccNumeroTel, String vccCnpj, String vccEndereco, String vccStatus, String vccCep, String vccCidade, String vccEstado, int vccPreco, String vccQualidade, int vccQuantidade) {
        this.vccIdFornecedor = vccIdFornecedor;
        this.vccNome = vccNome;
        this.vccEmail = vccEmail;
        this.vccNumeroTel = vccNumeroTel;
        this.vccCnpj = vccCnpj;
        this.vccEndereco = vccEndereco;
        this.vccStatus = vccStatus;
        this.vccCep = vccCep;
        this.vccCidade = vccCidade;
        this.vccEstado = vccEstado;
        this.vccPreco = vccPreco;
        this.vccQualidade = vccQualidade;
        this.vccQuantidade = vccQuantidade;
    }

    @Id

    @Column(name = "vcc_idFornecedor", unique = true, nullable = false)
    public int getVccIdFornecedor() {
        return this.vccIdFornecedor;
    }

    public void setVccIdFornecedor(int vccIdFornecedor) {
        this.vccIdFornecedor = vccIdFornecedor;
    }

    @Column(name = "vcc_nome", nullable = false, length = 100)
    public String getVccNome() {
        return this.vccNome;
    }

    public void setVccNome(String vccNome) {
        this.vccNome = vccNome;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "vcc_dataNasc", length = 10)
    public Date getVccDataNasc() {
        return this.vccDataNasc;
    }

    public void setVccDataNasc(Date vccDataNasc) {
        this.vccDataNasc = vccDataNasc;
    }

    @Column(name = "vcc_email", nullable = false, length = 100)
    public String getVccEmail() {
        return this.vccEmail;
    }

    public void setVccEmail(String vccEmail) {
        this.vccEmail = vccEmail;
    }

    @Column(name = "vcc_numeroTel", nullable = false, length = 15)
    public String getVccNumeroTel() {
        return this.vccNumeroTel;
    }

    public void setVccNumeroTel(String vccNumeroTel) {
        this.vccNumeroTel = vccNumeroTel;
    }

    @Column(name = "vcc_cnpj", nullable = false, length = 14)
    public String getVccCnpj() {
        return this.vccCnpj;
    }

    public void setVccCnpj(String vccCnpj) {
        this.vccCnpj = vccCnpj;
    }

    @Column(name = "vcc_endereco", nullable = false, length = 105)
    public String getVccEndereco() {
        return this.vccEndereco;
    }

    public void setVccEndereco(String vccEndereco) {
        this.vccEndereco = vccEndereco;
    }

    @Column(name = "vcc_status", nullable = false, length = 20)
    public String getVccStatus() {
        return this.vccStatus;
    }

    public void setVccStatus(String vccStatus) {
        this.vccStatus = vccStatus;
    }

    @Column(name = "vcc_cep", nullable = false, length = 8)
    public String getVccCep() {
        return this.vccCep;
    }

    public void setVccCep(String vccCep) {
        this.vccCep = vccCep;
    }

    @Column(name = "vcc_cidade", nullable = false, length = 30)
    public String getVccCidade() {
        return this.vccCidade;
    }

    public void setVccCidade(String vccCidade) {
        this.vccCidade = vccCidade;
    }

    @Column(name = "vcc_estado", nullable = false, length = 2)
    public String getVccEstado() {
        return this.vccEstado;
    }

    public void setVccEstado(String vccEstado) {
        this.vccEstado = vccEstado;
    }

    @Column(name = "vcc_preco", nullable = false, precision = 10)
    public double getVccPreco() {
        return this.vccPreco;
    }

    public void setVccPreco(double vccPreco) {
        this.vccPreco = vccPreco;
    }

    @Column(name = "vcc_qualidade", nullable = false, length = 100)
    public String getVccQualidade() {
        return this.vccQualidade;
    }

    public void setVccQualidade(String vccQualidade) {
        this.vccQualidade = vccQualidade;
    }

    @Column(name = "vcc_quantidade", nullable = false)
    public int getVccQuantidade() {
        return this.vccQuantidade;
    }

    public void setVccQuantidade(int vccQuantidade) {
        this.vccQuantidade = vccQuantidade;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "vcc_prazo", length = 10)
    public Date getVccPrazo() {
        return this.vccPrazo;
    }

    public void setVccPrazo(Date vccPrazo) {
        this.vccPrazo = vccPrazo;
    }

    @Override
    public String toString() {
        return this.getVccNome();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VccFornecedor) {
            VccFornecedor fornecedor = (VccFornecedor) obj;
            if (fornecedor.getVccIdFornecedor() == this.getVccIdFornecedor()) {
                return true;
            }
        }
        return false;
    }

}
