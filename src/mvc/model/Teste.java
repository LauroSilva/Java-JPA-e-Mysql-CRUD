/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Again
 */
@Entity
@Table(name = "teste")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Teste.findAll", query = "SELECT t FROM Teste t"),
    @NamedQuery(name = "Teste.findByIdteste", query = "SELECT t FROM Teste t WHERE t.idteste = :idteste"),
    @NamedQuery(name = "Teste.findByNome", query = "SELECT t FROM Teste t WHERE t.nome = :nome"),
    @NamedQuery(name = "Teste.findBySobreNome", query = "SELECT t FROM Teste t WHERE t.sobreNome = :sobreNome"),
    @NamedQuery(name = "Teste.findByIdade", query = "SELECT t FROM Teste t WHERE t.idade = :idade")
})
public class Teste implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idteste")
    private Integer idteste;
    @Column(name = "nome")
    private String nome;
    @Column(name = "sobreNome")
    private String sobreNome;
    @Column(name = "idade")
    private String idade;
    @Lob
    @Column(name = "img")
    private byte[] img;

    public Teste()
    {
    }

    public Teste(Integer idteste)
    {
        this.idteste = idteste;
    }

    public Integer getIdteste()
    {
        return idteste;
    }

    public void setIdteste(Integer idteste)
    {
        this.idteste = idteste;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSobreNome()
    {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome)
    {
        this.sobreNome = sobreNome;
    }

    public String getIdade()
    {
        return idade;
    }

    public void setIdade(String idade)
    {
        this.idade = idade;
    }

    public byte[] getImg()
    {
        return img;
    }

    public void setImg(byte[] img)
    {
        this.img = img;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (idteste != null ? idteste.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teste))
        {
            return false;
        }
        Teste other = (Teste) object;
        if ((this.idteste == null && other.idteste != null) || (this.idteste != null && !this.idteste.equals(other.idteste)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "model.Teste[ idteste=" + idteste + " ]";
    }
    
}
