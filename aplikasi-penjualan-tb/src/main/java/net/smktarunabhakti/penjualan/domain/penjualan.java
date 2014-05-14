/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author DELL
 */
public class penjualan implements Serializable {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy="uuid")
    private String id;
    
    @Column(name="waktu_transaksi")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date tgl;
    
    @Column(nullable=false)
    private String kasir;
    
    @Column(name="no_struk", nullable=false)
    private String noStruk;
    
    @ManyToMany(mappedBy="header")
    @Cascade(value= CascadeType.ALL)
    private List<PenjualanDetail>listPenjualanDetail= new ArrayList<PenjualanDetail>();
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKasir() {
        return kasir;
    }

    public void setKasir(String kasir) {
        this.kasir = kasir;
    }

    public String getNoStruk() {
        return noStruk;
    }

    public void setNoStruk(String noStruk) {
        this.noStruk = noStruk;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }
}
